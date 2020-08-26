package com.codeclan.example.bandAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "albums")
public class Album {

    @Column(name="album_name")
    private String albumName;

    @Column(name="release_year")
    private int releaseYear;

    @Column(name="type")
    private String type;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "album", fetch = FetchType.EAGER)
    @JsonIgnoreProperties({"albums"})
    private List<Song> songs;


    @ManyToOne
    @JoinColumn (name = "band_id", nullable = false)
    @JsonIgnoreProperties({"albums"})
    private Band band;

    @ManyToMany
    @JsonIgnoreProperties({"albums"})
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @JoinTable(
            name = "albums_members",
            joinColumns = {@JoinColumn(name = "album_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn (name = "member_id", nullable = false, updatable = false)}
    )
    private List<Member> members;

    public Album(String albumName, int releaseYear, String type, Band band) {
        this.albumName = albumName;
        this.releaseYear = releaseYear;
        this.type = type;
        this.band = band;
        this.members = new ArrayList<Member>();
        this.songs = new ArrayList<Song>();
    }

    public Album(){}

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void addMember(Member member) {this.members.add(member); }

    public void addSong(Song song) {this.songs.add(song);}
}


