var loginApp = angular.module('loginApp', []);
loginApp.controller('loginController', function($scope,$http,$window,$timeout){
$scope.userNamePaste = function() {
$timeout(function() {
  $scope.user.userName ="";
 }, 0);
}
$scope.passwordPaste= function() {
	$timeout(function() {
	  $scope.user.password ="";
	 }, 0);
	}
});
loginApp.directive('ngRightClick', function($parse) {
    return function(scope, element, attrs) {
        var fn = $parse(attrs.ngRightClick);
        element.bind('contextmenu', function(event) {
            scope.$apply(function() {
                event.preventDefault();
                fn(scope, {$event:event});
            });
        });
    };
});

loginApp.directive('noSpecialChar', function() {
    return {
      require: 'ngModel',
      restrict: 'A',
      link: function(scope, element, attrs, modelCtrl) {
        modelCtrl.$parsers.push(function(inputValue) {
          if (inputValue == undefined)
            return ''
          cleanInputValue = inputValue.replace(/[^\w\s]/gi, '');
          if (cleanInputValue != inputValue) {
            modelCtrl.$setViewValue(cleanInputValue);
            modelCtrl.$render();
          }
          return cleanInputValue;
        });
      }
    }
 });
loginApp.directive('noSpaces', function() {
	  return {
	    require: 'ngModel',
	    link: function(scope, element, attrs, ngModel) {
	      attrs.ngTrim = 'false';
	      element.bind('keydown', function(e) {
	        if (e.which === 32) {
	          e.preventDefault();
	          return false;
	        }
	      });
	      ngModel.$parsers.unshift(function(value) {
	        var spacelessValue = value.replace(/ /g, '');
	        if (spacelessValue !== value) {
	          ngModel.$setViewValue(spacelessValue);
	          ngModel.$render();
	        }
	        return spacelessValue;
	      });
	    }
	  };
});


