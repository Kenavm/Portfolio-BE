package com.portfolio.backend.models;


public class LoginResponseDTO {
    //username
    private String username;
    private long privateUserId;
    private String jwt;

    public LoginResponseDTO(String username, long privateUserId, String jwt) {
        this.username = username;
        this.privateUserId = privateUserId;
        this.jwt = jwt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getPrivateUserId() {
        return privateUserId;
    }

    public void setPrivateUserId(long privateUserId) {
        this.privateUserId = privateUserId;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    // Constructors, getters, and setters remain the same





}

