package info.touret.songtranscriptmarket.web.rest;

import com.google.common.base.Strings;
import info.touret.songtranscriptmarket.domain.Transcriptionrequest;
import info.touret.songtranscriptmarket.repository.PublicSearchRepository;
import info.touret.songtranscriptmarket.web.rest.util.PaginationUtil;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by touret-a on 02/03/2017.
 */
@RestController
@RequestMapping("/public")
public class PublicSearchResource {

    private static final String ENTITY_NAME = "transcriptionrequest";
    private final Logger log = LoggerFactory.getLogger(PublicSearchResource.class);
    private final PublicSearchRepository publicSearchRepository;

    public PublicSearchResource(PublicSearchRepository publicsearchrepository) {
        this.publicSearchRepository = publicsearchrepository;
    }

    /**
     * Does a full text search
     *
     * @param query
     * @param pageable
     * @return
     * @throws URISyntaxException
     */
    @GetMapping("/transcriptionrequests")
    public ResponseEntity<List<Transcriptionrequest>> getTranscriptionrequestsByQuery(@RequestParam("q") String query, @ApiParam Pageable pageable)
        throws URISyntaxException {
        log.debug("REST request to search specifics Transcriptionrequests");
        ResponseEntity<List<Transcriptionrequest>> list = null;
        if (!Strings.isNullOrEmpty(query)) {
            TextCriteria textCriteria = TextCriteria.forDefaultLanguage().caseSensitive(Boolean.FALSE);
            log.debug(query);
            textCriteria.matching(query);
            Page<Transcriptionrequest> page = publicSearchRepository.findBy(textCriteria, pageable);
            HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/public/transcriptionrequests");
            list = new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
        } else {
            list = new ResponseEntity<List<Transcriptionrequest>>(new ArrayList<Transcriptionrequest>(), HttpStatus.OK);
        }
        return list;
    }
}
