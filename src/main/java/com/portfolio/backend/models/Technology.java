package com.portfolio.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Technology {
    @Id
    @GeneratedValue
    private long id;
    private String technologyName;

    public Technology(String technologyName) {
        this.technologyName = technologyName;
    }

    public Technology() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }
}
