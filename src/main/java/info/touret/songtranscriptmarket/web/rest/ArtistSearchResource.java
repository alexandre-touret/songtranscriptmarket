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

import java.net.URISyntaxException;
import java.util.ArrayList;
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
    public ResponseEntity<List<Artist>> getArtists(@RequestParam("q") String query)
        throws URISyntaxException {
        List<Artist> artists = new ArrayList<>();
        if (!Strings.isNullOrEmpty(query)) {
            artists = musicBrainzService.searchArtists(query);
        }
        return new ResponseEntity<>(artists, HttpStatus.OK);
    }
}
