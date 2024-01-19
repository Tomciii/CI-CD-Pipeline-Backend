package com.backend.backend.repository;

import com.backend.backend.entity.ArtEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtRepository extends JpaRepository<ArtEntity, Integer> {
}
