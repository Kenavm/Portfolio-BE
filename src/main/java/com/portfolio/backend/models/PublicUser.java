package com.portfolio.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class PublicUser {
    @GeneratedValue
    @Id
    private long id;
    private String name;
    private String aboutDescription;


    public PublicUser(String name, String aboutDescription) {
        this.name = name;
        this.aboutDescription = aboutDescription;
    }

    public PublicUser() {

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
}
