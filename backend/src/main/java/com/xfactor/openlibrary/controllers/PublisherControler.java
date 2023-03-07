package com.xfactor.openlibrary.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.repositories.PublisherRepository;

@RestController
@RequestMapping("publisher")
public class PublisherControler {
    
    private PublisherRepository publisherRepository;

    public PublisherControler(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    
}
