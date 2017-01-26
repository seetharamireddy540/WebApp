/**
 * User Search Controller
 */
(function(){
	
	var gitHubViewer = angular.module('gitHubViewer');
	
	var MainController = function($scope){
		var decrementCountDown = function() {
			$scope.countdown =-1;
			if ($scope.countdown < 1) {
				$scope.search($scope.username);
			}
			
		};
		
		var countdowninterval = null;
		var startCountDown = function(){
			
			countdowninterval = $interval(decrementCountdown, 1000, $scope.countdown);
		};
		
		var search = function(username) {
			if (countdowninterval) {
				$interval.cancle(countdowninterval);
				$scope.countdown = null;
			}
			
		};
		
		$scope.search = serach;

		$scope.username="angular";
		$scope.message="GitHub Viewer";
		$scope.countdown=5;
		
		startCountDown();
	};
	
	gitHubViewer.controller('MainController', ['$scope', '$location','$interval', MainController]);
	
}())