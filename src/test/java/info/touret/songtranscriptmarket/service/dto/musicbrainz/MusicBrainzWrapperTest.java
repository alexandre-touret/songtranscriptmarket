package info.touret.songtranscriptmarket.service.dto.musicbrainz;

import info.touret.songtranscriptmarket.service.util.MusicBrainzWrapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by TOURET-A on 10/03/2017.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class MusicBrainzWrapperTest {


    private Metadata metadata;

    @InjectMocks
    private Metadata.ArtistList artistList;

    @Mock
    private List<Metadata.ArtistList.Artist> artists;

    @Mock
    private Metadata.ArtistList.Artist artist;

    private MusicBrainzWrapper musicBrainzWrapper;

    @Before
    public void setUp() throws Exception {

        metadata = new Metadata();
        artistList = new Metadata.ArtistList();

        metadata.setArtistList(artistList);
        musicBrainzWrapper = new MusicBrainzWrapper();
    }

    @Test
    public void toArtistList_OK() throws Exception {
        createSimpleList();
        List<Artist> artists1 = musicBrainzWrapper.toArtistList(metadata, 3L);
        assertNotNull(artists1);
        assertTrue(artists1.size() == 1);
    }

    @Test
    public void toArtistList_Score_Too_BIG() throws Exception {
        createSimpleList();
        List<Artist> artists1 = musicBrainzWrapper.toArtistList(metadata, 100L);
        assertNotNull(artists1);
        assertTrue(artists1.isEmpty());
    }

    private void createSimpleList() {
        artists = new ArrayList<>();
        artistList.artist = artists;
        artist = new Metadata.ArtistList.Artist();
        artist.setName("Bill Evans");
        artist.setScore(50L);
        artists.add(artist);
    }
}
