package com.portfolio.backend.models;

public class LoginResponseDTO {
    private PrivateUser privateUser;
    private String jwt;

    public LoginResponseDTO() {
        super();
    }

    public LoginResponseDTO(PrivateUser privateUser, String jwt) {
        this.privateUser = privateUser;
        this.jwt = jwt;
    }

    public PrivateUser getUser() {
        return this.privateUser;
    }

    public void setUser(PrivateUser user) {
        this.privateUser = privateUser;
    }

    public String getJwt() {
        return this.jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
