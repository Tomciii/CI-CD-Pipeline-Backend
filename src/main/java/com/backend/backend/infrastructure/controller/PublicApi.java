package com.backend.backend.infrastructure.controller;

import com.backend.backend.infrastructure.entity.ArtEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
public interface PublicApi {

    @GetMapping(
            value = "/getAllArt",
            produces = {"application/json"}
    )
    ResponseEntity getAllArt();

    @PostMapping(
            value = "/save",
            produces = {"application/json"}
    )
    ResponseEntity save(@RequestBody ArtEntity art);

    @PostMapping(
            value = "/delete",
            produces = {"application/json"}
    )
    ResponseEntity delete(@RequestBody int index);
}
