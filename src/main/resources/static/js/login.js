var app = angular.module('demoApp', []);
app.controller('loginController', function($scope,$http,$window){

 //$scope.enterValue='hai'	
// $window.location.href = '/admin#/'+$scope.enterValue;
	
});
		











/*$scope.status=false;
$scope.loader_status=false;
$scope.getUserRoles = function() {
	$scope.loader_status=true;
	$http.get("/user/roles?userName="+$scope.user.username).then(function(responseObj,status) {
		   $scope.status=true;
		   $scope.response = responseObj.data;
		   $scope.rolesInfo=[];
		    angular.forEach($scope.response,function(value,key){
		    	$scope.rolesInfo.push(value);
		 });
		$scope.loader_status=false;
	});
}
$scope.change = function() {
	$scope.status=false;
}	*/



/*<br />
<div class="row" data-ng-show="status">
	<div class="col-sm-4">
		<h3>User Roles</h3>
		<ul class="nav nav-tabs"
			data-ng-repeat="role in rolesInfo track by $index">
			<li><a href="#">{{rolesInfo}}</a></li>
		</ul>
	</div>
</div>
<div class="col-sm-4" data-ng-show="loader_status">
	<img alt="loader" src="images/ajax-loader.gif"/>
</div>*/