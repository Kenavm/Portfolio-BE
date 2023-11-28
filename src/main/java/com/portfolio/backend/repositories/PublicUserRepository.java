package com.portfolio.backend.repositories;

import com.portfolio.backend.models.PublicUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PublicUserRepository extends JpaRepository<PublicUser,Long> {
    Optional<PublicUser> findByName(String name);
    Optional<PublicUser> findByPrivateUserId(long privateUserId);
}
