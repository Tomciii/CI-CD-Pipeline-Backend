package com.backend.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@CrossOrigin(origins = "http://127.0.0.1/")
public interface PublicApi {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/public/api/getAllArt",
            produces = {"application/json"}
    )
    ResponseEntity getAllArt();
}
