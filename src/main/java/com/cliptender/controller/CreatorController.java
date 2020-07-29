package com.cliptender.controller;

import com.cliptender.domain.CreatorDomain;
import com.cliptender.repository.CreatorRepository;
import com.cliptender.service.CreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/creator")
public class CreatorController {

    @Autowired
    CreatorRepository repository;

    @Autowired
    CreatorService creatorService;

    @GetMapping("/findLike/{id}")
    public ResponseEntity findActualLikeValue(@PathVariable int id) {

        int likeNumber = creatorService.getLikeValue(id);
        return ResponseEntity.ok(likeNumber);
    }

    @GetMapping("/find/")
    public ResponseEntity findAllClip() {

        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity creatclip(@RequestBody CreatorDomain creatorDomain) {

        return ResponseEntity.ok(repository.save(creatorDomain));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody CreatorDomain creatorDomain) {

        return ResponseEntity.ok(repository.save(creatorDomain));
    }

    @PutMapping("/updateclip/")
    public void updateclip(@PathVariable String clipName, String branchActivity) {
        creatorService.addNewClip(clipName, branchActivity);
    }

    @DeleteMapping
    public void delete(@RequestBody CreatorDomain creatorDomain) {

        repository.delete(creatorDomain);
    }


}
