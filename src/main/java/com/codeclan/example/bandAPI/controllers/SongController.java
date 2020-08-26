package com.codeclan.example.bandAPI.controllers;

import com.codeclan.example.bandAPI.models.Song;
import com.codeclan.example.bandAPI.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {
    @Autowired
    SongRepository songRepository;

    @GetMapping(value="/songs")
    public ResponseEntity<List<Song>> getAllSongs(){
        return new ResponseEntity<>( songRepository.findAll(), HttpStatus.OK);
    }
}
