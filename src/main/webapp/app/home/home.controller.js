(function() {
    'use strict';

    angular
        .module('songtranscriptmarketApp')
        .controller('HomeController', HomeController);

    HomeController.$inject = ['$scope', 'Principal', 'LoginService', '$state','PublicSearchService','AlertService'];

    function HomeController ($scope, Principal, LoginService, $state,PublicSearchService,AlertService) {
        var vm = this;

        vm.account = null;
        vm.isAuthenticated = null;
        vm.login = LoginService.open;
        vm.register = register;
        vm.results = [];
        vm.query = null;
        vm.search = search;
        vm.page = 0;


        $scope.$on('authenticationSuccess', function() {
            getAccount();
        });

        getAccount();
        vm.search();
        function getAccount() {
            Principal.identity().then(function(account) {
                vm.account = account;
                vm.isAuthenticated = Principal.isAuthenticated;
            });
        }
        function register () {
            $state.go('register');
        }


        function search () {
            console.log("search");
            PublicSearchService.query({
                page: vm.page,
                query:vm.query
            }, onSuccess, onError);

            function onSuccess(data) {
                vm.results=[];
                for (var i = 0; i < data.length; i++) {
                    console.log(data[i]);
                    vm.results.push(data[i]);
                }
            }

            function onError(error) {
                AlertService.error(error.data.message);
            }
        }
    }
})();
