package com.portfolio.backend.models;

import com.portfolio.backend.models.enums.SkillLevel;
import com.portfolio.backend.models.enums.Technology;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Skill {
    @GeneratedValue
    @Id
    private long id;
    private Technology name;
    @Enumerated
    private SkillLevel level;

    public Skill(Technology name, SkillLevel level) {
        this.name = name;
        this.level = level;
    }

    public Skill() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Technology getName() {
        return name;
    }

    public void setName(Technology name) {
        this.name = name;
    }

    public SkillLevel getLevel() {
        return level;
    }

    public void setLevel(SkillLevel level) {
        this.level = level;
    }
}
