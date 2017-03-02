package info.touret.songtranscriptmarket.web.rest;

import info.touret.songtranscriptmarket.domain.Transcriptionrequest;
import info.touret.songtranscriptmarket.repository.TranscriptionrequestRepository;
import info.touret.songtranscriptmarket.web.rest.util.PaginationUtil;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by touret-a on 02/03/2017.
 */
@RestController
@RequestMapping("/public")
public class PublicSearchResource {

    private final Logger log = LoggerFactory.getLogger(TranscriptionrequestResource.class);

    private static final String ENTITY_NAME = "transcriptionrequest";

    public PublicSearchResource(TranscriptionrequestRepository transcriptionrequestRepository) {
        this.transcriptionrequestRepository = transcriptionrequestRepository;
    }

    @GetMapping("/transcriptionrequests")
    public ResponseEntity<List<Transcriptionrequest>> getTranscriptionrequestsByQuery(@RequestParam("q") String query, @ApiParam Pageable pageable)
        throws URISyntaxException {
        log.debug("REST request to search specifics Transcriptionrequests");
        Page<Transcriptionrequest> page = transcriptionrequestRepository.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/public/transcriptionrequests");
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

    private final TranscriptionrequestRepository transcriptionrequestRepository;
}
