(function() {
    'use strict';
    angular
        .module('songtranscriptmarketApp')
        .factory('Transcriptionrequest', Transcriptionrequest);

    Transcriptionrequest.$inject = ['$resource'];

    function Transcriptionrequest ($resource) {
        var resourceUrl =  'api/transcriptionrequests/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    if (data) {
                        data = angular.fromJson(data);
                    }
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    }
})();
