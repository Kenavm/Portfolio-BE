package com.portfolio.backend.services;

import com.portfolio.backend.exceptions.NoEntryByThisIdFoundException;
import com.portfolio.backend.exceptions.NoUpdatedEntryFoundException;
import com.portfolio.backend.models.PortfolioEntry;
import com.portfolio.backend.repositories.PortfolioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void update(Long id, PortfolioEntry updatedEntry) throws NoUpdatedEntryFoundException, NoEntryByThisIdFoundException {
        if(updatedEntry == null) {
            throw new NoUpdatedEntryFoundException("no updated entry found");
        }

        PortfolioEntry oldEntry = portfolioRepository.findById(id)
                .orElseThrow(() -> new NoEntryByThisIdFoundException("No entry with this ID found "+ id));

        if(updatedEntry.getUserId() != null) {
            oldEntry.setUserId(updatedEntry.getUserId());
        }

        if(updatedEntry.getStartDate() != null) {
            oldEntry.setStartDate(updatedEntry.getStartDate());
        }

        if(updatedEntry.getEndDate() != null) {
            oldEntry.setEndDate(updatedEntry.getEndDate());
        }

        if(updatedEntry.getDescription() != null) {
            oldEntry.setDescription(updatedEntry.getDescription());
        }

        if(updatedEntry.getTechnologies() != null & !updatedEntry.getTechnologies().isEmpty()) {
            oldEntry.setTechnologies(updatedEntry.getTechnologies());
        }

        if(updatedEntry.getRole() != null) {
            oldEntry.setRole(updatedEntry.getRole());
        }

        if(updatedEntry.getRepoLink() != null) {
            oldEntry.setRepoLink(updatedEntry.getRepoLink());
        }

        portfolioRepository.save(oldEntry);
    }

}
