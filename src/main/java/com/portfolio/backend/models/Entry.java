package com.portfolio.backend.models;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Entry {
    private long userID;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    private List<String> technologies;
    private String role;
    private String linkToRepos;

    public Entry(long userID, LocalDate startDate, LocalDate endDate, String description, List<String> technologies, String role, String linkToRepos) {
        this.userID = userID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.technologies = technologies;
        this.role = role;
        this.linkToRepos = linkToRepos;
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

    public String getLinkToRepos() {
        return linkToRepos;
    }

    public void setLinkToRepos(String linkToRepos) {
        this.linkToRepos = linkToRepos;
    }
}
