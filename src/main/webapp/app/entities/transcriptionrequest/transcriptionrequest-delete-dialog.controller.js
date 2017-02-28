(function() {
    'use strict';

    angular
        .module('songtranscriptmarketApp')
        .controller('TranscriptionrequestDeleteController',TranscriptionrequestDeleteController);

    TranscriptionrequestDeleteController.$inject = ['$uibModalInstance', 'entity', 'Transcriptionrequest'];

    function TranscriptionrequestDeleteController($uibModalInstance, entity, Transcriptionrequest) {
        var vm = this;

        vm.transcriptionrequest = entity;
        vm.clear = clear;
        vm.confirmDelete = confirmDelete;

        function clear () {
            $uibModalInstance.dismiss('cancel');
        }

        function confirmDelete (id) {
            Transcriptionrequest.delete({id: id},
                function () {
                    $uibModalInstance.close(true);
                });
        }
    }
})();
