package info.touret.songtranscriptmarket.service;

import info.touret.songtranscriptmarket.config.ApplicationProperties;
import info.touret.songtranscriptmarket.service.dto.musicbrainz.Artist;
import info.touret.songtranscriptmarket.service.dto.musicbrainz.Metadata;
import info.touret.songtranscriptmarket.service.util.MusicBrainzWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Service for music brainz
 */
@Service
public class MusicBrainzService {

    private final Logger log = LoggerFactory.getLogger(MusicBrainzService.class);


    @Inject
    private ApplicationProperties applicationProperties;

    /**
     * Search artists from musicbrainz.
     *
     * @param artist
     * @return The list of artists.
     */
    public List<Artist> searchArtists(final String artist) {
        List<Artist> artists = new ArrayList<>();
        try {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new Jaxb2RootElementHttpMessageConverter());

            Metadata metadata = restTemplate.getForObject(applicationProperties.getMusicbrainz().get("url").concat(artist), Metadata.class);
            MusicBrainzWrapper musicBrainzWrapper = new MusicBrainzWrapper();
            artists = musicBrainzWrapper.toArtistList(metadata, 50L);
        } catch (RestClientException e) {
            log.error(e.getMessage(), e);
            throw e;
        }
        return artists;
    }

}
