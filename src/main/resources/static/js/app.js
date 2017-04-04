// create angular app
	var validationApp = angular.module('validationApp', []);

	// create angular controller
	validationApp.controller('mainController', function($scope) {
						
		// function to submit the form after all validation has occurred			
		$scope.submitForm = function() {
		

			// check to make sure the form is completely valid
			if ($scope.userForm.$invalid) {
				alert('please fill all the fields');
				
				
			}
			if ($scope.userForm.$valid) {
				alert('form submitted successfully');
				
				
			}

		};

	});