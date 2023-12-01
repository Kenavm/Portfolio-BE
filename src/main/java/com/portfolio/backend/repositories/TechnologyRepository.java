package com.portfolio.backend.repositories;

import com.portfolio.backend.models.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long> {
    Technology findByTechnologyName(String technologyName);

}
