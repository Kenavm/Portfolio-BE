package com.portfolio.backend.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class PublicUser {
    @GeneratedValue
    @Id
    private long id;
    private String name;
    private long privateUserId;
    @Column(length = 2000)
    private String aboutDescription;

    @OneToMany
    List<Skill> skillList;

    public PublicUser() {
    }

    public PublicUser(String name, long privateUserId, String aboutDescription, List<Skill> skillList) {
        this.name = name;
        this.privateUserId = privateUserId;
        this.aboutDescription = aboutDescription;
        this.skillList = skillList;
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

    public String getAboutDescription() {
        return aboutDescription;
    }

    public void setAboutDescription(String aboutDescription) {
        this.aboutDescription = aboutDescription;
    }

    public long getPrivateUserId() {
        return privateUserId;
    }

    public void setPrivateUserId(long privateUserId) {
        this.privateUserId = privateUserId;
    }


    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }
}
