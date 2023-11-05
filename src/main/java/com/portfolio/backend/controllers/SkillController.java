package com.portfolio.backend.controllers;

import com.portfolio.backend.models.Skill;
import com.portfolio.backend.services.SkillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/skills")
@CrossOrigin(origins = "http://localhost:5173")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping
    public ResponseEntity<List<Skill>> getAllSkills() {
        List<Skill> skills = skillService.getAllSkills();
        return ResponseEntity.ok(skills);
    }

    @PostMapping
    public ResponseEntity<String> addSkill(@RequestBody Skill skill)  {
        skillService.addSkill(skill);
        return ResponseEntity.accepted().build();
    }

}
