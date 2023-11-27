package com.portfolio.backend.runner;

import com.portfolio.backend.models.PortfolioEntry;
import com.portfolio.backend.models.PrivateUser;
import com.portfolio.backend.models.PublicUser;
import com.portfolio.backend.models.enums.Role;
import com.portfolio.backend.models.enums.Technology;
import com.portfolio.backend.repositories.PortfolioRepository;
import com.portfolio.backend.repositories.PrivateUserRepository;
import com.portfolio.backend.repositories.PublicUserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.Set;


@Configuration
public class UserPopulator {

    @Bean
    ApplicationRunner run(PrivateUserRepository privateUserRepository, PasswordEncoder passwordEncoder, PortfolioRepository portfolioRepository, PublicUserRepository publicUserRepository) {
        return args -> {
            var theresa = new PrivateUser("Theresa", passwordEncoder.encode("123"), Set.of(Role.THERESA.toString()));
            var manuel = new PrivateUser("Manuel", passwordEncoder.encode("123"), Set.of(Role.MANUEL.toString()));
            privateUserRepository.save(theresa);
            privateUserRepository.save(manuel);

            var entry = new PortfolioEntry(1L,
                    LocalDate.of(2023, 1, 1),
                    LocalDate.of(2023, 5, 1),
                    "implemented spring boot project",
                    Set.of(Technology.JAVA, Technology.SPRING_WEB, Technology.SPRING_SECURITY),
                    "Software Engineer",
                    "www.github.com/Kenavm/Portfolio-BE"
                    );
            var entry2 = new PortfolioEntry(1L,
                    LocalDate.of(2021, 1, 1),
                    LocalDate.of(2022, 5, 1),
                    "implemented react project",
                    Set.of(Technology.NODE_JS, Technology.REACT, Technology.JAVASCRIPT),
                    "Software Engineer",
                    "www.github.com/Kenavm/Portfolio-FE"
            );
            var entry3 = new PortfolioEntry(2L,
                    LocalDate.of(2023, 1, 1),
                    LocalDate.of(2023, 5, 1),
                    "implemented spring boot project",
                    Set.of(Technology.JAVA, Technology.SPRING_WEB, Technology.SPRING_SECURITY),
                    "Software Engineer",
                    "www.github.com/Kenavm/Portfolio-BE"
            );

            portfolioRepository.save(entry);
            portfolioRepository.save(entry2);
            portfolioRepository.save(entry3);

            var theresaPublic = new PublicUser("Theresa", 1L, "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et jus ");
            var manuelPublic = new PublicUser("Manuel", 2L, "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et jus ");

            publicUserRepository.save(theresaPublic);
            publicUserRepository.save(manuelPublic);
        };
    }

}


