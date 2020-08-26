package com.codeclan.example.bandAPI.controllers;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.codeclan.example.bandAPI.models.Album;
import com.codeclan.example.bandAPI.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping(value = "/albums")
    public ResponseEntity<List<Album>> getAllAlbums(){
        return new ResponseEntity<>(albumRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/albums/{id}")
    public ResponseEntity<Optional<Album>> getAlbum(@PathVariable Long id){
        return new ResponseEntity<>(albumRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/albums")
    public ResponseEntity<Album> postAlbum(@RequestBody Album album){
        Album newAlbum = albumRepository.save(album);
        return new ResponseEntity<>(newAlbum, HttpStatus.CREATED);
    }
}
