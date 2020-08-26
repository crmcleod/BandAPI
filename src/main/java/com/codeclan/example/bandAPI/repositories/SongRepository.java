package com.codeclan.example.bandAPI.repositories;

import com.codeclan.example.bandAPI.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
}
