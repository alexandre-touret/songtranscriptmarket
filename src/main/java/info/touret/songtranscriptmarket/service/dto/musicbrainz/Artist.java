package info.touret.songtranscriptmarket.service.dto.musicbrainz;

/**
 * Created by TOURET-A on 10/03/2017.
 */
public class Artist {
    private String name;
    private Long score;

    public Artist(String name, Long score) {
        this.name = name;
        this.score = score;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
