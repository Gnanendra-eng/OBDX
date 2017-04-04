var myApp  =  angular.module('myApp', []);

myApp.controller('jsonCtrl1', function($scope, $http){
$http.get('d.json').success(function (data){
  $scope.data = data;
$scope.GetValue = function() {

   fin1($scope.ddldata);
}

function fin1(val){
angular.forEach($scope.data.balanceinfo,function(value,key){
 if(value.accno==$scope.ddldata)
 {
 alert("The balance of the selected account is:"+value.Balance);
 }

});

}

});




    
       
    
    
});