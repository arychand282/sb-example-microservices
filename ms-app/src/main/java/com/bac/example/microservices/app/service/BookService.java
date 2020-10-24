package com.bac.example.microservices.app.service;

import com.bac.example.microservices.app.domain.Book;

import java.util.List;
import java.util.Optional;

/**
 * @author chandra on 24/10/2020 13:51
 */

public interface BookService {
    
    Book save(Book book);
    
    List<Book> findByAuthorId(String authorId);
    
    Optional<Book> findById(String id);
    
    List<Book> findAllIgnoreDeleteFlag();
    
}
