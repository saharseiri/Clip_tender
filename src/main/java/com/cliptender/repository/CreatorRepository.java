package com.cliptender.repository;

import com.cliptender.domain.CreatorDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatorRepository extends JpaRepository<CreatorDomain, Integer> {
}
