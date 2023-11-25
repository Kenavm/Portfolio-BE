package com.portfolio.backend.repositories;

import com.portfolio.backend.models.PrivateUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PrivateUserRepository extends JpaRepository<PrivateUser,Long> {
    Optional<PrivateUser> findByUsername(String username);

}
