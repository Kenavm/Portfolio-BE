package com.portfolio.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PrivateUser {
    @GeneratedValue
    @Id
    private long id;
    private String userName;
    private String password;

    public PrivateUser(long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public PrivateUser() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
