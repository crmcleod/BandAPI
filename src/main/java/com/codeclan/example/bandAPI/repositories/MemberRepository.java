package com.codeclan.example.bandAPI.repositories;

import com.codeclan.example.bandAPI.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
