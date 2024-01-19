package com.backend.backend.service;

import com.backend.backend.entity.ArtEntity;
import com.backend.backend.repository.ArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtService {

    private ArtRepository repository;

    @Autowired
    public ArtService(ArtRepository repository) {
        this.repository = repository;
    }

    public List<ArtEntity> getAllArt(){
        return this.repository.findAll();
    }

    public ArtEntity save(ArtEntity entity){
        return this.repository.save(entity);
    }
}
