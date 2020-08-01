package com.cliptender.controller;

import com.cliptender.dto.VideoSuggestionCreationDTO;
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
    public ResponseEntity addVideo(@RequestParam int id, @RequestBody VideoSuggestionCreationDTO videoSuggestionCreationDTO){

        authorService.addNewSuggestionVideo(id , videoSuggestionCreationDTO);
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/getallsuggestionvideo")
    public ResponseEntity getAllSuggestionVideo(){
        List<VideoSuggestionCreationDTO> videoSuggestionCreationDTOS = authorService.getAllVideoSugegstion();
        return ResponseEntity.ok(videoSuggestionCreationDTOS);
    }
}
