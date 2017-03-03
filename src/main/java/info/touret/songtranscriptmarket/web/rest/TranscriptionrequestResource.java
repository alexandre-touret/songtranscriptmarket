package info.touret.songtranscriptmarket.web.rest;

import com.codahale.metrics.annotation.Timed;
import info.touret.songtranscriptmarket.domain.Transcriptionrequest;

import info.touret.songtranscriptmarket.repository.TranscriptionrequestRepository;
import info.touret.songtranscriptmarket.service.UserService;
import info.touret.songtranscriptmarket.web.rest.util.HeaderUtil;
import info.touret.songtranscriptmarket.web.rest.util.PaginationUtil;
import io.swagger.annotations.ApiParam;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * REST controller for managing Transcriptionrequest.
 */
@RestController
@RequestMapping("/api")
public class TranscriptionrequestResource {

    private final Logger log = LoggerFactory.getLogger(TranscriptionrequestResource.class);

    private static final String ENTITY_NAME = "transcriptionrequest";

    @Autowired
    UserService userService;

    private final TranscriptionrequestRepository transcriptionrequestRepository;

    public TranscriptionrequestResource(TranscriptionrequestRepository transcriptionrequestRepository) {
        this.transcriptionrequestRepository = transcriptionrequestRepository;
    }

    /**
     * POST  /transcriptionrequests : Create a new transcriptionrequest.
     *
     * @param transcriptionrequest the transcriptionrequest to create
     * @return the ResponseEntity with status 201 (Created) and with body the new transcriptionrequest, or with status 400 (Bad Request) if the transcriptionrequest has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/transcriptionrequests")
    @Timed
    public ResponseEntity<Transcriptionrequest> createTranscriptionrequest(@Valid @RequestBody Transcriptionrequest transcriptionrequest) throws URISyntaxException {
        log.debug("REST request to save Transcriptionrequest : {}", transcriptionrequest);
        if (transcriptionrequest.getId() != null) {
            return ResponseEntity.badRequest().headers(HeaderUtil.createFailureAlert(ENTITY_NAME, "idexists", "A new transcriptionrequest cannot already have an ID")).body(null);
        }
        transcriptionrequest.setUserid(userService.getUserWithAuthorities().getId());
        transcriptionrequest.setRequestId(UUID.randomUUID().toString());
        Transcriptionrequest result = transcriptionrequestRepository.save(transcriptionrequest);
        return ResponseEntity.created(new URI("/api/transcriptionrequests/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }
    /**
     * PUT  /transcriptionrequests : Updates an existing transcriptionrequest.
     *
     * @param transcriptionrequest the transcriptionrequest to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated transcriptionrequest,
     * or with status 400 (Bad Request) if the transcriptionrequest is not valid,
     * or with status 500 (Internal Server Error) if the transcriptionrequest couldnt be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/transcriptionrequests")
    @Timed
    public ResponseEntity<Transcriptionrequest> updateTranscriptionrequest(@Valid @RequestBody Transcriptionrequest transcriptionrequest) throws URISyntaxException {
        log.debug("REST request to update Transcriptionrequest : {}", transcriptionrequest);
        if (transcriptionrequest.getId() == null) {
            return createTranscriptionrequest(transcriptionrequest);
        }
        Transcriptionrequest result = transcriptionrequestRepository.save(transcriptionrequest);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, transcriptionrequest.getId().toString()))
            .body(result);
    }

    /**
     * GET  /transcriptionrequests : get all the transcriptionrequests.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of transcriptionrequests in body
     * @throws URISyntaxException if there is an error to generate the pagination HTTP headers
     */
    @GetMapping("/transcriptionrequests")
    @Timed
    public ResponseEntity<List<Transcriptionrequest>> getAllTranscriptionrequests(@ApiParam Pageable pageable)
        throws URISyntaxException {
        log.debug("REST request to get a page of Transcriptionrequests");
        Page<Transcriptionrequest> page = transcriptionrequestRepository.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/transcriptionrequests");
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }


    /**
     * GET  /transcriptionrequests/:id : get the "id" transcriptionrequest.
     *
     * @param id the id of the transcriptionrequest to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the transcriptionrequest, or with status 404 (Not Found)
     */
    @GetMapping("/transcriptionrequests/{id}")
    @Timed
    public ResponseEntity<Transcriptionrequest> getTranscriptionrequest(@PathVariable String id) {
        log.debug("REST request to get Transcriptionrequest : {}", id);
        Transcriptionrequest transcriptionrequest = transcriptionrequestRepository.findOne(id);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(transcriptionrequest));
    }

    /**
     * DELETE  /transcriptionrequests/:id : delete the "id" transcriptionrequest.
     *
     * @param id the id of the transcriptionrequest to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/transcriptionrequests/{id}")
    @Timed
    public ResponseEntity<Void> deleteTranscriptionrequest(@PathVariable String id) {
        log.debug("REST request to delete Transcriptionrequest : {}", id);
        transcriptionrequestRepository.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }

}
