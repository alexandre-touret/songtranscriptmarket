(function() {
    'use strict';

    angular
        .module('songtranscriptmarketApp')
        .factory('PublicSearchService', PublicSearchService);

    PublicSearchService.$inject = ['$resource'];

    function PublicSearchService ($resource,query) {
        var resourceUrl =  'public/transcriptionrequests';

        return $resource(resourceUrl+'?q='+JSON.stringify(query), {}, {
            'query': { method: 'GET', isArray: true}
        });
    }
})();
