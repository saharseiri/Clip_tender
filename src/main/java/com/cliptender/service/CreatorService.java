package com.cliptender.service;

import com.cliptender.domain.CreatorDomain;
import com.cliptender.repository.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreatorService {

    @Autowired
    CreatorRepository repository;

    public int getLikeValue(int clipeRefrence) {

        Optional<CreatorDomain> creatorDomain = repository.findById(clipeRefrence);
        return creatorDomain.get().getCount();
    }

    public void addNewClip(String clipName, String branchActivity) {

        CreatorDomain creatorDomain = new CreatorDomain();
        creatorDomain.setBranchActivity(branchActivity);
        creatorDomain.setClipName(clipName);
        repository.save(creatorDomain);
    }
}
