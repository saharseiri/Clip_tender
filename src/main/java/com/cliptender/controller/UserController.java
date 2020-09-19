package com.cliptender.controller;


import com.cliptender.dto.VideoRecordedDTO;
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
    public ResponseEntity addRequestVideo(@RequestParam int id, @RequestBody VideoRecordedDTO videoRequestCreationDTO) {
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/getallrequestvideos")
    public ResponseEntity getAllRequestVideo() {
        return ResponseEntity.ok("ok");
    }


}
