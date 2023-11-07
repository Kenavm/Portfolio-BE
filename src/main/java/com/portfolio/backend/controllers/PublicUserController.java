package com.portfolio.backend.controllers;

import com.portfolio.backend.models.PublicUser;
import com.portfolio.backend.services.PublicUserService;
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
    public List<PublicUser> getAllPublicUsers() {
        return publicUserService.findAll();
    }

    @GetMapping("{user_id}")
    public PublicUser getUserById(@PathVariable Long user_id) {
        return publicUserService.findUserById(user_id);
    }


}
