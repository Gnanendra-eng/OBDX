/** Angular app creations and route configurations **/
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
    }).when("/statement", {
    	templateUrl : '/fragment/statement.html',
    	controller:"statementController"	
    }).when("/biller", {
    	templateUrl : '/fragment/biller.html',
    	controller:'billerController'	
    }).when("/paybills", {
    	templateUrl : '/fragment/paybills.html',
    	controller:'paybillController'
    }).when("/transfermoney", {
    	templateUrl : '/fragment/transfermoney.html',
    	controller:'transfermoneyController'	
    }).when("/balance", {
    	templateUrl : '/fragment/balance.html',
    	controller:'jsonCtrl1'	
    }).when("/new-loan-account-opening", {
    	templateUrl : '/fragment/loan-opening.html',
    	controller:'newLoanAccountOpening'	
    }).otherwise({
	   redirectTo : '/oops',
	   templateUrl : '/fragment/oops.html'
    });
});

/**Exception handler**/
app.config(function($provide) {
    $provide.decorator("$exceptionHandler", function($delegate) {
		return function(exception, cause) {
			$delegate(exception, cause);
            alert(exception.message +" "+exception.status);
		};
	});
});

/**contact-information**/
















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




app.controller('toggleController', function ($scope) {
    //This will hide the DIV by default.
    $scope.IsVisible = false;
    $scope.Showaddress = function (value) {
        //If DIV is visible it will be hidden and vice versa.
        $scope.IsVisible = value == "Y";
    }
});

app.controller("transfermoneyController",function($scope,$http){
	  $scope.IsVisible = false;
      $scope.ShowHide = function () {
          //If DIV is visible it will be hidden and vice versa.
          $scope.IsVisible = $scope.IsVisible ? false : true;
      }
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


	
	$scope.tags = [
	  ];
});

app.controller("paybillController", function($scope,$http) {
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
		
	
	


}
});




app.controller("loanController", function($scope,$http) {
	$http.get("/user/loan/").success(function(data,status) {
		 $scope.loanInfo=data;		
		 var options = {container: "#loan",label: "label",width: 150,height: 150,type: "liquid",percentage: function (d) {  return d.count/100;}, size: "Remaining amount" };
		 var data = [{"label": "Loan","Remaining amount": parseFloat($scope.loanInfo.totalBorrowing)-parseFloat($scope.loanInfo.currentOutStanding),"count": 100-Math.round(((parseFloat($scope.loanInfo.totalBorrowing)-parseFloat($scope.loanInfo.currentOutStanding))/parseFloat($scope.loanInfo.totalBorrowing))*100),"tipo": "loan","year": 2017}];
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


app.controller('emailController', function ($scope) {
	  $scope.fields = {
			    email: '',
			    emailConfirm: ''
			  };

			  $scope.submit = function() {
			    alert("Submit!");
			  };
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
		    $scope.accountdetails =data;
		}).error(function(data,status) {
		   throw { message: 'error message',status:status};
		});			
	}
});


app.controller("billerController", function($scope,$http) {
	$http.get("/user/biller/").success(function(data,status) {
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

app.controller("termDepositsController", function($scope,$http) {
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
					  { value: $scope.sumofsavingsandcurrent, color: "#50de7a",highlight: "#50de7a", label: "SAVING ACCOUNT & CURRENT" }
					];
					var options = {showTooltips : true,animation: true,percentageInnerCutout : 83,legend: {
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



