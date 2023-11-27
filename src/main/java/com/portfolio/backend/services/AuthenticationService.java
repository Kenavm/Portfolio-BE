package com.portfolio.backend.services;

import com.portfolio.backend.models.LoginResponseDTO;
import com.portfolio.backend.models.PrivateUser;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final TokenService tokenService;

    public AuthenticationService(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    public LoginResponseDTO loginUser(Authentication auth) {
            String token = tokenService.generateJwt(auth);
            PrivateUser authenticatedUser = (PrivateUser) auth.getPrincipal();
            long userId = authenticatedUser.getId(); // Assuming getId() returns the userId
            return new LoginResponseDTO(auth.getName(), userId, token);
    }
}
