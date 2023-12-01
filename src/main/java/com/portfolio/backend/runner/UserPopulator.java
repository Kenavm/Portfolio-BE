package com.portfolio.backend.runner;

import com.portfolio.backend.models.*;
import com.portfolio.backend.models.enums.Role;
import com.portfolio.backend.repositories.*;
import com.portfolio.backend.services.TechnologyService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


@Configuration
public class UserPopulator {
    public static final String[] TECHNOLOGY_NAMES = {
            "JAVASCRIPT",
            "JAVA",
            "POSTGRESQL",
            "REACT",
            "SPRING_WEB",
            "SPRING_SECURITY",
            "SPRING_DATA",
            "EXPRESS_JS",
            "MONGO_DB",
            "NODE_JS"
    };

    @Bean
    ApplicationRunner run(SkillRepository skillRepository, PrivateUserRepository privateUserRepository, TechnologyRepository technologyRepository, PasswordEncoder passwordEncoder, PortfolioRepository portfolioRepository, PublicUserRepository publicUserRepository) {
        return args -> {

            for (int i = 0; i < TECHNOLOGY_NAMES.length; i++) {
                technologyRepository.save(new Technology(TECHNOLOGY_NAMES[i]));
            }
            var theresa = new PrivateUser("Theresa", passwordEncoder.encode("123"), Set.of(Role.THERESA.toString()));
            var manuel = new PrivateUser("Manuel", passwordEncoder.encode("123"), Set.of(Role.MANUEL.toString()));
            privateUserRepository.save(theresa);
            privateUserRepository.save(manuel);
            Set<Technology> technologyList1 = Set.of(
                    technologyRepository.findByTechnologyName("JAVA"),
                    technologyRepository.findByTechnologyName("POSTGRESQL"),
                    technologyRepository.findByTechnologyName("SPRING_SECURITY")
            );


            Set<Technology> technologyList2 = Set.of(
                    technologyRepository.findByTechnologyName("SPRING_DATA"),
                    technologyRepository.findByTechnologyName("JAVASCRIPT"),
                    technologyRepository.findByTechnologyName("REACT"),
                    technologyRepository.findByTechnologyName("SPRING_WEB")

            );

            Set<Technology> technologyList3 = Set.of(
                    technologyRepository.findByTechnologyName("EXPRESS_JS"),
                    technologyRepository.findByTechnologyName("MONGO_DB"),
                    technologyRepository.findByTechnologyName("NODE_JS")

            );
            var entry = new PortfolioEntry(1L,
                    LocalDate.of(2023, 1, 1),
                    LocalDate.of(2023, 5, 1),
                    "implemented spring boot project",
                    technologyList1,
                    "Software Engineer",
                    "www.github.com/Kenavm/Portfolio-BE"
            );
            var entry2 = new PortfolioEntry(1L,
                    LocalDate.of(2021, 1, 1),
                    LocalDate.of(2022, 5, 1),
                    "implemented react project",
                    technologyList2,
                    "Software Engineer",
                    "www.github.com/Kenavm/Portfolio-FE"
            );

            var entry3 = new PortfolioEntry(2L,
                    LocalDate.of(2023, 1, 1),
                    LocalDate.of(2023, 5, 1),
                    "implemented spring boot project",
                    technologyList3,
                    "Software Engineer",
                    "www.github.com/Kenavm/Portfolio-BE"
            );
            portfolioRepository.save(entry);
            portfolioRepository.save(entry2);
            portfolioRepository.save(entry3);

            List<Skill> skillList1 = List.of(
                    new Skill(1,4),
                    new Skill(2,3),
                    new Skill(3,1)
            );
            List<Skill> skillList2 = List.of(
                    new Skill(3,4),
                    new Skill(2,5),
                    new Skill(4,6),
                    new Skill(1,3),
                    new Skill(6,7),
                    new Skill(5,3)

            );
            skillRepository.saveAll(skillList1);

            skillRepository.saveAll(skillList2);
            var theresaPublic = new PublicUser("Theresa", 1L, "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et jus ", skillList1);
            var manuelPublic = new PublicUser("Manuel", 2L, "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et jus ", skillList2);
            publicUserRepository.save(theresaPublic);
            publicUserRepository.save(manuelPublic);

        };
    }

}