package com.portfolio.backend.services;

import com.portfolio.backend.exceptions.NoEntryByThisIdFoundException;
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

    public void save(PublicUser publicUser) {
        publicUserRepository.save(publicUser);
    }

    public PublicUser findUserByPrivateUserId(long privateUserId) {
        return publicUserRepository.findByPrivateUserId(privateUserId).orElse(null);
    }

    public void update(Long id, String newDescription) throws NoEntryByThisIdFoundException {
        PublicUser user = publicUserRepository.findById(id).orElseThrow(() -> new NoEntryByThisIdFoundException("No public user with this ID found "+ id));

        user.setAboutDescription(newDescription.replace("\"", ""));

        publicUserRepository.save(user);
    }

}
