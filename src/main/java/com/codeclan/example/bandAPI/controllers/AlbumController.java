package com.codeclan.example.bandAPI.controllers;

import com.codeclan.example.bandAPI.models.Album;
import com.codeclan.example.bandAPI.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping(value = "/albums")
    public ResponseEntity<List<Album>> getAllAlbums(){
        return new ResponseEntity<>(albumRepository.findAll(), HttpStatus.OK);
    }
}
