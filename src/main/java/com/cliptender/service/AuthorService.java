package com.cliptender.service;

import com.cliptender.repository.AuthorVideoRepository;
import com.cliptender.repository.SuggestionVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorVideoRepository authorRepository;

    @Autowired
    SuggestionVideoRepository videoRepository;

}
