package com.portfolio.backend.runner;

import com.portfolio.backend.models.PrivateUser;
import com.portfolio.backend.models.enums.Role;
import com.portfolio.backend.repositories.PrivateUserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;


@Configuration
public class UserPopulator {

    @Bean
    ApplicationRunner run(PrivateUserRepository privateUserRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            PrivateUser user = new PrivateUser("Theresa", passwordEncoder.encode("password"), Set.of("ROLE_" + Role.THERESA));
            privateUserRepository.save(user);
        };
    }

}


