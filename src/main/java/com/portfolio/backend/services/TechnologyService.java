package com.portfolio.backend.services;

import com.portfolio.backend.models.PortfolioEntry;
import com.portfolio.backend.models.Technology;
import com.portfolio.backend.repositories.TechnologyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class TechnologyService {

    private final TechnologyRepository technologyRepository;
    private final PortfolioService portfolioService;

    public TechnologyService(TechnologyRepository technologyRepository, PortfolioService portfolioService) {
        this.technologyRepository = technologyRepository;
        this.portfolioService = portfolioService;
    }


    public void save(Technology technology) {
        technologyRepository.save(technology);
    }

    public List<Technology> getAllTechnologies() {
        return technologyRepository.findAll();
    }

    public Set<Technology> getTechnologiesByPortfolioId(long portfolioId) {
        PortfolioEntry portfolioEntry = portfolioService.findByPortfolioEntryId(portfolioId);
        Set<Technology> technologies = new HashSet<>();
        if (portfolioEntry != null) {
            technologies = portfolioEntry.getTechnologies();
        }
        return technologies;
    }

}
