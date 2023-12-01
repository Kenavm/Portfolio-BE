package com.portfolio.backend.repositories;

import com.portfolio.backend.models.PortfolioEntry;
import com.portfolio.backend.models.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PortfolioRepository extends JpaRepository<PortfolioEntry, Long> {

    List<PortfolioEntry> findAllEntriesByPrivateUserId(Long id);
    Optional<PortfolioEntry> findById(long id);
}
