var app = angular.module("profileApp", ["ngRoute","ngLoadingSpinner"]);
app.config(function($routeProvider,$locationProvider) {
    $routeProvider.when('/', {
           templateUrl : '/fragment/account-summary.html',
           controller:"accountsSummaryController"
    }).when("/account", {
        templateUrl : '/fragment/account.html',
	    controller:"accountsController"	
    }).when("/account-summary", {
        templateUrl : '/fragment/account-summary.html',
	    controller:"accountsSummaryController"	
    }).when("/loan", {
    	templateUrl : '/fragment/loan.html',
    	controller:"loanController"	
    }).otherwise({
	   redirectTo : '/oops',
	   templateUrl : '/fragment/oops.html'
    });
});


app.controller("loanController", function($scope,$http) {
	
          
	$scope.stopDefaultAction = function(event) {
		event.preventDefault();
	};
	$http.get("/user/loan/").then(function(data,status) {
		 $scope.loanInfo=data.data;		
		 var options = {container: "#test",label: "label",width: 250, height: 250,type: "liquid",percentage: function (d) {  return d.count/100;}, size: "Remaining amount" };
		 var data = [{"label": "Loan","Remaining amount": parseFloat($scope.loanInfo.totalBorrowing)-parseFloat($scope.loanInfo.currentOutStanding),"count": 100-Math.round(((parseFloat($scope.loanInfo.totalBorrowing)-parseFloat($scope.loanInfo.currentOutStanding))/parseFloat($scope.loanInfo.totalBorrowing))*100),"tipo": "loan","year": 2017}];
		 var viz = new BubbleChart(options);
		 viz.data(data);
		
	});
	
	
});

app.controller("accountsSummaryController", function($scope,$http) {

	$scope.stopDefaultAction = function(event) {
		event.preventDefault();
	};
	$http.get("/user/accountdetails/summary").then(function(data,status) {
		   $scope.response = data.data;
		   $scope.loan=$scope.response.loans;
		   $scope.savingsandcurrent=$scope.response.savingsAndCurrent;
		   $scope.contractandtermdepostit=$scope.response.contractAndTermdeposit;
		   $scope.sumofsavingsandcurrent =data.data.sumOfSavingsAndCurrent;
		   $scope.sumofloans =data.data.sumOfLoans;
		   $scope.sumofcontractandtermdepostit =data.data.sumOfContractAndTermdepostit;
		    google.charts.load("current", {packages:["corechart"]});
		      google.charts.setOnLoadCallback(drawChart);
		      function drawChart() {
		        var data = google.visualization.arrayToDataTable([
		          ['Task', 'Hours per Day'],
		          ['SAVING ACCOUNT & CURRENT',$scope.sumofsavingsandcurrent],
		          ['TERM DEPOSIT', $scope.sumofcontractandtermdepostit],
		          ['LOANS',  $scope.sumofloans]
		        ]);
		        var options = {
		          title: 'Account Summary',
		          is3D: true,
		          legend: 'none',
		          colors: ['#9de219', '#00FFFF', '#FF4500'],
		        backgroundColor: 'transparent'
		        };

		        var chart = new google.visualization.PieChart(document.getElementById('piechart_3d'));
		        chart.draw(data, options);
		      }
	});

});

app.controller("profileController", function($scope,$http) {
	$scope.stopDefaultAction = function(event) {
		event.preventDefault();
	};
});


app.controller("accountsController", function($scope,$http) {
	$scope.accountsResultsStatus=false;
	$http.get("/user/accountdetails/").then(function(data,status) {
		$scope.select_prop_nbrAccounts = [];
		$scope.nbrAccounts =data.data;
		$scope.customerId=$scope.nbrAccounts.customerId;
        angular.forEach($scope.nbrAccounts.nbrAccounts, function(name, index) {
			$scope.select_prop_nbrAccounts.push({"value":name,"text":name});
		});
	});
	
	$scope.onAccountChange=function(){
		$scope.accountsResultsStatus=false;
		if($scope.nbrAccount!=undefined){
			$http.get("/user/accountdetails/"+$scope.customerId+"/"+$scope.nbrAccount).then(function(data,status) {
				$scope.accountsResultsStatus=true;
				$scope.accountdetails =data.data;
			});		
		}
	}
	
});

(function(){
    angular.module('ngLoadingSpinner', ['angularSpinner'])
    .directive('usSpinner',   ['$http', '$rootScope' ,function ($http, $rootScope){
        return {
            link: function (scope, elm, attrs)
            {
                $rootScope.spinnerActive = false;
                scope.isLoading = function () {
                    return $http.pendingRequests.length > 0;
                };

                scope.$watch(scope.isLoading, function (loading)
                {
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