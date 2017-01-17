var demoApp = angular.module('demoApp',[]);
demoApp.controller("signupController",function($scope, $http) {
	$scope.addUser = function() {
		var obj = {};
		obj['name']=$scope.user.name;
		obj['email']=$scope.user.email;
		obj['password']=$scope.user.password;
		alert(JSON.stringify(obj));
	    $http.post('/userregistration',JSON.stringify(obj)).success(function(response,status){
	    if(status==200){
	      $scope.user= angular.copy(null);
		  $scope.userForm.$setPristine();
		  $route.reload(); 
	    }	
	    }).error(function(data,status) {
	       alert("Unexpected error!!.Please try after some time");
	   });
	}
});