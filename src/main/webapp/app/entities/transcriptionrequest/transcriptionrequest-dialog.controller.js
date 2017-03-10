(function() {
    'use strict';

    angular
        .module('songtranscriptmarketApp')
        .controller('TranscriptionrequestDialogController', TranscriptionrequestDialogController);

    TranscriptionrequestDialogController.$inject = ['$timeout', '$scope', '$stateParams', '$uibModalInstance', 'entity', 'Transcriptionrequest', 'ArtistSearchService'];

    function TranscriptionrequestDialogController($timeout, $scope, $stateParams, $uibModalInstance, entity, Transcriptionrequest, ArtistSearchService) {
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

        function searchArtist(query) {
            console.log("search");
            PublicSearchService.query({
                query: query
            }, onSuccess, onError);

            function onSuccess(data) {
                vm.results = [];
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
