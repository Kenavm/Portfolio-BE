package com.portfolio.backend.models;

import com.portfolio.backend.models.enums.Technology;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
public class PortfolioEntry {
    @GeneratedValue
    @Id
    private long id;
    private long userId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    private List<Technology> technologies;
    private String role;
    private String repoLink;

    public PortfolioEntry(long userId, LocalDate startDate, LocalDate endDate, String description, List<Technology> technologies, String role, String repoLink) {
        this.userId = userId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.technologies = technologies;
        this.role = role;
        this.repoLink = repoLink;
    }

    public PortfolioEntry() {

    }
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userID) {
        this.userId = userID;
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

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
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
