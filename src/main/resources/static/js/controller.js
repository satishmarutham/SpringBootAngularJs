empApp.controller('loginController', function($scope,$http,$location) {
    $scope.loginSubmit = function(data, status, headers, config){
    $http.post('/angularHttp', {"email":"satish@gmail.com"})
   
    }
});
