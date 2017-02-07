var app = angular.module("profileApp", ["ngRoute","ngLoadingSpinner"]);
app.config(function($routeProvider,$locationProvider) {
    $routeProvider.when('/', {
           templateUrl : '/fragment/home.html',
           controller:"profileController"
    }).when("/account", {
        templateUrl : '/fragment/account.html',
	    controller:"accountsController"	
    }).otherwise({
	   redirectTo : '/oops',
	   templateUrl : '/fragment/oops.html'
    });
});

app.controller("profileController", function($scope,$http) {
	
	$scope.stopDefaultAction = function(event) {
		event.preventDefault();
	};
	function createChart() { $("#chart") .kendoChart( { title : { position : "bottom", text : "TOTAL NET BALANCE" }, legend : { visible : false }, chartArea : { background : "" }, seriesDefaults : { type : "donut", startAngle : 150 }, series : [ { name : "JMR", data : [ { category : "SAVING ACCOUNT", value : 53.8, color : "#9de219" }, { category : "FIXED ACCOUNT", value : 16.1, color : "#90cc38" }, { category : "JOINT ACCOUNT", value : 11.3, color : "#068c35" }, { category : "LOANS", value : 9.6, color : "#006634" }, { category : "LIMIT", value : 5.2, color : "#004d38" }, { category : "DUES", value : 3.6, color : "#033939" } ], labels : { visible : true, background : "transparent", position : "outsideEnd", template : "#= category #: \n #= value#%" } } ], tooltip : { visible : true, template : "#= category # (#= series.name #): #= value #%" } }); } $(document).ready(createChart); $(document).bind("kendo:skinChange", createChart);
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