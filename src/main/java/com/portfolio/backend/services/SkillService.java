package com.portfolio.backend.services;

import com.portfolio.backend.models.Skill;
import com.portfolio.backend.repositories.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    public void addSkill(Skill skill)  {
        skillRepository.save(skill);
    }

}
