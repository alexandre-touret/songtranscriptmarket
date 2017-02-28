(function() {
    'use strict';

    angular
        .module('songtranscriptmarketApp')
        .controller('TranscriptionrequestDialogController', TranscriptionrequestDialogController);

    TranscriptionrequestDialogController.$inject = ['$timeout', '$scope', '$stateParams', '$uibModalInstance', 'entity', 'Transcriptionrequest'];

    function TranscriptionrequestDialogController ($timeout, $scope, $stateParams, $uibModalInstance, entity, Transcriptionrequest) {
        var vm = this;

        vm.transcriptionrequest = entity;
        vm.clear = clear;
        vm.save = save;

        $timeout(function (){
            angular.element('.form-group:eq(1)>input').focus();
        });

        function clear () {
            $uibModalInstance.dismiss('cancel');
        }

        function save () {
            vm.isSaving = true;
            if (vm.transcriptionrequest.id !== null) {
                Transcriptionrequest.update(vm.transcriptionrequest, onSaveSuccess, onSaveError);
            } else {
                Transcriptionrequest.save(vm.transcriptionrequest, onSaveSuccess, onSaveError);
            }
        }

        function onSaveSuccess (result) {
            $scope.$emit('songtranscriptmarketApp:transcriptionrequestUpdate', result);
            $uibModalInstance.close(result);
            vm.isSaving = false;
        }

        function onSaveError () {
            vm.isSaving = false;
        }


    }
})();
