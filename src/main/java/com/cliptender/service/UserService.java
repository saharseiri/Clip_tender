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
        }
        return videoRequestCreationDTOS;
    }

}
