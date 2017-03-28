package info.touret.songtranscriptmarket.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.TextScore;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A Transcriptionrequest.
 */

@Document(collection = "transcriptionrequest")
public class Transcriptionrequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @TextScore
    private Float score;

    @Id
    private String id;

    @NotNull
    @Field("request_id")
    private String requestId;

    @NotNull
    @Field("song_name")
    @TextIndexed(weight = 2)
    private String songName;

    @NotNull
    @Field("artist")
    @TextIndexed(weight = 1)
    private String artist;

    @NotNull
    @Field("release")
    @TextIndexed()
    private String release;

    @NotNull
    @Field("user_id")
    private String userId;

    @NotNull
    @Field("price")
    private Float price;

    @NotNull
    @Field("location")
    private String location;

    @NotNull
    @Field("instrument")
    private String instrument;

    @NotNull
    @Field("last_updated")
    private ZonedDateTime lastUpdated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Transcriptionrequest requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Transcriptionrequest songName(String songName) {
        this.songName = songName;
        return this;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Transcriptionrequest artist(String artist) {
        this.artist = artist;
        return this;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public Transcriptionrequest release(String release) {
        this.release = release;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Transcriptionrequest userId(String userId) {
        this.userId = userId;
        return this;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Transcriptionrequest price(Float price) {
        this.price = price;
        return this;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Transcriptionrequest location(String location) {
        this.location = location;
        return this;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public Transcriptionrequest instrument(String instrument) {
        this.instrument = instrument;
        return this;
    }

    @LastModifiedDate
    public ZonedDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(ZonedDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Transcriptionrequest lastUpdated(ZonedDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Transcriptionrequest transcriptionrequest = (Transcriptionrequest) o;
        if (transcriptionrequest.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, transcriptionrequest.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Transcriptionrequest{" +
            "id=" + id +
            ", requestId='" + requestId + "'" +
            ", songName='" + songName + "'" +
            ", artist='" + artist + "'" +
            ", release='" + release + "'" +
            ", userId='" + userId + "'" +
            ", price='" + price + "'" +
            ", location='" + location + "'" +
            ", instrument='" + instrument + "'" +
            ", lastUpdated='" + lastUpdated + "'" +
            '}';
    }
}
