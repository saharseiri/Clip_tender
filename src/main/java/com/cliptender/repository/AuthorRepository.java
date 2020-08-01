package com.cliptender.repository;

import com.cliptender.domain.AuthorDomain;
import com.cliptender.domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorDomain, Integer> {
}