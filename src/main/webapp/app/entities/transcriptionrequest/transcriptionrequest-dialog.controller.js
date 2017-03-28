(function () {
    'use strict';

    angular
        .module('songtranscriptmarketApp')
        .controller('TranscriptionrequestDialogController', TranscriptionrequestDialogController);

    TranscriptionrequestDialogController.$inject = ['$timeout', '$scope', '$stateParams', '$uibModalInstance', 'entity', 'Transcriptionrequest', 'ArtistSearchService', 'AlertService'];

    function TranscriptionrequestDialogController($timeout, $scope, $stateParams, $uibModalInstance, entity, Transcriptionrequest, ArtistSearchService, AlertService) {
        var vm = this;

        vm.transcriptionrequest = entity;
        vm.clear = clear;
        vm.save = save;
        vm.artistsearchresults = findArtists();

        $timeout(function () {
            angular.element('.form-group:eq(1)>input').focus();
        });

        vm.artistsearchquery = '';

        function clear() {
            $uibModalInstance.dismiss('cancel');
        }

        function save() {
            vm.isSaving = true;
            if (vm.transcriptionrequest.id !== null) {
                Transcriptionrequest.update(vm.transcriptionrequest, onSaveSuccess, onSaveError);
            } else {
                Transcriptionrequest.save(vm.transcriptionrequest, onSaveSuccess, onSaveError);
            }
        }

        function onSaveSuccess(result) {
            $scope.$emit('songtranscriptmarketApp:transcriptionrequestUpdate', result);
            $uibModalInstance.close(result);
            vm.isSaving = false;
        }

        function onSaveError() {
            vm.isSaving = false;
        }


        function findArtists() {
            if (vm.artistsearchquery != undefined
                && vm.artistsearchquery != null
                && vm.artistsearchquery.length > 4) {
                ArtistSearchService.query({
                    query: vm.transcriptionrequest.artist
                }, onSuccess, onError);


            }
            function onSuccess(data) {
                vm.artistsearchresults = [];
                for (var i = 0; i < data.length; i++) {
                    console.log(data[i]);
                    vm.artistsearchresults.push(data[i]);
                }
            }

            function onError(error) {
                AlertService.error(error.data.message);
            }
        }

        function addArtistOnForm(item) {
            vm.transcriptionrequest.artist = item.name;
        }

        $scope.$watch('vm.transcriptionrequest.artist', function (p1, p2, p3) {
            vm.artistsearchquery = p1;
            findArtists();
        });

    }
})();
