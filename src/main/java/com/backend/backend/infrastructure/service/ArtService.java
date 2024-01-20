package com.backend.backend.infrastructure.service;

import com.backend.backend.application.IArtService;
import com.backend.backend.infrastructure.entity.ArtEntity;
import com.backend.backend.infrastructure.repository.ArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtService implements IArtService {

    private ArtRepository repository;

    @Autowired
    public ArtService(ArtRepository repository) {
        this.repository = repository;
    }

    public List<ArtEntity> getAllArt(){
        return this.repository.findAll();
    }

    public ArtEntity save(ArtEntity entity){
        return this.repository.save(this.toNewEntity(entity));
    }

    private ArtEntity toNewEntity(ArtEntity entity) {
        ArtEntity newEntity = new ArtEntity();
        newEntity.setName(entity.getName());
        newEntity.setText(entity.getText());
        newEntity.setImageURL(entity.getImageURL());
        return newEntity;
    }
}
