package info.touret.songtranscriptmarket.web.rest;

import info.touret.songtranscriptmarket.SongtranscriptmarketApp;

import info.touret.songtranscriptmarket.domain.Transcriptionrequest;
import info.touret.songtranscriptmarket.repository.TranscriptionrequestRepository;
import info.touret.songtranscriptmarket.web.rest.errors.ExceptionTranslator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the TranscriptionrequestResource REST controller.
 *
 * @see TranscriptionrequestResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SongtranscriptmarketApp.class)
public class TranscriptionrequestResourceIntTest {

    private static final String DEFAULT_REQUEST_ID = "AAAAAAAAAA";
    private static final String UPDATED_REQUEST_ID = "BBBBBBBBBB";

    private static final String DEFAULT_SONG_NAME = "AAAAAAAAAA";
    private static final String UPDATED_SONG_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_ARTIST = "AAAAAAAAAA";
    private static final String UPDATED_ARTIST = "BBBBBBBBBB";

    private static final String DEFAULT_RELEASE = "AAAAAAAAAA";
    private static final String UPDATED_RELEASE = "BBBBBBBBBB";

    private static final String DEFAULT_USERID = "AAAAAAAAAA";
    private static final String UPDATED_USERID = "BBBBBBBBBB";

    private static final Float DEFAULT_PRICE = 1F;
    private static final Float UPDATED_PRICE = 2F;

    @Autowired
    private TranscriptionrequestRepository transcriptionrequestRepository;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    private MockMvc restTranscriptionrequestMockMvc;

    private Transcriptionrequest transcriptionrequest;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
            TranscriptionrequestResource transcriptionrequestResource = new TranscriptionrequestResource(transcriptionrequestRepository);
        this.restTranscriptionrequestMockMvc = MockMvcBuilders.standaloneSetup(transcriptionrequestResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setMessageConverters(jacksonMessageConverter).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Transcriptionrequest createEntity() {
        Transcriptionrequest transcriptionrequest = new Transcriptionrequest()
                .request_id(DEFAULT_REQUEST_ID)
                .song_name(DEFAULT_SONG_NAME)
                .artist(DEFAULT_ARTIST)
                .release(DEFAULT_RELEASE)
                .userid(DEFAULT_USERID)
                .price(DEFAULT_PRICE);
        return transcriptionrequest;
    }

    @Before
    public void initTest() {
        transcriptionrequestRepository.deleteAll();
        transcriptionrequest = createEntity();
    }

    @Test
    public void createTranscriptionrequest() throws Exception {
        int databaseSizeBeforeCreate = transcriptionrequestRepository.findAll().size();

        // Create the Transcriptionrequest

        restTranscriptionrequestMockMvc.perform(post("/api/transcriptionrequests")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(transcriptionrequest)))
            .andExpect(status().isCreated());

        // Validate the Transcriptionrequest in the database
        List<Transcriptionrequest> transcriptionrequestList = transcriptionrequestRepository.findAll();
        assertThat(transcriptionrequestList).hasSize(databaseSizeBeforeCreate + 1);
        Transcriptionrequest testTranscriptionrequest = transcriptionrequestList.get(transcriptionrequestList.size() - 1);
        assertThat(testTranscriptionrequest.getRequestId()).isEqualTo(DEFAULT_REQUEST_ID);
        assertThat(testTranscriptionrequest.getSongName()).isEqualTo(DEFAULT_SONG_NAME);
        assertThat(testTranscriptionrequest.getArtist()).isEqualTo(DEFAULT_ARTIST);
        assertThat(testTranscriptionrequest.getRelease()).isEqualTo(DEFAULT_RELEASE);
        assertThat(testTranscriptionrequest.getUserid()).isEqualTo(DEFAULT_USERID);
        assertThat(testTranscriptionrequest.getPrice()).isEqualTo(DEFAULT_PRICE);
    }

    @Test
    public void createTranscriptionrequestWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = transcriptionrequestRepository.findAll().size();

        // Create the Transcriptionrequest with an existing ID
        Transcriptionrequest existingTranscriptionrequest = new Transcriptionrequest();
        existingTranscriptionrequest.setId("existing_id");

        // An entity with an existing ID cannot be created, so this API call must fail
        restTranscriptionrequestMockMvc.perform(post("/api/transcriptionrequests")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(existingTranscriptionrequest)))
            .andExpect(status().isBadRequest());

        // Validate the Alice in the database
        List<Transcriptionrequest> transcriptionrequestList = transcriptionrequestRepository.findAll();
        assertThat(transcriptionrequestList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    public void checkRequest_idIsRequired() throws Exception {
        int databaseSizeBeforeTest = transcriptionrequestRepository.findAll().size();
        // set the field null
        transcriptionrequest.setRequestId(null);

        // Create the Transcriptionrequest, which fails.

        restTranscriptionrequestMockMvc.perform(post("/api/transcriptionrequests")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(transcriptionrequest)))
            .andExpect(status().isBadRequest());

        List<Transcriptionrequest> transcriptionrequestList = transcriptionrequestRepository.findAll();
        assertThat(transcriptionrequestList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    public void checkSong_nameIsRequired() throws Exception {
        int databaseSizeBeforeTest = transcriptionrequestRepository.findAll().size();
        // set the field null
        transcriptionrequest.setSongName(null);

        // Create the Transcriptionrequest, which fails.

        restTranscriptionrequestMockMvc.perform(post("/api/transcriptionrequests")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(transcriptionrequest)))
            .andExpect(status().isBadRequest());

        List<Transcriptionrequest> transcriptionrequestList = transcriptionrequestRepository.findAll();
        assertThat(transcriptionrequestList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    public void checkArtistIsRequired() throws Exception {
        int databaseSizeBeforeTest = transcriptionrequestRepository.findAll().size();
        // set the field null
        transcriptionrequest.setArtist(null);

        // Create the Transcriptionrequest, which fails.

        restTranscriptionrequestMockMvc.perform(post("/api/transcriptionrequests")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(transcriptionrequest)))
            .andExpect(status().isBadRequest());

        List<Transcriptionrequest> transcriptionrequestList = transcriptionrequestRepository.findAll();
        assertThat(transcriptionrequestList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    public void checkReleaseIsRequired() throws Exception {
        int databaseSizeBeforeTest = transcriptionrequestRepository.findAll().size();
        // set the field null
        transcriptionrequest.setRelease(null);

        // Create the Transcriptionrequest, which fails.

        restTranscriptionrequestMockMvc.perform(post("/api/transcriptionrequests")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(transcriptionrequest)))
            .andExpect(status().isBadRequest());

        List<Transcriptionrequest> transcriptionrequestList = transcriptionrequestRepository.findAll();
        assertThat(transcriptionrequestList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    public void checkUseridIsRequired() throws Exception {
        int databaseSizeBeforeTest = transcriptionrequestRepository.findAll().size();
        // set the field null
        transcriptionrequest.setUserid(null);

        // Create the Transcriptionrequest, which fails.

        restTranscriptionrequestMockMvc.perform(post("/api/transcriptionrequests")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(transcriptionrequest)))
            .andExpect(status().isBadRequest());

        List<Transcriptionrequest> transcriptionrequestList = transcriptionrequestRepository.findAll();
        assertThat(transcriptionrequestList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    public void checkPriceIsRequired() throws Exception {
        int databaseSizeBeforeTest = transcriptionrequestRepository.findAll().size();
        // set the field null
        transcriptionrequest.setPrice(null);

        // Create the Transcriptionrequest, which fails.

        restTranscriptionrequestMockMvc.perform(post("/api/transcriptionrequests")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(transcriptionrequest)))
            .andExpect(status().isBadRequest());

        List<Transcriptionrequest> transcriptionrequestList = transcriptionrequestRepository.findAll();
        assertThat(transcriptionrequestList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    public void getAllTranscriptionrequests() throws Exception {
        // Initialize the database
        transcriptionrequestRepository.save(transcriptionrequest);

        // Get all the transcriptionrequestList
        restTranscriptionrequestMockMvc.perform(get("/api/transcriptionrequests?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(transcriptionrequest.getId())))
            .andExpect(jsonPath("$.[*].request_id").value(hasItem(DEFAULT_REQUEST_ID.toString())))
            .andExpect(jsonPath("$.[*].song_name").value(hasItem(DEFAULT_SONG_NAME.toString())))
            .andExpect(jsonPath("$.[*].artist").value(hasItem(DEFAULT_ARTIST.toString())))
            .andExpect(jsonPath("$.[*].release").value(hasItem(DEFAULT_RELEASE.toString())))
            .andExpect(jsonPath("$.[*].userid").value(hasItem(DEFAULT_USERID.toString())))
            .andExpect(jsonPath("$.[*].price").value(hasItem(DEFAULT_PRICE.doubleValue())));
    }

    @Test
    public void getTranscriptionrequest() throws Exception {
        // Initialize the database
        transcriptionrequestRepository.save(transcriptionrequest);

        // Get the transcriptionrequest
        restTranscriptionrequestMockMvc.perform(get("/api/transcriptionrequests/{id}", transcriptionrequest.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(transcriptionrequest.getId()))
            .andExpect(jsonPath("$.request_id").value(DEFAULT_REQUEST_ID.toString()))
            .andExpect(jsonPath("$.song_name").value(DEFAULT_SONG_NAME.toString()))
            .andExpect(jsonPath("$.artist").value(DEFAULT_ARTIST.toString()))
            .andExpect(jsonPath("$.release").value(DEFAULT_RELEASE.toString()))
            .andExpect(jsonPath("$.userid").value(DEFAULT_USERID.toString()))
            .andExpect(jsonPath("$.price").value(DEFAULT_PRICE.doubleValue()));
    }

    @Test
    public void getNonExistingTranscriptionrequest() throws Exception {
        // Get the transcriptionrequest
        restTranscriptionrequestMockMvc.perform(get("/api/transcriptionrequests/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    public void updateTranscriptionrequest() throws Exception {
        // Initialize the database
        transcriptionrequestRepository.save(transcriptionrequest);
        int databaseSizeBeforeUpdate = transcriptionrequestRepository.findAll().size();

        // Update the transcriptionrequest
        Transcriptionrequest updatedTranscriptionrequest = transcriptionrequestRepository.findOne(transcriptionrequest.getId());
        updatedTranscriptionrequest
                .request_id(UPDATED_REQUEST_ID)
                .song_name(UPDATED_SONG_NAME)
                .artist(UPDATED_ARTIST)
                .release(UPDATED_RELEASE)
                .userid(UPDATED_USERID)
                .price(UPDATED_PRICE);

        restTranscriptionrequestMockMvc.perform(put("/api/transcriptionrequests")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(updatedTranscriptionrequest)))
            .andExpect(status().isOk());

        // Validate the Transcriptionrequest in the database
        List<Transcriptionrequest> transcriptionrequestList = transcriptionrequestRepository.findAll();
        assertThat(transcriptionrequestList).hasSize(databaseSizeBeforeUpdate);
        Transcriptionrequest testTranscriptionrequest = transcriptionrequestList.get(transcriptionrequestList.size() - 1);
        assertThat(testTranscriptionrequest.getRequestId()).isEqualTo(UPDATED_REQUEST_ID);
        assertThat(testTranscriptionrequest.getSongName()).isEqualTo(UPDATED_SONG_NAME);
        assertThat(testTranscriptionrequest.getArtist()).isEqualTo(UPDATED_ARTIST);
        assertThat(testTranscriptionrequest.getRelease()).isEqualTo(UPDATED_RELEASE);
        assertThat(testTranscriptionrequest.getUserid()).isEqualTo(UPDATED_USERID);
        assertThat(testTranscriptionrequest.getPrice()).isEqualTo(UPDATED_PRICE);
    }

    @Test
    public void updateNonExistingTranscriptionrequest() throws Exception {
        int databaseSizeBeforeUpdate = transcriptionrequestRepository.findAll().size();

        // Create the Transcriptionrequest

        // If the entity doesn't have an ID, it will be created instead of just being updated
        restTranscriptionrequestMockMvc.perform(put("/api/transcriptionrequests")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(transcriptionrequest)))
            .andExpect(status().isCreated());

        // Validate the Transcriptionrequest in the database
        List<Transcriptionrequest> transcriptionrequestList = transcriptionrequestRepository.findAll();
        assertThat(transcriptionrequestList).hasSize(databaseSizeBeforeUpdate + 1);
    }

    @Test
    public void deleteTranscriptionrequest() throws Exception {
        // Initialize the database
        transcriptionrequestRepository.save(transcriptionrequest);
        int databaseSizeBeforeDelete = transcriptionrequestRepository.findAll().size();

        // Get the transcriptionrequest
        restTranscriptionrequestMockMvc.perform(delete("/api/transcriptionrequests/{id}", transcriptionrequest.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Transcriptionrequest> transcriptionrequestList = transcriptionrequestRepository.findAll();
        assertThat(transcriptionrequestList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Transcriptionrequest.class);
    }
}
