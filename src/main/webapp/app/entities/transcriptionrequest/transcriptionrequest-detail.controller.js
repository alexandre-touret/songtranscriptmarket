(function() {
    'use strict';

    angular
        .module('songtranscriptmarketApp')
        .controller('TranscriptionrequestDetailController', TranscriptionrequestDetailController);

    TranscriptionrequestDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'entity', 'Transcriptionrequest'];

    function TranscriptionrequestDetailController($scope, $rootScope, $stateParams, previousState, entity, Transcriptionrequest) {
        var vm = this;

        vm.transcriptionrequest = entity;
        vm.previousState = previousState.name;

        var unsubscribe = $rootScope.$on('songtranscriptmarketApp:transcriptionrequestUpdate', function(event, result) {
            vm.transcriptionrequest = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
