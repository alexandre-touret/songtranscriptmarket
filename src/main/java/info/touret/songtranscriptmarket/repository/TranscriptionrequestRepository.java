package info.touret.songtranscriptmarket.repository;

import info.touret.songtranscriptmarket.domain.Transcriptionrequest;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Transcriptionrequest entity.
 */
@SuppressWarnings("unused")
public interface TranscriptionrequestRepository extends MongoRepository<Transcriptionrequest,String> {

}
