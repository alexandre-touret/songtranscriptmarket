package info.touret.songtranscriptmarket.repository;

import info.touret.songtranscriptmarket.domain.Transcriptionrequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Repository for full text search
 * Created on 02/03/2017.
 */
public interface PublicSearchRepository extends CrudRepository<Transcriptionrequest, String> {
    /**
     * Find All by query
     * @param textCriteria
     * @param pageable
     * @return
     */
    Page<Transcriptionrequest> findBy(TextCriteria textCriteria, Pageable pageable);

    /**
     *
     * @param criteria
     * @return
     */
    //List<Transcriptionrequest> findAllByOrderByScoreDesc(TextCriteria criteria);
}
