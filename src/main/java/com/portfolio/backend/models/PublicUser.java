package com.portfolio.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

import java.awt.image.BufferedImage;

@Entity
public class PublicUser {
    @GeneratedValue
    @Id
    private long id;
    private String name;
    private String aboutDescription;
    @Lob
    private byte[] profilePicture;

    public PublicUser(long id, String name, String aboutDescription, byte[] profilePicture) {
        this.id = id;
        this.name = name;
        this.aboutDescription = aboutDescription;
        this.profilePicture = profilePicture;
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

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }
}
