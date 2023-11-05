package com.portfolio.backend.services;

import com.portfolio.backend.models.PublicUser;
import com.portfolio.backend.repositories.PublicUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicUserService {

    private final PublicUserRepository publicUserRepository;

    public PublicUserService(PublicUserRepository publicUserRepository) {
        this.publicUserRepository = publicUserRepository;
    }

    public List<PublicUser> findAll() {
        return publicUserRepository.findAll();
    }

    public PublicUser findUserById(long id) {
        return publicUserRepository.findById(id).orElse(null);
    }

    public PublicUser findByUserName(String name) {
        return publicUserRepository.findByName(name).orElse(null);
    }

    public void save(PublicUser publicUser) {
        publicUserRepository.save(publicUser);
    }

    public void updateUser(U) {

    }
}
