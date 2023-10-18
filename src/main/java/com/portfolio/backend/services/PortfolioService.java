package com.portfolio.backend.services;

import com.portfolio.backend.models.Entry;
import com.portfolio.backend.repositories.PortfolioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {
    private final PortfolioRepository portfolioRepository;
    public PortfolioService(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }
    public List<Entry> findAll() {
        return portfolioRepository.findAll();
    }

    public void save(Entry entry) {
         portfolioRepository.save(entry);
    }

}
