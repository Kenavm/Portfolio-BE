package com.portfolio.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Entry {
    @GeneratedValue
    @Id
    private long id;
    private long userID;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    private List<String> technologies;
    private String role;
    private String repoLink;

    public Entry(long id, long userID, LocalDate startDate, LocalDate endDate, String description, List<String> technologies, String role, String repoLink) {
        this.id = id;
        this.userID = userID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.technologies = technologies;
        this.role = role;
        this.repoLink = repoLink;
    }

    public Entry() {

    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRepoLink() {
        return repoLink;
    }

    public void setRepoLink(String repoLink) {
        this.repoLink = repoLink;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
