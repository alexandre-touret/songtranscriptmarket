(function() {
    'use strict';
    angular
        .module('songtranscriptmarketApp')
        .factory('Transcriptionrequest', Transcriptionrequest);

    Transcriptionrequest.$inject = ['$resource', 'DateUtils'];

    function Transcriptionrequest($resource, DateUtils) {
        var resourceUrl =  'api/transcriptionrequests/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    if (data) {
                        data = angular.fromJson(data);
                        data.lastUpdated = DateUtils.convertDateTimeFromServer(data.lastUpdated);
                    }
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    }
})();
