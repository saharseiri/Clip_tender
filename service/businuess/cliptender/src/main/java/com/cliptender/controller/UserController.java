package com.cliptender.controller;


import com.cliptender.domain.UserDomain;
import com.cliptender.repository.UserRepository;
import com.cliptender.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping("/findbyid/")
    public ResponseEntity find() {

        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/findLikeby/{id}")
    public ResponseEntity findNumberOfActualLike(@PathVariable int id) {
        int likeNumber = userService.getLikeValue(id);
        return ResponseEntity.ok(likeNumber);
    }

    @PostMapping
    public ResponseEntity creat(@RequestBody UserDomain userDomain) {

        return ResponseEntity.ok(userRepository.save(userDomain));
    }

    @PutMapping("/addlike/{id}")
    public void addOneLikeToMovie(@PathVariable int id) {
        userService.addLikeToClipByReference(id);
    }


}
