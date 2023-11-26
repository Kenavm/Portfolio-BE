package com.portfolio.backend.controllers;

import com.portfolio.backend.models.LoginResponseDTO;
import com.portfolio.backend.models.PrivateUser;
import com.portfolio.backend.models.RegistrationDTO;
import com.portfolio.backend.services.AuthenticationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:5173")
public class AuthenticationController {
    private final AuthenticationService authenticationService;


    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public PrivateUser registerUser(@RequestBody RegistrationDTO body){
        return authenticationService.registerUser(body.getUsername(), body.getPassword());
    }

    //maybe change so that the backend is just the token and not the whole user
    //without password
    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body){
        return authenticationService.loginUser(body.getUsername(),body.getPassword());
    }
}
