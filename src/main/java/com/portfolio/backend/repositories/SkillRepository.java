package com.portfolio.backend.repositories;

import com.portfolio.backend.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
