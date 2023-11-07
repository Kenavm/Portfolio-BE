package com.portfolio.backend.services;

import com.portfolio.backend.models.PortfolioEntry;
import com.portfolio.backend.repositories.PortfolioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {
    private final PortfolioRepository portfolioRepository;
    public PortfolioService(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }
    public List<PortfolioEntry> findAll() {
        return portfolioRepository.findAll();
    }

    public void save(PortfolioEntry entry) {
         portfolioRepository.save(entry);
    }

}
