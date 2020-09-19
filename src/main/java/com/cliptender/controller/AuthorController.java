package com.cliptender.controller;

import com.cliptender.dto.VideoSuggestionDTO;
import com.cliptender.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/addnewvideo")
    public ResponseEntity addVideo(@RequestParam int id, @RequestBody VideoSuggestionDTO videoSuggestionCreationDTO){
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/getallsuggestionvideo")
    public ResponseEntity getAllSuggestionVideo(){
        return ResponseEntity.ok("ok");
    }
}
