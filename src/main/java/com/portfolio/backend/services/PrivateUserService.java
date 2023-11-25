package com.portfolio.backend.services;

import com.portfolio.backend.repositories.PrivateUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PrivateUserService implements UserDetailsService {
    private final PasswordEncoder encoder;
    private final PrivateUserRepository privateUserRepository;

    public PrivateUserService(PasswordEncoder encoder, PrivateUserRepository privateUserRepository) {
        this.encoder = encoder;
        this.privateUserRepository = privateUserRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println("In the user details service");
        return privateUserRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("user is not valid"));

    }
}
