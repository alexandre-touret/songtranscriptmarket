(function () {
    'use strict';

    angular
        .module('songtranscriptmarketApp')
        .factory('ArtistSearchService', ArtistSearchService);

    ArtistSearchService.$inject = ['$resource'];

    function ArtistSearchService($resource, query) {
        var resourceUrl = 'api/artists/?q=:query';

        return $resource(resourceUrl, {}, {
            'query': {method: 'GET', isArray: true, params: {query: '@query'}}
        });
    }
})();
