package com.bac.example.microservices.app.service;

import com.bac.example.microservices.app.domain.Author;

import java.util.List;
import java.util.Optional;

/**
 * @author chandra on 24/10/2020 13:47
 */

public interface AuthorService {
    
    Author save(Author author);
    
    List<Author> findAllIgnoreDeleteFlag();
    
    Optional<Author> findById(String id);
    
}
