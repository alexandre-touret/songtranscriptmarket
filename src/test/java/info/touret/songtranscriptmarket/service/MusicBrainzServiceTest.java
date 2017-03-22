package info.touret.songtranscriptmarket.service;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by TOURET-A on 10/03/2017.
 */
public class MusicBrainzServiceTest {

    private MusicBrainzService musicBrainzService;

    @Before
    public void setUp() throws Exception {
        musicBrainzService = new MusicBrainzService();
    }

    @Test
    public void searchArtists() throws Exception {
        musicBrainzService.searchArtists("Bill Evans");
    }

}
