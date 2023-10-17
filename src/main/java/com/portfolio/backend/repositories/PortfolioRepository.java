package com.portfolio.backend.repositories;

import com.portfolio.backend.models.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Entry, Long> {
}
