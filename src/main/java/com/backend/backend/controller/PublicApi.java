package com.backend.backend.controller;

import com.backend.backend.entity.ArtEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
public interface PublicApi {

    @GetMapping(
            value = "/public/api/getAllArt",
            produces = {"application/json"}
    )
    ResponseEntity getAllArt();

    @PostMapping(
            value = "/public/api/getAllArt",
            produces = {"application/json"}
    )
    ResponseEntity save(@RequestBody ArtEntity art);
}
