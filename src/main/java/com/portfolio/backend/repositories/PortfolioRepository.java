package com.portfolio.backend.repositories;

import com.portfolio.backend.models.PortfolioEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortfolioRepository extends JpaRepository<PortfolioEntry, Long> {

    List<PortfolioEntry> findAllEntriesByPrivateUserId(Long id);
}
