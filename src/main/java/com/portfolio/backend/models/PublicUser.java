package com.portfolio.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PublicUser {
    @GeneratedValue
    @Id
    private long id;
    private String name;
    private long privateUserId;
    @Column(length = 2000)
    private String aboutDescription;

    public PublicUser() {
    }

    public PublicUser(String name, long privateUserId, String aboutDescription) {
        this.name = name;
        this.privateUserId = privateUserId;
        this.aboutDescription = aboutDescription;
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
}
