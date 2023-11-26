package com.portfolio.backend.services;

import com.portfolio.backend.models.LoginResponseDTO;
import com.portfolio.backend.models.PortfolioEntry;
import com.portfolio.backend.models.PrivateUser;
import com.portfolio.backend.models.Role;
import com.portfolio.backend.repositories.PrivateUserRepository;
import com.portfolio.backend.repositories.RoleRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class AuthenticationService {
    private final PrivateUserRepository privateUserRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;

    public AuthenticationService(PrivateUserRepository privateUserRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder, TokenService tokenService) {
        this.privateUserRepository = privateUserRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.tokenService = tokenService;
    }


    public PrivateUser registerUser(String username, String password){

        String encodedPassword = passwordEncoder.encode(password);
        Role userRole = roleRepository.findByAuthority("USER").get();

        Set<Role> authorities = new HashSet<>();

        authorities.add(userRole);

        return privateUserRepository.save(new PrivateUser(username,encodedPassword,authorities));
    }

    public LoginResponseDTO loginUser(Authentication auth) {
        try {

            String token = tokenService.generateJwt(auth);

            PrivateUser authenticatedUser = (PrivateUser) auth.getPrincipal();
            long userId = authenticatedUser.getId(); // Assuming getId() returns the userId

            return new LoginResponseDTO(auth.getName(),userId, token);

        } catch (AuthenticationException e) {
            return new LoginResponseDTO("",0, "");
        }
    }
}
