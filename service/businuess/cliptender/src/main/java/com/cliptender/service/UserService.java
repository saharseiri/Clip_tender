package com.cliptender.service;

import com.cliptender.domain.UserDomain;
import com.cliptender.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addFavoriteClipName(String clipName, String branchActivity) {
        UserDomain userDomain = new UserDomain();
        userDomain.setClipName(clipName);
        userDomain.setBranchActivity(branchActivity);
        userDomain.setCount(userDomain.getCount() + 1);
        userRepository.save(userDomain);
    }

    public void addLikeToClipByReference(int clipReference) {
        Optional<UserDomain> actualClipDomain = userRepository.findById(clipReference);
        int addLike = actualClipDomain.get().getCount()+1;
        actualClipDomain.get().setCount(addLike);
        userRepository.save(actualClipDomain.get());
    }

    public int getLikeValue(int userRefrence) {
        Optional<UserDomain> userDomain = userRepository.findById(userRefrence);
        return userDomain.get().getCount();
    }
}
