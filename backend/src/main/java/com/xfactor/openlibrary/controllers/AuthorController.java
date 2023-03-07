package com.xfactor.openlibrary.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Author;
import com.xfactor.openlibrary.repositories.AuthorRepository;


@RestController
@RequestMapping("author")
public class AuthorController {
    
    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @PostMapping("/save")
    public Author saveAuthor(@RequestBody Author author) {
        if (author.getId() == null) {
            Author author2 = AuthorRepository.save(author);
            return author2;
        }

        return null;
    }
    
}
