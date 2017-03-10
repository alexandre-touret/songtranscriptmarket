package info.touret.songtranscriptmarket.service;

import info.touret.songtranscriptmarket.service.dto.musicbrainz.Artist;
import info.touret.songtranscriptmarket.service.dto.musicbrainz.Metadata;
import info.touret.songtranscriptmarket.service.util.MusicBrainzWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MusicBrainzService {

    private final Logger log = LoggerFactory.getLogger(MusicBrainzService.class);

    @Value("musicbrainz.url")
    private String musicBrainzURL;

    public List<Artist> searchArtists(final String artist) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new Jaxb2RootElementHttpMessageConverter());

        Metadata metadata = restTemplate.getForObject(musicBrainzURL.concat(artist), Metadata.class);
        MusicBrainzWrapper musicBrainzWrapper = new MusicBrainzWrapper();
        return musicBrainzWrapper.toArtistList(metadata, 50L);
    }

}
