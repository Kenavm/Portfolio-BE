package com.portfolio.backend.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class PortfolioEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long privateUserId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;

    @ManyToMany
    private Set<Technology> technologies;
    private String role;
    private String repoLink;

    public PortfolioEntry() {

    }

    public PortfolioEntry(Long privateUserId, LocalDate startDate, LocalDate endDate, String description, Set<Technology> technologies, String role, String repoLink) {
        this.privateUserId = privateUserId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.technologies = technologies;
        this.role = role;
        this.repoLink = repoLink;
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

    public Long getPrivateUserId() {
        return privateUserId;
    }

    public void setPrivateUserId(Long privateUserId) {
        this.privateUserId = privateUserId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Technology> getTechnologies() {
        return technologies;
    }


    public void setTechnologies(Set<Technology> technologies) {
        this.technologies = technologies;
    }
}
