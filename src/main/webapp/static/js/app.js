(function(){
	
	var gitHubViewer = angular.module('gitHubViewer', ['ngRoute']);
	
	gitHubViewer.config(function($routeProvider){
	    $routeProvider.when("/main", {
	    	templateUrl:"./static/html/main.html",
	    	controller:"MainController"
	    }).otherwise({
	    	redirectTo :"/main"
	    })
	});
	
	
}());