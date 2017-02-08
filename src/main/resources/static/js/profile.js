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
    }).otherwise({
	   redirectTo : '/oops',
	   templateUrl : '/fragment/oops.html'
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
	
		   function createChart(){  
			   $("#chart") .kendoChart(   {  
			      title:{  
			         position:"bottom",
			         text:"TOTAL NET BALANCE"
			      },
			      legend:{  
			         visible:false
			      },
			      chartArea:{  
			         background:"#F0F8FF"
			      },
			      seriesDefaults:{  
			         type:"donut",
			         startAngle:150
			      },
			      series:[  
			         {  
			            name:"JMR",
			            data:[  
			               {  
			                  category:"SAVING ACCOUNT & CURRENT",
			                  value:$scope.sumofsavingsandcurrent,
			                  color:"#9de219"
			               },
			               {  
			                  category:"TERM DEPOSIT",
			                  value:$scope.sumofcontractandtermdepostit,
			                  color:"#00FFFF"
			               },
			               {  
			                  category:"LOANS",
			                  value:$scope.sumofloans,
			                  color:"#FF4500"
			               }
			            ],
			            labels:{  
			               visible:true,
			               background:"transparent",
			               position:"outsideEnd",
			               template:"#= category #: \n #= value#"
			            }
			         }
			      ],
			      tooltip:{  
			         visible:true,
			         template:"#= category # (#= series.name #): #= value #"
			      }
			   }   );
			}$(document).ready(createChart); $(document).bind("kendo:skinChange",
			createChart);
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