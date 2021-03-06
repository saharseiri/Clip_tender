package com.cliptender.repository;

import com.cliptender.domain.SuggestionVideoDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuggestionVideoRepository extends JpaRepository<SuggestionVideoDomain, Integer>{
}
