package com.cliptender.service;

import com.cliptender.domain.RequestVideo;
import com.cliptender.domain.UserDomain;
import com.cliptender.dto.VideoRequestCreationDTO;
import com.cliptender.repository.RequestVideoRepository;
import com.cliptender.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RequestVideoRepository requestVideoRepository;

    public void addFavoriteClipName(String clipName, String branchActivity) {
        UserDomain userDomain = new UserDomain();
        userDomain.setClipName(clipName);
        userDomain.setBranchActivity(branchActivity);
        userDomain.setCount(userDomain.getCount() + 1);
        userRepository.save(userDomain);
    }

    public void addNewRequestVideo(int userId, VideoRequestCreationDTO videoRequestCreationDTO) {
        RequestVideo requestVideo = new RequestVideo();
        requestVideo.setTitle(videoRequestCreationDTO.getTitle());
        requestVideo.setDescription(videoRequestCreationDTO.getDescription());

        Optional<UserDomain> ourUser = userRepository.findById(userId);
        ArrayList<UserDomain> userDomainArrayList = new ArrayList<>();
        userDomainArrayList.add(ourUser.get());

        requestVideo.setUserDomainList(userDomainArrayList);

        requestVideoRepository.save(requestVideo);
    }

    public List<VideoRequestCreationDTO> getAllRequestVideo() {
        List<RequestVideo> requestVideoList = requestVideoRepository.findAll();

        List<VideoRequestCreationDTO> videoRequestCreationDTOS = new ArrayList<>();

        for(RequestVideo requestVideo : requestVideoList) {
            VideoRequestCreationDTO videoRequestCreationDTO = new VideoRequestCreationDTO();
            videoRequestCreationDTO.setTitle(requestVideo.getTitle());
            videoRequestCreationDTO.setDescription(requestVideo.getDescription());
            videoRequestCreationDTOS.add(videoRequestCreationDTO);
        };
        return videoRequestCreationDTOS;
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
