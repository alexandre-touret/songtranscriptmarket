(function() {
    'use strict';

    angular
        .module('songtranscriptmarketApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig($stateProvider) {
        $stateProvider
        .state('transcriptionrequest', {
            parent: 'entity',
            url: '/transcriptionrequest',
            data: {
                authorities: ['ROLE_USER'],
                pageTitle: 'songtranscriptmarketApp.transcriptionrequest.home.title'
            },
            views: {
                'content@': {
                    templateUrl: 'app/entities/transcriptionrequest/transcriptionrequests.html',
                    controller: 'TranscriptionrequestController',
                    controllerAs: 'vm'
                }
            },
            resolve: {
                translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                    $translatePartialLoader.addPart('transcriptionrequest');
                    $translatePartialLoader.addPart('global');
                    return $translate.refresh();
                }]
            }
        })
        .state('transcriptionrequest-detail', {
            parent: 'transcriptionrequest',
            url: '/transcriptionrequest/{id}',
            data: {
                authorities: ['ROLE_USER'],
                pageTitle: 'songtranscriptmarketApp.transcriptionrequest.detail.title'
            },
            views: {
                'content@': {
                    templateUrl: 'app/entities/transcriptionrequest/transcriptionrequest-detail.html',
                    controller: 'TranscriptionrequestDetailController',
                    controllerAs: 'vm'
                }
            },
            resolve: {
                translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                    $translatePartialLoader.addPart('transcriptionrequest');
                    return $translate.refresh();
                }],
                entity: ['$stateParams', 'Transcriptionrequest', function($stateParams, Transcriptionrequest) {
                    return Transcriptionrequest.get({id : $stateParams.id}).$promise;
                }],
                previousState: ["$state", function ($state) {
                    var currentStateData = {
                        name: $state.current.name || 'transcriptionrequest',
                        params: $state.params,
                        url: $state.href($state.current.name, $state.params)
                    };
                    return currentStateData;
                }]
            }
        })
        .state('transcriptionrequest-detail.edit', {
            parent: 'transcriptionrequest-detail',
            url: '/detail/edit',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/transcriptionrequest/transcriptionrequest-dialog.html',
                    controller: 'TranscriptionrequestDialogController',
                    controllerAs: 'vm',
                    backdrop: 'static',
                    size: 'lg',
                    resolve: {
                        entity: ['Transcriptionrequest', function(Transcriptionrequest) {
                            return Transcriptionrequest.get({id : $stateParams.id}).$promise;
                        }]
                    }
                }).result.then(function() {
                    $state.go('^', {}, { reload: false });
                }, function() {
                    $state.go('^');
                });
            }]
        })
        .state('transcriptionrequest.new', {
            parent: 'transcriptionrequest',
            url: '/new',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/transcriptionrequest/transcriptionrequest-dialog.html',
                    controller: 'TranscriptionrequestDialogController',
                    controllerAs: 'vm',
                    backdrop: 'static',
                    size: 'lg',
                    resolve: {
                        entity: function () {
                            return {
                                request_id: null,
                                song_name: null,
                                artist: null,
                                release: null,
                                userid: null,
                                price: null,
                                id: null
                            };
                        }
                    }
                }).result.then(function() {
                    $state.go('transcriptionrequest', null, { reload: 'transcriptionrequest' });
                }, function() {
                    $state.go('transcriptionrequest');
                });
            }]
        })
        .state('transcriptionrequest.edit', {
            parent: 'transcriptionrequest',
            url: '/{id}/edit',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/transcriptionrequest/transcriptionrequest-dialog.html',
                    controller: 'TranscriptionrequestDialogController',
                    controllerAs: 'vm',
                    backdrop: 'static',
                    size: 'lg',
                    resolve: {
                        entity: ['Transcriptionrequest', function(Transcriptionrequest) {
                            return Transcriptionrequest.get({id : $stateParams.id}).$promise;
                        }]
                    }
                }).result.then(function() {
                    $state.go('transcriptionrequest', null, { reload: 'transcriptionrequest' });
                }, function() {
                    $state.go('^');
                });
            }]
        })
        .state('transcriptionrequest.delete', {
            parent: 'transcriptionrequest',
            url: '/{id}/delete',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/transcriptionrequest/transcriptionrequest-delete-dialog.html',
                    controller: 'TranscriptionrequestDeleteController',
                    controllerAs: 'vm',
                    size: 'md',
                    resolve: {
                        entity: ['Transcriptionrequest', function(Transcriptionrequest) {
                            return Transcriptionrequest.get({id : $stateParams.id}).$promise;
                        }]
                    }
                }).result.then(function() {
                    $state.go('transcriptionrequest', null, { reload: 'transcriptionrequest' });
                }, function() {
                    $state.go('^');
                });
            }]
        });
    }

})();
