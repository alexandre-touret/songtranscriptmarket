package info.touret.songtranscriptmarket.web.rest;

import com.google.common.base.Strings;
import info.touret.songtranscriptmarket.service.MusicBrainzService;
import info.touret.songtranscriptmarket.service.dto.musicbrainz.Artist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.List;

/**
 * Created by TOURET-A on 10/03/2017.
 */
@RestController
@RequestMapping("/api/artists")
public class ArtistSearchResource {

    private final Logger log = LoggerFactory.getLogger(ArtistSearchResource.class);

    @Autowired
    private MusicBrainzService musicBrainzService;

    public ArtistSearchResource() {

    }

    @GetMapping("/")
    public ResponseEntity<List<Artist>> getArtists(@RequestParam("q") String query, @RequestParam("cacheBuster") String cache)
        throws URISyntaxException {

        ResponseEntity<List<Artist>> responseEntity = null;
        try {
            if (!Strings.isNullOrEmpty(query)) {
                responseEntity = new ResponseEntity<>(musicBrainzService.searchArtists(query), HttpStatus.OK);
            }
        } catch (RestClientException e) {
            log.error(e.getMessage());
            responseEntity = new ResponseEntity<>(Collections.emptyList(), HttpStatus.REQUEST_TIMEOUT);
        }
        return responseEntity;
    }
}
