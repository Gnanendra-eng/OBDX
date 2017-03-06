/** Angular app creations and route configurations **/
var app = angular.module("profileApp", ["ngRoute","ngLoadingSpinner","angularUtils.directives.dirPagination","ui.bootstrap"]);
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
    }).when("/onwaccounttransfer", {
    	templateUrl : '/fragment/ownaccounttransfer.html',
    	controller:'ownAccountTransfer'	
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
app.controller("ownAccountTransfer", function($scope,$http) {
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
		   google.charts.load("current", {packages:["corechart"]});
		   google.charts.setOnLoadCallback(drawChart);
		   function drawChart() { var data = google.visualization.arrayToDataTable([ ['Task', 'Hours per Day'], ['SAVING ACCOUNT & CURRENT',$scope.sumofsavingsandcurrent], ['TERM DEPOSIT', $scope.sumofcontractandtermdepostit], ['LOANS', $scope.sumofloans] ]); var options = {  is3D: true, legend: 'none', colors: ['#9de219', '#00FFFF', '#FF4500'], backgroundColor: 'transparent' }; var chart = new google.visualization.PieChart(document.getElementById('piechart_3d')); chart.draw(data, options); }
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