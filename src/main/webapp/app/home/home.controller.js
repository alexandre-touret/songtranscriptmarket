(function() {
    'use strict';

    angular
        .module('songtranscriptmarketApp')
        .controller('HomeController', HomeController);

    HomeController.$inject = ['$scope', 'Principal', 'LoginService', '$state','PublicSearchService'];

    function HomeController ($scope, Principal, LoginService, $state,PublicSearchService) {
        var vm = this;

        vm.account = null;
        vm.isAuthenticated = null;
        vm.login = LoginService.open;
        vm.register = register;
        vm.results = [];


        $scope.$on('authenticationSuccess', function() {
            getAccount();
        });

        getAccount();

        function getAccount() {
            Principal.identity().then(function(account) {
                vm.account = account;
                vm.isAuthenticated = Principal.isAuthenticated;
            });
        }
        function register () {
            $state.go('register');
        }

        loadAll();

        function loadAll () {
            console.log("loadAll");
            PublicSearchService.query({
                page: vm.page,
                size: vm.itemsPerPage,
                sort: sort()
            }, onSuccess, onError);
            function sort() {
                var result = [vm.predicate + ',' + (vm.reverse ? 'asc' : 'desc')];
                if (vm.predicate !== 'id') {
                    result.push('id');
                }
                return result;
            }

            function onSuccess(data) {
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
