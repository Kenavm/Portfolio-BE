package com.portfolio.backend.controllers;

import com.portfolio.backend.models.PublicUser;
import com.portfolio.backend.services.PublicUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/public-user")
@CrossOrigin(origins = "http://localhost:5173")
public class PublicUserController {
    private final PublicUserService publicUserService;

    public PublicUserController(PublicUserService publicUserService) {
        this.publicUserService = publicUserService;
    }

    @GetMapping
    public ResponseEntity<List<PublicUser>> getAllPublicUsers() {
        List<PublicUser> users = publicUserService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("{id}")
    public ResponseEntity<PublicUser> getUserById(@PathVariable Long id) {
        PublicUser user = publicUserService.findUserById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<PublicUser> addPublicUser(@RequestBody PublicUser publicUser) {
        publicUserService.save(publicUser);
        return ResponseEntity.accepted().build();
    }

}
