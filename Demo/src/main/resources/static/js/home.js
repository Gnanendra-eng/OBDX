var demoApp = angular.module('demoApp',[]);
demoApp.controller("homeController",function($scope, $http) {
	$scope.status=false;
	$scope.getUserRoles = function() {
		$http.get("/user/roles?userName="+$scope.fullname).then(function(responseObj,status) {
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
});