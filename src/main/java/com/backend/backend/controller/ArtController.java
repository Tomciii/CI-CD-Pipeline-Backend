package com.backend.backend.controller;


import com.backend.backend.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


@org.springframework.stereotype.Controller
public class ArtController implements PublicApi {

    private ArtService service;

    @Autowired
    public ArtController(ArtService artService) {
        this.service = artService;
    }

    @Override
    public ResponseEntity publicApiGetItemData() {
        return ResponseEntity.ok("Hello World");
    }
}
