package com.codeclan.example.bandAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.tools.javah.Gen;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

@Entity
@Table(name = "songs")
public class Song {

    @Column(name = "song_name")
    private String songName;

    @Column(name = "length")
    private double length;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "album_id", nullable = false)
    @JsonIgnoreProperties({"songs"})
    private Album album;

    @ManyToOne
    @JoinColumn ( name = "band_id", nullable = false)
    @JsonIgnoreProperties ({"songs"})
    private Band band;

    public Song(String songName, double length) {
        this.songName = songName;
        this.length = length;
    }

    public Song(){}

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
}
