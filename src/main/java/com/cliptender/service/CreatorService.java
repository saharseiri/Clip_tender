package com.cliptender.service;

import com.cliptender.domain.AuthorDomain;
import com.cliptender.repository.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreatorService {

    @Autowired
    CreatorRepository repository;

    public int getLikeValue(int clipeRefrence) {

        Optional<AuthorDomain> creatorDomain = repository.findById(clipeRefrence);
        return creatorDomain.get().getCount();
    }

    public void addNewClip(String clipName, String branchActivity) {

        AuthorDomain authorDomain = new AuthorDomain();
        authorDomain.setBranchActivity(branchActivity);
        authorDomain.setClipName(clipName);
        repository.save(authorDomain);
    }
}
