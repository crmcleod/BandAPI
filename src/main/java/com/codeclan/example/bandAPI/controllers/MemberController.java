package com.codeclan.example.bandAPI.controllers;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.codeclan.example.bandAPI.models.Member;
import com.codeclan.example.bandAPI.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping(value = "/members")
    public ResponseEntity<List<Member>> getAllMembers(){
        return new ResponseEntity<>(memberRepository.findAll(), HttpStatus.OK);
    }

}
