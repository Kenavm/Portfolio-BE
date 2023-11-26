package com.portfolio.backend;

import com.portfolio.backend.models.PortfolioEntry;
import com.portfolio.backend.models.PrivateUser;
import com.portfolio.backend.models.Role;
import com.portfolio.backend.repositories.PrivateUserRepository;
import com.portfolio.backend.repositories.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner run(RoleRepository roleRepository, PrivateUserRepository privateUserRepository, PasswordEncoder passwordEncode) {
        return args -> {
            Role admin = roleRepository.save(new Role("ADMIN"));
            Role user = roleRepository.save(new Role("USER"));
            Set<Role> roles = new HashSet<>();
            roles.add(user);
            List<PortfolioEntry> portfolioEntryList = new ArrayList<>();

            PrivateUser user1 = new PrivateUser("Theresa", passwordEncode.encode("password"), portfolioEntryList, roles);
            System.out.println(user1.getId());
            privateUserRepository.save(user1);
        };
    }

}
