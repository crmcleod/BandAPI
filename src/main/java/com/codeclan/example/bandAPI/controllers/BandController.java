package com.codeclan.example.bandAPI.controllers;

import com.codeclan.example.bandAPI.models.Band;
import com.codeclan.example.bandAPI.repositories.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BandController {

    @Autowired
    BandRepository bandRepository;

    @GetMapping(value = "/bands")
    public ResponseEntity<List<Band>> getAllBands(){
        return new ResponseEntity<>(bandRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/bands/{id}")
    public ResponseEntity<Optional<Band>> getBand(@PathVariable Long id){
        return new ResponseEntity<>(bandRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/bands")
    public ResponseEntity<Band> postBand(@RequestBody Band band){
        Band newBand = bandRepository.save(band);
        return new ResponseEntity<>(newBand, HttpStatus.CREATED);
    }
}
