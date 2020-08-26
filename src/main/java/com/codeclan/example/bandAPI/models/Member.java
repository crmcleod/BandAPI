package com.codeclan.example.bandAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.tools.javah.Gen;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "members")
public class Member {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "instrument")
    private String instrument;

    @Column(name = "years_active")
    private String yearsActive;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "band_id", nullable = false)
    @JsonIgnoreProperties({"members"})
    private Band band;

    @ManyToMany
    @JsonIgnoreProperties({"members"})
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @JoinTable(
            name = "members_albums",
            joinColumns = {@JoinColumn(name = "member_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn (name = "album_id", nullable = false, updatable = false)}
    )
    private List<Album> albums;

    public Member(String firstName, String lastName, String instrument, String yearsActive, Band band) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.instrument = instrument;
        this.yearsActive = yearsActive;
        this.band = band;
        this.albums = new ArrayList<Album>();
    }

    public Member(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getYearsActive() {
        return yearsActive;
    }

    public void setYearsActive(String yearsActive) {
        this.yearsActive = yearsActive;
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

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public void addAlbum(Album album) {this.albums.add(album);}
}
