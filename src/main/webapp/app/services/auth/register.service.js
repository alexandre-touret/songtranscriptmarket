(function () {
    'use strict';

    angular
        .module('songtranscriptmarketApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();
