package com.bac.example.microservices.app.service.impl;

import com.bac.example.microservices.app.domain.Author;
import com.bac.example.microservices.app.repository.AuthorRepository;
import com.bac.example.microservices.app.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author chandra on 24/10/2020 13:48
 */

@Service
public class AuthorServiceImpl implements AuthorService {
    
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> findAllIgnoreDeleteFlag() {
        List<Author> authorList = new ArrayList<>();
        authorRepository.findAll().forEach(author -> authorList.add(author));
        return authorList;
    }

    @Override
    public Optional<Author> findById(String id) {
        return authorRepository.findByIdAndDeleteFlag(id, false);
    }
}
