package info.touret.songtranscriptmarket.service.dto.musicbrainz;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by TOURET-A on 10/03/2017.
 */
public class MusicBrainzWrapper {
    public List<Artist> toArtistList(@NotNull Metadata metadata, Long scoreMin) {
        List<Artist> artists = metadata.getArtistList().getArtist().stream()
            .filter(artist -> artist.getScore() > scoreMin)
            .map(a -> new Artist(a.getName(), a.getScore()))
            .collect(Collectors.toList());
        return artists;
    }
}
