(function() {
    'use strict';

    angular
        .module('songtranscriptmarketApp')
        .factory('PublicSearchService', PublicSearchService);

    PublicSearchService.$inject = ['$resource'];

    function PublicSearchService ($resource,query) {
        var resourceUrl =  'public/transcriptionrequests?q=:query';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true, params:{query: '@query'}}
        });
    }
})();
