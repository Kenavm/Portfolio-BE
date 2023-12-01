package com.portfolio.backend.models;

import com.portfolio.backend.models.enums.SkillLevel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Skill {
    @GeneratedValue
    @Id
    private long id;
    private long idTechnology;
    private long skillLevel;

    public Skill() {

    }

    public Skill(long idTechnology, long skillLevel) {
        this.idTechnology = idTechnology;
        this.skillLevel = skillLevel;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public long getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(long skillLevel) {
        this.skillLevel = skillLevel;
    }


    public long getIdTechnology() {
        return idTechnology;
    }

    public void setIdTechnology(long idTechnology) {
        this.idTechnology = idTechnology;
    }
}
