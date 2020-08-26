package com.codeclan.example.bandAPI.controllers;

import com.codeclan.example.bandAPI.models.Band;
import com.codeclan.example.bandAPI.repositories.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BandController {

    @Autowired
    BandRepository bandRepository;

    @GetMapping(value = "/bands")
    public ResponseEntity<List<Band>> getAllBands(){
        return new ResponseEntity<>(bandRepository.findAll(), HttpStatus.OK);
    }
}
