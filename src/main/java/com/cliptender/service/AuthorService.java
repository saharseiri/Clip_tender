package com.cliptender.service;

import com.cliptender.domain.AuthorDomain;
import com.cliptender.domain.SuggestionVideo;
import com.cliptender.dto.VideoSuggestionCreationDTO;
import com.cliptender.repository.AuthorRepository;
import com.cliptender.repository.SuggestionVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    SuggestionVideoRepository videoRepository;

    public int getLikeValue(int clipeRefrence) {
        Optional<AuthorDomain> creatorDomain = authorRepository.findById(clipeRefrence);
        return creatorDomain.get().getCount();
    }

    public void addNewSuggestionVideo(int authorId, VideoSuggestionCreationDTO videoSuggestionCreationDTO) {
        SuggestionVideo suggestionVideo = new SuggestionVideo();
        suggestionVideo.setTitle(videoSuggestionCreationDTO.getTitle());
        suggestionVideo.setDiscription(videoSuggestionCreationDTO.getDiscription());

        Optional<AuthorDomain> ourAuthor = authorRepository.findById(authorId);
        ArrayList<AuthorDomain> authorDomainArrayList = new ArrayList<>();
        authorDomainArrayList.add(ourAuthor.get());

        suggestionVideo.setAuthorDomainList(authorDomainArrayList);

        videoRepository.save(suggestionVideo);
    }

    public List<VideoSuggestionCreationDTO> getAllVideoSugegstion(){
        List<SuggestionVideo> suggestionVideosList = videoRepository.findAll();

        List<VideoSuggestionCreationDTO> videoSuggestionCreationDTOS = new ArrayList<>();

        for (SuggestionVideo suggestionVideo : suggestionVideosList){
            VideoSuggestionCreationDTO videoSuggestionCreationDTO = new VideoSuggestionCreationDTO();
            videoSuggestionCreationDTO.setTitle(suggestionVideo.getTitle());
            videoSuggestionCreationDTO.setDiscription(suggestionVideo.getDiscription());
            videoSuggestionCreationDTOS.add(videoSuggestionCreationDTO);
        }

        return videoSuggestionCreationDTOS;
    }

}
