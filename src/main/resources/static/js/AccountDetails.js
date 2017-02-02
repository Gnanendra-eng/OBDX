var accountDetails = angular.module('accountDetails',[]);
accountDetails.controller("accountDetailsController",function($scope, $http) {
    $scope.ShowAccountDetails=false;

	$scope.getAccountDetails = function() {
	    $http.get("http://localhost:8080/user/ACCOUNTDETAILS/"+$scope.CustomerID+"/"+$scope.AccountID+"/").then(function(response) {
            $scope.responceObj = response.data;
            $scope.ShowAccountDetails=true;
          
        });
	}
	
});