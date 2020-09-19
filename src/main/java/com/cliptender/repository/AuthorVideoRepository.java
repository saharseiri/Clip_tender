package com.cliptender.repository;

import com.cliptender.domain.AuthorVideoDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorVideoRepository extends JpaRepository<AuthorVideoDomain, Integer> {
}