package com.cliptender.repository;

import com.cliptender.domain.RequestVideoDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestVideoRepository extends JpaRepository<RequestVideoDomain, Integer> {
}
