package com.codeclan.example.bandAPI.controllers;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.codeclan.example.bandAPI.models.Member;
import com.codeclan.example.bandAPI.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping(value = "/members")
    public ResponseEntity<List<Member>> getAllMembers(){
        return new ResponseEntity<>(memberRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/members/{id}")
    public ResponseEntity<Optional<Member>> getMember(@PathVariable Long id){
        return new ResponseEntity<>(memberRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/members")
    public ResponseEntity<Member> postMember(@RequestBody Member member){
        Member newMember = memberRepository.save(member);
        return new ResponseEntity<>(newMember, HttpStatus.CREATED);
    }

}
