package com.portfolio.backend.models;

import com.portfolio.backend.models.enums.Technology;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class PortfolioEntry {
    @GeneratedValue
    @Id
    private Long id;
    private Long userId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    private Set<Technology> technologies;
    private String role;
    private String repoLink;

    public PortfolioEntry(Long userId, LocalDate startDate, LocalDate endDate, String description, Set<Technology> technologies, String role, String repoLink) {
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
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userID) {
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

    public Set<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(Set<Technology> technologies) {
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

}
