/** Angular application creation and route configurations **/
var app = angular.module("profileApp", ["ngTagsInput","ngRoute","ngLoadingSpinner","angularUtils.directives.dirPagination","ui.bootstrap"]);
app.config(function($routeProvider,$locationProvider) {
    $routeProvider
    .when('/', {
        templateUrl : '/fragment/account-summary.html',
        controller:"accountsSummaryController"
    }).when("/account", {
        templateUrl : '/fragment/account.html',
	    controller:"accountsController"	
    }).when('/termdeposit', {
        templateUrl : '/fragment/termDeposits.html',
	    controller:"termDepositsController"
    }).when("/account-summary", {
        templateUrl : '/fragment/account-summary.html',
	    controller:"accountsSummaryController"	
    }).when("/loan", {
    	templateUrl : '/fragment/loan.html',
    	controller:"loanController"	
    }).when("/loan-details", {
    	templateUrl : '/fragment/loan-details.html',
    	controller:"loanMoreInfoController"	
    }).when("/tempDeposite-details", {
    	templateUrl : '/fragment/tempdeposite-details.html',
    	controller:"tempDepositeMoreInfoController"	
    }).when("/statement", {
    	templateUrl : '/fragment/statement.html',
    	controller:"statementController"	
    }).when("/biller", {
    	templateUrl : '/fragment/biller.html',
    	controller:'billerController'	
    }).when("/add-biller", {
    	templateUrl : '/fragment/add-biller.html',
    	controller:'addBillerController'		
    }).when("/paybills", {
    	templateUrl : '/fragment/paybills.html',
    	controller:'paybillController'
    }).when("/transfermoney", {
    	templateUrl : '/fragment/transfermoney.html',
    	controller:'transfermoneyController'	
    }).when("/addpayee", {
    	templateUrl : '/fragment/add-payee-details.html',
    	controller:'addPayeeController'	
    }).when("/balance", {
    	templateUrl : '/fragment/balance.html',
    	controller:'jsonCtrl1'	
    }).when("/new-loan-account-opening", {
    	templateUrl : '/fragment/loan-opening.html',
    	controller:'newLoanAccountOpening'	
    }).when("/edit-profile", {
    	templateUrl : '/fragment/edit-profile.html'
    }).when("/success", {
        templateUrl : '/fragment/success.html',
        controller:'successController'
    }).when("/error", {
        templateUrl : '/fragment/error.html',
        controller:'errorController'
    }).otherwise({
	   redirectTo : '/oops',
	   templateUrl : '/fragment/oops.html'
    });
});

app.controller("loanController", function($scope,$http,sharedProperties,$window) {
	$http.get("/user/loan/").success(function(data,status) {
		 $scope.loanInfo=data;		
		 var options = {container: "#loan",label: "label",width: 150,height: 150,type: "liquid",percentage: function (d) {  return d.count/100;}, size: "Remaining amount" };
		// var data = [{"label": "Loan","Remaining amount": parseFloat($scope.loanInfo.totalBorrowing)-parseFloat($scope.loanInfo.currentOutStanding),"count": 100-Math.round(((parseFloat($scope.loanInfo.totalBorrowing)-parseFloat($scope.loanInfo.currentOutStanding))/parseFloat($scope.loanInfo.totalBorrowing))*100),"tipo": "loan","year": 2017}]; 
		$scope.remaingAmount=parseFloat($scope.loanInfo.totalBorrowing)-parseFloat($scope.loanInfo.currentOutStanding);
		if( $scope.remaingAmount==0){
			$scope.remaingAmount=0.1;
		} 
		var data = [{"label": "Loan","Remaining amount": parseFloat($scope.remaingAmount),"count":100-Math.round(((parseFloat($scope.loanInfo.totalBorrowing)-parseFloat($scope.loanInfo.currentOutStanding))/parseFloat($scope.loanInfo.totalBorrowing))*100),"tipo": "loan","year": 2017}];

		 var viz = new BubbleChart(options);
		 viz.data(data);
		 $scope.select_prop_nbrAccounts = [];
		 $scope.customerId=$scope.loanInfo.customerId;
	        angular.forEach($scope.loanInfo.nbrAccounts, function(name, index) {
				$scope.select_prop_nbrAccounts.push({"value":name,"text":name});
		 });
	     $scope.nbrAccount=$scope.select_prop_nbrAccounts[0].value;
	     onChangeNbrAccountId();
	}).error(function(data,status) {
		 throw { message: 'error message',status:status};
	});	
	
	$scope.onAccountChange=function(){
		if($scope.nbrAccount!=undefined){
			onChangeNbrAccountId();
		}
	}
	
	function onChangeNbrAccountId(){
		$http.get("/user/transactionactivity/lastfive/"+$scope.customerId+"/"+$scope.nbrAccount).success(function(data,status) {
			$scope.transactionInfos =data;		
		}).error(function(data,status) {
			 throw { message: 'error message',status:status};
		});	
	}
	
	$scope.loanMoreInfo=function(loanMoreInfo){
		sharedProperties.setProperty(loanMoreInfo);
		$window.location.href ='#/loan-details';
	}
	
});


app.directive('ngRightClick', function($parse) {
    return function(scope, element, attrs) {
        var fn = $parse(attrs.ngRightClick);
        element.bind('contextmenu', function(event) {
            scope.$apply(function() {
                event.preventDefault();
                fn(scope, {$event:event});
            });
        });
    };
});

app.controller("loanMoreInfoController", function($scope,$http,sharedProperties) {

	$scope.loanMoreInfo=sharedProperties.getProperty();

});

app.controller("tempDepositeMoreInfoController", function($scope,$http,sharedProperties) {

	$scope.tempDepositeMoreInfo=sharedProperties.getProperty();

});

app.controller("addPayeeController",function($scope,$http,$window,sharedProperties){
	$scope.internal_confirm=true;
	$scope.domestic_confirm=true;
	$scope.international_confirm=true;
	$scope.internal_transfer=false;
	$scope.domestic_transfer=false;
	$scope.international_transfer=false;
	$scope.internal_confirm_accDetails=false;
	
	$http.get("/branch/viewallbranch").success(function(data,status) {
		$scope.select_payee_branches = [];
        angular.forEach(data.allBranch, function(branchInfo, index) {
			$scope.select_payee_branches.push({"branchName":branchInfo.branchName,"branchId":branchInfo.branchId});
		});
	}).error(function(data,status) {
		 throw { message: 'error message',status:status};
	});
	
	$scope.changeInternal = function(){
		$scope.internal_transfer=false;
		$scope.internal_confirm=true;
		$scope.internal_confirm_accDetails=true;
	}
	
	$scope.verifyInternalPayee = function(){
		$scope.internal_confirm=false;
		$scope.internal_confirm_accDetails=false;
		$scope.internal_transfer=true;
	}
	
	$scope.changeDomestic = function(){
		$scope.domestic_transfer=false;
		$scope.domestic_confirm=true;
	}
	
	$scope.verifyDomesticPayee = function(){
		$scope.domestic_confirm=false;
		$scope.domestic_transfer=true;
	}
	
	$scope.changeInternational = function(){
		$scope.international_transfer=false;
		$scope.international_confirm=true;
	}
	
	$scope.verifyInternationalPayee = function(){
		$scope.international_confirm=false;
		$scope.international_transfer=true;
	}
	
	$scope.syncAccount = function(accNo){
		$http.get("/user/accountdetails/"+accNo).success(function(data,status) {
			$scope.accDetails = data;
			$scope.internal_confirm_accDetails=true;
		}).error(function(data,status) {
			throw { message: 'error message',status:status};
		});
	}
	
	$scope.createInternalPayee = function() {
		$scope.internalPayeeInfo={};
		$scope.internalPayeeInfo['payeeName']=$scope.internalPayeeForm.ipf_payee.$viewValue;
		$scope.internalPayeeInfo['accountNumber']=parseInt($scope.internalPayeeForm.ipf_accNo.$viewValue);
		$scope.internalPayeeInfo['accountName']=$scope.accDetails.accName;
		$scope.internalPayeeInfo['branchId']=$scope.accDetails.branchCod;
		$scope.internalPayeeInfo['nickName']=$scope.internalPayeeForm.ipf_nickname.$viewValue;
		
		alert(JSON.stringify($scope.internalPayeeInfo));
		$http.post('/beneficiary/addbeneficiary', JSON.stringify($scope.internalPayeeInfo)).success(function (data) {
			toastrSucessMsg('Created Internal Payee','Successfull!');
			$scope.payeeName($scope.internalPayeeForm.ipf_payee.$viewValue);
		}).error(function (data, status) {
			 throw { message: 'error message',status:status};	  
		});
	}
	
	$scope.createDomesticPayee = function() {
		$scope.domesticPayeeInfo={};
		$scope.domesticPayeeInfo['payeeName']=$scope.domesticPayeeForm.dpf_payee.$viewValue;
		$scope.domesticPayeeInfo['pMode']=$scope.domesticPayeeForm.dpf_mode.$viewValue;
		$scope.domesticPayeeInfo['accountNumber']=parseInt($scope.domesticPayeeForm.dpf_accNo.$viewValue);
		$scope.domesticPayeeInfo['accountName']=$scope.domesticPayeeForm.dpf_accName.$viewValue;
		$scope.domesticPayeeInfo['bankCode']=$scope.domesticPayeeForm.dpf_bankCode.$viewValue;
		$scope.domesticPayeeInfo['bankName']=$scope.domesticPayeeForm.dpf_bankName.$viewValue;
		$scope.domesticPayeeInfo['bankAddr']=$scope.domesticPayeeForm.dpf_bankAddr.$viewValue;
		$scope.domesticPayeeInfo['city']=$scope.domesticPayeeForm.dpf_bankCity.$viewValue;
		
		alert(JSON.stringify($scope.domesticPayeeInfo));
		$http.post('/beneficiary/addbeneficiary', JSON.stringify($scope.domesticPayeeInfo)).success(function (data) {
			toastrSucessMsg('Created Domestic Payee','Successfull!');
			$scope.payeeName($scope.domesticPayeeForm.dpf_payee.$viewValue);
		}).error(function (data, status) {
			 throw { message: 'error message',status:status};	  
		});
	}
	
	$scope.createInternationalPayee = function() {
		$scope.internationalPayeeInfo={};
		$scope.internationalPayeeInfo['payeeName']=$scope.internationalPayeeForm.inpf_payee.$viewValue;
		$scope.internationalPayeeInfo['accountNumber']=parseInt($scope.internationalPayeeForm.inpf_accNo.$viewValue);
		$scope.internationalPayeeInfo['accountName']=$scope.internationalPayeeForm.inpf_accName.$viewValue;
		$scope.internationalPayeeInfo['payVia']=$scope.internationalPayeeForm.inpf_payVia.$viewValue;
		$scope.internationalPayeeInfo['nickname']=$scope.internationalPayeeForm.inpf_nickname.$viewValue;
		
		alert(JSON.stringify($scope.internationalPayeeInfo));
		$http.post('/beneficiary/addbeneficiary', JSON.stringify($scope.internationalPayeeInfo)).success(function (data) {
			toastrSucessMsg('Created International Payee','Successfull!');
			$scope.payeeName($scope.internationalPayeeForm.inpf_payee.$viewValue);
		}).error(function (data, status) {
			 throw { message: 'error message',status:status};	  
		});
	}
	
	$scope.payeeName= function(payeeName){
		sharedProperties.setProperty(payeeName);
		$window.location.href = '#/success';
	}
	
});

app.controller("successController", function($scope,$http,sharedProperties){
	$scope.sharedValue=sharedProperties.getProperty();
	if($scope.sharedValue!=undefined){
		if($scope.sharedValue=="transfer"){
			$scope.successPageInfo=$scope.sharedValue;
		}else{
			$scope.successPageInfo="addPayee";
		}
	}
});

app.controller("errorController", function($scope,$http,sharedProperties){
	$scope.sharedValue=sharedProperties.getProperty();
	if($scope.sharedValue!=undefined){
		
	}
});

app.controller("transfermoneyController",function($scope,$http,$window,sharedProperties){
	$scope.reset = function(){
		$scope.myAccount_select=true;
		$scope.myAccount_confirm=false;
		$scope.myAccount_transfer=false;
		$scope.existAccount_select=true;
		$scope.existAccount_confirm=false;
		$scope.existAccount_transfer=false;
	}
	
	$http.get("/beneficiary/viewbeneficiary").success(function(data,status) {
		$scope.payees = [];
        angular.forEach(data.allPayee, function(payeeInfo, index) {
			$scope.payees.push({"payeeId":payeeInfo.id,"payeeName":payeeInfo.payeeName});
		});
	}).error(function(data,status) {
		 throw { message: 'error message',status:status};
	});
	
	$http.get("/user/accountdetails/").success(function(data,status) {
		$scope.select_prop_nbrAccounts = [];
		$scope.nbrAccounts =data;
		$scope.customerId=$scope.nbrAccounts.customerId;
        angular.forEach($scope.nbrAccounts.nbrAccounts, function(name, index) {
			$scope.select_prop_nbrAccounts.push({"value":name,"text":name});
		});
	}).error(function(data,status) {
		 throw { message: 'error message',status:status};
	});
	
	$scope.onAccountChange=function(){
		if($scope.mat_nbrAccount!=undefined){
			onChangeNbrAccountId();
		}
		if($scope.ept_nbrAccount!=undefined){
			onChangeEptNbrAccountId();
		}
	}
	
	$scope.onToAccountChange=function(){
		if($scope.mat_transferTo!=undefined){
			selectTransferAccount();
		}
	}

	function onChangeNbrAccountId(){
		$http.get("/user/accountdetails/"+$scope.customerId+"/"+$scope.mat_nbrAccount).success(function(data,status) {
		    $scope.myAccountDetails =data;
		    $scope.select_transfer_nbrAccounts = [];
		    $http.get("/user/accountdetails/").success(function(data,status) {
		        angular.forEach($scope.nbrAccounts.nbrAccounts, function(name, index) {
		        	if($scope.mat_nbrAccount!=name){
		        		$scope.select_transfer_nbrAccounts.push({"value":name,"text":name});
		        	}
				});
			}).error(function(data,status) {
				 throw { message: 'error message',status:status};
			});
		    $scope.myAccount_confirm=true;
		}).error(function(data,status) {
		   throw { message: 'error message',status:status};
		});			
	}
	
	function onChangeEptNbrAccountId(){
		$http.get("/user/accountdetails/"+$scope.customerId+"/"+$scope.ept_nbrAccount).success(function(data,status) {
		    $scope.existAccountDetails =data;
		    $scope.existAccount_confirm=true;
		}).error(function(data,status) {
		   throw { message: 'error message',status:status};
		});			
	}
	
	function selectTransferAccount(){
		$http.get("/user/accountdetails/"+$scope.customerId+"/"+$scope.mat_transferTo).success(function(data,status) {
		    $scope.transferAccountDetails =data;
		}).error(function(data,status) {
		   throw { message: 'error message',status:status};
		});	
	}
	
	$scope.verifymatransfer = function(){
		$scope.myAccount_select=false;
		$scope.myAccount_confirm=false;
		$scope.myAccount_transfer=true;
	}
	
	$scope.changematransfer = function(){
		$scope.myAccount_select=true;
		$scope.myAccount_confirm=true;
		$scope.myAccount_transfer=false;
	}
	
	$scope.myAccountTransfer = function() {
		$scope.transferMoneyDetails={};
		$scope.transferMoneyDetails['accountType']=$scope.myAccountDetails.accType;
		$scope.transferMoneyDetails['currencyCode']=$scope.myAccountDetails.ccyDesc;
		$scope.transferMoneyDetails['fromAccount']=$scope.mat_nbrAccount;
		$scope.transferMoneyDetails['fromBranchCode']=$scope.myAccountDetails.nbrBranch;
		$scope.transferMoneyDetails['amount']=$scope.myAccountForm.mat_amount.$viewValue;
		$scope.transferMoneyDetails['toAccount']=$scope.myAccountForm.mat_transferTo.$viewValue;
		$scope.transferMoneyDetails['note']=$scope.myAccountForm.mat_note.$viewValue;
		$scope.transferMoneyDetails['toBranchCode']=$scope.transferAccountDetails.nbrBranch;
		
		alert(JSON.stringify($scope.transferMoneyDetails));
		$http.post('/fundtransfer/ownaccount', JSON.stringify($scope.transferMoneyDetails)).success(function (data) {
			toastrSucessMsg('Transfer Initiated','Successfull!');
			$scope.success("transfer");
		}).error(function (data, status) {
			$scope.error(status);
			throw { message: 'error message',status:status};	  
		});
	}
	
	$scope.verifyeptransfer = function(){
		if($scope.ept_transferTo!=undefined){
			$scope.payee_id=$scope.ept_transferTo.split("::")[0];
			$scope.payee_name=$scope.ept_transferTo.split("::")[1];
		}
		$scope.existAccount_select=false;
		$scope.existAccount_confirm=false;
		$scope.existAccount_transfer=true;
	}
	
	$scope.changeeptransfer = function(){
		$scope.existAccount_select=true;
		$scope.existAccount_confirm=true;
		$scope.existAccount_transfer=false;
	}
	
	$scope.existingTransfer = function() {
		$scope.transferMoneyDetails={};
		$scope.transferMoneyDetails['accountType']=$scope.existAccountDetails.accType;
		$scope.transferMoneyDetails['fromBranchCode']=$scope.existAccountDetails.nbrBranch;
		$scope.transferMoneyDetails['currencyCode']=$scope.existAccountDetails.ccyDesc;
		$scope.transferMoneyDetails['fromAccount']=$scope.ept_nbrAccount;
		$scope.transferMoneyDetails['amount']=$scope.existingPayeeForm.ept_amount.$viewValue;
		$scope.transferMoneyDetails['payeeName']=$scope.payee_name;
		$scope.transferMoneyDetails['payeeId']=$scope.payee_id;
		$scope.transferMoneyDetails['note']=$scope.existingPayeeForm.ept_note.$viewValue;
		$scope.transferMoneyDetails['purpose']=$scope.existingPayeeForm.ept_purpose.$viewValue;
		
		alert(JSON.stringify($scope.transferMoneyDetails));
		$http.post('/fundtransfer/internal', JSON.stringify($scope.transferMoneyDetails)).success(function (data) {
			toastrSucessMsg('Transfer Initiated','Successfull!');
/*			angular.copy({},$scope.existingPayeeForm);
*/			$scope.success("transfer");
		}).error(function (data, status) {
			$scope.error(status);
			throw { message: 'error message',status:status};	  
		});
	}
	
	$scope.success= function(value){
		sharedProperties.setProperty(value);
		$window.location.href = '#/success';
	}
	
	$scope.error= function(value){
		sharedProperties.setProperty(value);
		$window.location.href = '#/error';
	}
});

app.controller("paybillController", function($scope,$http,$window,sharedProperties) {
	$scope.init = function(){
		$scope.verify=true;
		$scope.payment=false;
	}
	
	$scope.change = function(){
		$scope.verify=true;
		$scope.verifyAccount=true;
		$scope.payment=false;
	}
	
	$scope.confirm = function(){
		$scope.verify=false;
		$scope.verifyAccount=false;
		$scope.payment=true;
	}
	
	$http.get("/biller/user/").success(function(data,status) {
		$scope.billerInfos =data;
	}).error(function(data,status) {
		 throw { message: 'error message',status:status};
	});	
	
	$scope.onBillerChange=function(){
		if($scope.biller!=undefined){
			$scope.billerId=$scope.biller.split("::")[0];
			$scope.billerName=$scope.biller.split("::")[1];
			$scope.billerRelation=$scope.biller.split("::")[2];
		}
	}
	
	$http.get("/user/accountdetails/").success(function(data,status) {
		$scope.select_prop_nbrAccounts = [];
		$scope.nbrAccounts =data;
		$scope.customerId=$scope.nbrAccounts.customerId;
        angular.forEach($scope.nbrAccounts.nbrAccounts, function(name, index) {
			$scope.select_prop_nbrAccounts.push({"value":name,"text":name});
		});
	}).error(function(data,status) {
		 throw { message: 'error message',status:status};
	});
	
	$scope.onAccountChange=function(){
		if($scope.payFrom!=undefined){
			onChangeNbrAccountId();
		}
	}

	function onChangeNbrAccountId(){
		$http.get("/user/accountdetails/"+$scope.customerId+"/"+$scope.payFrom).success(function(data,status) {
		    $scope.accountDetails =data;
		    $scope.verifyAccount=true;
		}).error(function(data,status) {
		   throw { message: 'error message',status:status};
		});			
	}
	
	$scope.payBill = function() {
		$scope.payBillInfo={};
		$scope.payBillInfo['billerId']=$scope.billerId;
		$scope.payBillInfo['fromAccount']=$scope.payFrom;
		$scope.payBillInfo['branchCode']=$scope.accountDetails.nbrBranch;
		$scope.payBillInfo['fromAccountCurrency']=$scope.accountDetails.ccyDesc;
		$scope.payBillInfo['amount']=$scope.payBillForm.amount.$viewValue;
	    $scope.payBillInfo['billerNo']=$scope.payBillForm.billNo.$viewValue;
		$scope.payBillInfo['relationId']=$scope.billerRelation;
/*		$scope.payBillInfo['billDate']=$scope.dtFrom; */	
		$scope.payBillInfo['note']=$scope.payBillForm.note.$viewValue;
		
		alert(JSON.stringify($scope.payBillInfo));
		$http.post('/biller/payBills', JSON.stringify($scope.payBillInfo)).success(function (data) {
			toastrSucessMsg('Payment Successful','Successful!');
			angular.copy({},$scope.payBillForm);
			$scope.success("paybills");
		}).error(function (data, status) {
			$scope.error(status);
			throw { message: 'error message',status:status};	  
		});
	}
	
	$scope.success= function(value){
		sharedProperties.setProperty(value);
		$window.location.href = '#/success';
	}
	
	$scope.error= function(value){
		sharedProperties.setProperty(value);
		$window.location.href = '#/error';
	}
});

app.controller("addBillerController", function($scope,$http,sharedProperties,$window) {
	$scope.verify=true;
	$scope.add=false;
	
	$scope.confirm = function(){
		if($scope.biller!=undefined){
			$scope.billerID=$scope.biller.split("::")[0];
			$scope.billerDescription=$scope.biller.split("::")[1];
		}
		$scope.verify=false;
		$scope.add=true;
	}
	
	$scope.change = function(){
		$scope.verify=true;
		$scope.add=false;
	}
	
	$http.get("/user/accountdetails/").success(function(data,status) {
		$scope.customerId=data.customerId;
	}).error(function(data,status) {
		 throw { message: 'error message',status:status};
	});
	
	$http.get("/biller/").success(function(data,status) {
		$scope.billerInfos =data.billerDtos;
	}).error(function(data,status) {
		 throw { message: 'error message',status:status};
	});	
	
	$scope.registerBiller = function() {
		$scope.registerBillerInfo={};
		$scope.registerBillerInfo['billerId']=$scope.billerID;
		$scope.registerBillerInfo['billerReferenceNumber']=$scope.addBillerForm.accNo.$viewValue;
		$scope.registerBillerInfo['billerName']=$scope.billerDescription;
		
		alert(JSON.stringify($scope.registerBillerInfo));
		$http.post('/biller/register/', JSON.stringify($scope.registerBillerInfo)).success(function (data) {
			toastrSucessMsg('Biller Created','Successful!');
			angular.copy({},$scope.addBillerForm);
			$scope.success("paybills");
		}).error(function (data, status) {
			$scope.error(status);
			throw { message: 'error message',status:status};	  
		});
	}
	
	$scope.success= function(value){
		sharedProperties.setProperty(value);
		$window.location.href = '#/success';
	}
	
	$scope.error= function(value){
		sharedProperties.setProperty(value);
		$window.location.href = '#/error';
	}
});

app.controller('newLoanAccountOpening', function($scope) {

	 self = this;
	  self.opened = {};
	  self.open = function($event) {

	    $event.preventDefault();
	    $event.stopPropagation();

	    self.opened = {};
	    self.opened[$event.target.id] = true;

	    // log this to check if its setting the log    
	    console.log(self.opened);
	    
	  };

	  self.format = 'dd-MM-yyyy'
	
	$scope.stopDefaultAction = function(event) {
		event.preventDefault();
	};
	
	// function to submit the form after all validation has occurred			
	$scope.submitForm = function() {
	

		// check to make sure the form is completely valid
	
		if ($scope.userForm.$valid) {
			alert('form submitted successfully');
			
			
		}

	
		if ($scope.userForm1.$valid) {
			alert('form submitted successfully');
			
			
		}
		
	};
	


});

app.controller('jsonCtrl1', function($scope, $http){
	$http.get('js/d.json').success(function (data){
	  $scope.data = data;
	  $scope.GetValue = function() {
		  fin1($scope.ddldata);
	  }	

		function fin1(val){
		angular.forEach($scope.data.balanceinfo,function(value,key){
		 if(value.accno==$scope.ddldata)
		 {
			 $scope.name = value.Balance;
		 }
	
		});
	
		}	
	});
});


app.controller("accountsController", function($scope,$http) {
	$http.get("/user/accountdetails/").success(function(data,status) {
		$scope.select_prop_nbrAccounts = [];
		$scope.nbrAccounts =data;
		$scope.customerId=$scope.nbrAccounts.customerId;
        angular.forEach($scope.nbrAccounts.nbrAccounts, function(name, index) {
			$scope.select_prop_nbrAccounts.push({"value":name,"text":name});
		});
        $scope.nbrAccount=$scope.select_prop_nbrAccounts[0].value;
        onChangeNbrAccountId();
	}).error(function(data,status) {
		 throw { message: 'error message',status:status};
	});
	
	$scope.onChangeNbrAccountId=function(){
		if($scope.nbrAccount!=undefined){
			onChangeNbrAccountId();
		}
	}

	function onChangeNbrAccountId(){
		$http.get("/user/accountdetails/"+$scope.customerId+"/"+$scope.nbrAccount).success(function(data,status) {
		    if(data.odLimit==null){
		    	data.odLimit="Nill";
		    }
		    if(data.accStatus==null){
		    	data.accStatus="Unknown";
		    }
		    $scope.accountdetails =data;
		}).error(function(data,status) {
		   throw { message: 'error message',status:status};
		});			
	}
});

app.controller("billerController", function($scope,$http) {
	$http.get("/biller/user/").success(function(data,status) {
		$scope.billerInfos =data;
	}).error(function(data,status) {
		 throw { message: 'error message',status:status};
	});	
});

app.controller("statementController", function($scope,$http) {
	$http.get("/user/accountdetails/").success(function(data,status) {
		$scope.select_prop_nbrAccounts = [];
		$scope.nbrAccounts =data;
		$scope.customerId=$scope.nbrAccounts.customerId;
        angular.forEach($scope.nbrAccounts.nbrAccounts, function(name, index) {
			$scope.select_prop_nbrAccounts.push({"value":name,"text":name});
		});
        $scope.nbrAccount=$scope.select_prop_nbrAccounts[0].value;
    	onChangeNbrAccountId();
	}).error(function(data,status) {
	   throw { message: 'error message',status:status};
	});	
	
	$scope.onAccountChange=function(){
		if($scope.nbrAccount!=undefined){
			onChangeNbrAccountId();
		}
	}
	
	function onChangeNbrAccountId(){
		$http.get("/user/transactionactivity/"+$scope.customerId+"/"+$scope.nbrAccount).success(function(data,status) {
			$scope.transactionInfos =data;
			$scope.sort = function(keyname){
				$scope.sortKey = keyname;   
				$scope.reverse = !$scope.reverse; 
			}
		}).error(function(data,status) {
			 throw { message: 'error message',status:status};
		});	
	}
});

app.controller("termDepositsController", function($scope,$http,sharedProperties,$window) {
    $http.get("/user/termdeposit/").success(function(data,status) {
     $scope.termDeposite = data;
  	 $scope.select_prop_nbrAccounts = [];
	 $scope.customerId=$scope.termDeposite.customerId;
        angular.forEach($scope.termDeposite.nbrAccounts, function(name, index) {
			$scope.select_prop_nbrAccounts.push({"value":name,"text":name});
	 });
     $scope.nbrAccount=$scope.select_prop_nbrAccounts[0].value;
     onChangeNbrAccountId();
    }).error(function(data,status) {
		 throw { message: 'error message',status:status};
	});	

	$http.get("/user/accountdetails/summary").success(function(data,status) {
		$scope.termDepositBalance = data.sumOfContractAndTermdepostit;
	}).error(function(data,status) {
	   throw { message: 'error message',status:status};
	});
	
    $scope.onAccountChange=function(){
		if($scope.nbrAccount!=undefined){
			onChangeNbrAccountId();
		}
	}
	function onChangeNbrAccountId(){
		$http.get("/user/transactionactivity/lastfive/"+$scope.customerId+"/"+$scope.nbrAccount).success(function(data,status) {
			$scope.transactionInfos =data;		
		}).error(function(data,status) {
			 throw { message: 'error message',status:status};
		});	
	}
	
	$scope.tempDepositeMoreInfo=function(tempDepositeMoreInfo){
		sharedProperties.setProperty(tempDepositeMoreInfo);
		$window.location.href ='#/tempDeposite-details';
	}
});

app.controller("accountsSummaryController", function($scope,$http) {
	$scope.stopDefaultAction = function(event) {
		event.preventDefault();
	};
	
	$http.get("/user/accountdetails/summary").success(function(data,status) {
		   $scope.response = data;
		   $scope.loan=$scope.response.loans;
		   $scope.select_prop_nbrAccounts=[];
		   $scope.savingsandcurrent=$scope.response.savingsAndCurrent;
		   $scope.contractandtermdepostit=$scope.response.contractAndTermdeposit;
		   $scope.sumofsavingsandcurrent =data.sumOfSavingsAndCurrent;
		   $scope.sumofloans =data.sumOfLoans;
		   $scope.sumofcontractandtermdepostit =data.sumOfContractAndTermdepostit;
		   var doughnutData = [
				      { value: $scope.sumofloans, color:"#ff8080", highlight: "#ff8090", label: "LOAN" },
					  { value: $scope.sumofcontractandtermdepostit, color: "#ffa86f", highlight: "#ffa86f", label: "TERM DEPOSIT" },
					  { value: $scope.sumofsavingsandcurrent, color: "#50de7a",highlight: "#50de7a", label: "SAVING & CURRENT" }
					];
					var options = {showTooltips : true,animation: true,percentageInnerCutout : 50,legend: {
		            display: true,
		            labels: {
		                fontColor: 'rgb(255, 99, 132)'
		            }
		        }};
				var chartCtx = $("#account-summary-chart").get(0).getContext("2d");
				var chart = new Chart(chartCtx).Doughnut(doughnutData, options);
		   $scope.customerId=$scope.response.customerId;
	        angular.forEach($scope.response.nbrAccounts, function(name, index) {
				$scope.select_prop_nbrAccounts.push({"value":name,"text":name});
		   });
	       $scope.nbrAccount=$scope.select_prop_nbrAccounts[0].value;
	       onChangeNbrAccountId();
	}).error(function(data,status) {
		 throw { message: 'error message',status:status};
	});
	
	$scope.onAccountChange=function(){
		if($scope.nbrAccount!=undefined){
			onChangeNbrAccountId();
		}
	}
	function onChangeNbrAccountId(){
		$http.get("/user/transactionactivity/lastfive/"+$scope.customerId+"/"+$scope.nbrAccount).success(function(data,status) {
			$scope.transactionInfos =data;		
		}).error(function(data,status) {
			 throw { message: 'error message',status:status};
		});	
	}
});


/**Exception handler**/
app.config(function($provide) {
    $provide.decorator("$exceptionHandler", function($delegate) {
		return function(exception, cause) {
			$delegate(exception, cause);
			if(exception.status==500||exception.status==400){
				toastrErrorMsg("Internal server error. Please try after sometime.","HTTP - "+exception.status);
			}else{
				toastrErrorMsg(exception.message,exception.status);
			}
			
		};
	});
});


/**Spinner loader**/
(function(){
    angular.module('ngLoadingSpinner', ['angularSpinner'])
    .directive('usSpinner',   ['$http', '$rootScope' ,function ($http, $rootScope){
        return {
            link: function (scope, elm, attrs){
                $rootScope.spinnerActive = false;
                scope.isLoading = function () {
                    return $http.pendingRequests.length > 0;
                };
                scope.$watch(scope.isLoading, function (loading){
                    $rootScope.spinnerActive = loading;
                    if(loading){
                        elm.removeClass('ng-hide');
                    }else{
                        elm.addClass('ng-hide');
                    }
                });
            }
        };

    }]);
}).call(this);


/**Password matcher**/
app.directive('match', function($parse) {
	  return {
	    require: 'ngModel',
	    link: function(scope, elem, attrs, ctrl) {
	      scope.$watch(function() {        
	        return $parse(attrs.match)(scope) === ctrl.$modelValue;
	      }, function(currentValue) {
	        ctrl.$setValidity('mismatch', currentValue);
	      });
	    }
	 };
});


/** toaster for success message **/
function toastrSucessMsg(message, operation_status) {
	toastr.options = {"debug" : false,"positionClass" : "toast-top-right","onclick" : null,"fadeIn" : 300,"fadeOut" : 100,"timeOut" : 4000,"extendedTimeOut" : 1000}
	toastrs();
	var showToastrs = false;
	function toastrs() {
		if (!showToastrs) {
			toastr.success(message, operation_status)
		}
	}
	toastr.options.onFadeIn = function() {
		showToastrs = true;
	};
	toastr.options.onFadeOut = function() {
		showToastrs = false;
	};
}


/** toaster for error message**/
function toastrErrorMsg(message, operation_status) {
	toastr.options = {"debug" : false,"positionClass" : "toast-top-right","onclick" : null,"fadeIn" : 300,"fadeOut" : 100,"timeOut" : 4000,"extendedTimeOut" : 1000}
	toastrs();
	var showToastrs = false;
	function toastrs() {
		if (!showToastrs) {
			toastr.error(message, operation_status)
		}
	}
	toastr.options.onFadeIn = function() {
		showToastrs = true;
	};
	toastr.options.onFadeOut = function() {
		showToastrs = false;
	};
}


/** AngularJs unique filter**/
app.filter('unique', function () {
	return function (items, filterOn) {
        if (filterOn === false) {
            return items;
        }
        if ((filterOn || angular.isUndefined(filterOn)) && angular.isArray(items)) {
            var hashCheck = {}, newItems = [];
            var extractValueToCompare = function (item) {
                if (angular.isObject(item) && angular.isString(filterOn)) {
                    return item[filterOn];
                } else {
                    return item;
                }
            };
            angular.forEach(items, function (item) {
                var valueToCheck, isDuplicate = false;
                for (var i = 0; i < newItems.length; i++) {
                    if (angular.equals(extractValueToCompare(newItems[i]), extractValueToCompare(item))) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    newItems.push(item);
                }

            });
            items = newItems;
        }
        return items;
    };
});


/**unique filter**/
function arrayUniqueFilter(arrayInput) {
    var cleaned = [];
    arrayInput.forEach(function(itm) {
        var unique = true;
        cleaned.forEach(function(itm2) {
            if (angular.equals(itm, itm2)) unique = false;
        });
        if (unique)  cleaned.push(itm);
    });
    return cleaned;
}

/** Temporary storage **/
app.service('sharedProperties', function () {
	var property = '';
    return {
        getProperty: function () {
            return property;
        },
        setProperty: function(value) {
            property = value;
        }
    };
});


/** disabling right click **/
app.directive('ngRightClick', function($parse) {
    return function(scope, element, attrs) {
        var fn = $parse(attrs.ngRightClick);
        element.bind('contextmenu', function(event) {
            scope.$apply(function() {
                event.preventDefault();
                fn(scope, {$event:event});
            });
        });
    };
});
