package info.touret.songtranscriptmarket.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * Properties specific to JHipster.
 *
 * <p>
 *     Properties are configured in the application.yml file.
 * </p>
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
    private Map<String, String> musicbrainz;

    public Map<String, String> getMusicbrainz() {
        return musicbrainz;
    }

    public void setMusicbrainz(Map<String, String> musicbrainz) {
        this.musicbrainz = musicbrainz;
    }
}
