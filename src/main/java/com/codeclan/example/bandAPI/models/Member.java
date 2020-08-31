package com.codeclan.example.bandAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
//    @JsonIgnoreProperties({"members"})
    @JsonBackReference
    @JoinColumn (name = "band_id", nullable = false)
    private Band band;

    public Member(String firstName, String lastName, String instrument, String yearsActive, Band band) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.instrument = instrument;
        this.yearsActive = yearsActive;
        this.band = band;
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

}
