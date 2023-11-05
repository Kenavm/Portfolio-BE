package com.portfolio.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Skill {
    @GeneratedValue
    @Id
    private long id;
    private String name;
    @Enumerated
    private SkillLevel level;

    public Skill(String name, SkillLevel level) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SkillLevel getLevel() {
        return level;
    }

    public void setLevel(SkillLevel level) {
        this.level = level;
    }
}
