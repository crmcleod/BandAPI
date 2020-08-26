package com.codeclan.example.bandAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "bands")
public class Band {

    @Column(name = "name")
    private String name;

    @Column(name = "year_established")
    private int yearEstablished;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "band", fetch = FetchType.EAGER)
    @JsonIgnoreProperties({"bands"})
    private List<Song> songs;

    @OneToMany(mappedBy = "band", fetch = FetchType.EAGER)
    @JsonIgnoreProperties({"bands"})
    private List<Album> albums;

    @ManyToMany
    @JsonIgnoreProperties({"bands"})
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @JoinTable(
            name = "bands_members",
            joinColumns = {@JoinColumn(name = "band_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn (name = "member_id", nullable = false, updatable = false)}
    )
    private List<Member> members;

    public Band(String name, int yearEstablished) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.songs = new ArrayList<Song>();
        this.members = new ArrayList<Member>();
        this.albums = new ArrayList<Album>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public void addSong(Song song) {this.songs.add(song);}

    public void addMember(Member member) {this.members.add(member);}

    public void addAlbum(Album album) {this.albums.add(album);}

}
