package com.portfolio.backend.repositories;

import com.portfolio.backend.models.PortfolioEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<PortfolioEntry, Long> {
}
