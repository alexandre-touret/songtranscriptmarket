package info.touret.songtranscriptmarket.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.TextScore;

import javax.validation.constraints.*;
import java.io.Serializable;
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

    @Field("userid")
    private String userid;

    @NotNull
    @Field("price")
    private Float price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRequestId() {
        return requestId;
    }

    public Transcriptionrequest request_id(String request_id) {
        this.requestId = request_id;
        return this;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSongName() {
        return songName;
    }

    public Transcriptionrequest song_name(String song_name) {
        this.songName = song_name;
        return this;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public Transcriptionrequest artist(String artist) {
        this.artist = artist;
        return this;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRelease() {
        return release;
    }

    public Transcriptionrequest release(String release) {
        this.release = release;
        return this;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getUserid() {
        return userid;
    }

    public Transcriptionrequest userid(String userid) {
        this.userid = userid;
        return this;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Float getPrice() {
        return price;
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

    public void setPrice(Float price) {
        this.price = price;
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
            ", userid='" + userid + "'" +
            ", price='" + price + "'" +
            '}';
    }
}
