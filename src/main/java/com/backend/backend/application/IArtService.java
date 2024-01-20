package com.backend.backend.application;

import com.backend.backend.infrastructure.entity.ArtEntity;

import java.util.List;

public interface IArtService {
    List<ArtEntity> getAllArt();
    ArtEntity save(ArtEntity entity);
    void delete(ArtEntity entity);
}
