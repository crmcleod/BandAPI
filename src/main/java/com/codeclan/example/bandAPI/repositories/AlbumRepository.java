package com.codeclan.example.bandAPI.repositories;

import com.codeclan.example.bandAPI.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
}
