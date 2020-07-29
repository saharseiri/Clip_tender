package com.cliptender.controller;

import com.cliptender.domain.AuthorDomain;
import com.cliptender.repository.CreatorRepository;
import com.cliptender.service.CreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    CreatorRepository repository;

    @Autowired
    CreatorService creatorService;

//    @GetMapping("//{id}")
//    public

}
