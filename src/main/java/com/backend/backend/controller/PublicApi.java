package com.backend.backend.controller;

import com.backend.backend.entity.ArtEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
public interface PublicApi {

    @CrossOrigin(origins = "*")
    @GetMapping(
            value = "/public/api/getAllArt",
            produces = {"application/json"}
    )
    ResponseEntity getAllArt();

    @CrossOrigin(origins = "*")
    @PostMapping(
            value = "/public/api/save",
            produces = {"application/json"}
    )
    ResponseEntity save(@RequestBody ArtEntity art);
}
