package com.backend.backend.controller;


import com.backend.backend.entity.ArtEntity;
import com.backend.backend.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ArtController implements PublicApi {

    private ArtService service;

    @Autowired
    public ArtController(ArtService artService) {
        this.service = artService;
    }

    @Override
    public ResponseEntity getAllArt() {
        try {
            return ResponseEntity.ok(this.service.getAllArt().toString());
        } catch (Exception e){
            return new ResponseEntity<>("Error loading art: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity save(@RequestBody ArtEntity art) {
        try {
            return ResponseEntity.ok(this.service.save(art));
        } catch (Exception e) {
            return new ResponseEntity<>("Error saving art: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
