package com.codeclan.example.bandAPI.controllers;

import com.codeclan.example.bandAPI.models.Song;
import com.codeclan.example.bandAPI.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SongController {
    @Autowired
    SongRepository songRepository;

    @GetMapping(value="/songs")
    public ResponseEntity<List<Song>> getAllSongs(){
        return new ResponseEntity<>( songRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/songs/{id}")
    public ResponseEntity<Optional<Song>> getSong(@PathVariable Long id){
        return new ResponseEntity<>(songRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/songs")
    public ResponseEntity<Song> postSong(@RequestBody Song song){
        Song newSong = songRepository.save(song);
        return new ResponseEntity<>(newSong, HttpStatus.CREATED);
    }
}
