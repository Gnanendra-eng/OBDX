var demoApp = angular.module('demoApp',[]);
demoApp.controller("accountSummary",function($scope, $http) {
	$scope.status=false;
	$scope.getAccountSummary = function() {
		$http.get("/user/accountdetails/summary").then(function(responseObj,status) {
			   $scope.status=true;
			   $scope.response = responseObj.data;
			   $scope.rolesInfo=[];
			    angular.forEach($scope.response,function(value,key){
			    	$scope.rolesInfo.push(value);
			 });
		});
	}
	$scope.change = function() {
		$scope.status=false;
	}
})