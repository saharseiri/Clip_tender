package com.cliptender.controller;


import com.cliptender.dto.VideoRequestCreationDTO;
import com.cliptender.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addnewrequestvideo")
    public ResponseEntity addRequestVideo(@RequestParam int id, @RequestBody VideoRequestCreationDTO videoRequestCreationDTO) {
        userService.addNewRequestVideo(id, videoRequestCreationDTO);
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/getallrequestvideos")
    public ResponseEntity getAllRequestVideo() {
        List<VideoRequestCreationDTO> requestVideoList = userService.getAllRequestVideo();
        return ResponseEntity.ok(requestVideoList);
    }


}
