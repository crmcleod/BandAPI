package com.codeclan.example.bandAPI.repositories;

import com.codeclan.example.bandAPI.models.Band;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepository extends JpaRepository<Band, Long> {
}
