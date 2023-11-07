package com.portfolio.backend.repositories;

import com.portfolio.backend.models.PublicUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PublicUserRepository extends JpaRepository<PublicUser,Long> {
    Optional<PublicUser> findByName(String name);
}
