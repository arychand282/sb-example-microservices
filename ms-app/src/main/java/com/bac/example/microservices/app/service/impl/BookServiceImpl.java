package com.bac.example.microservices.app.service.impl;

import com.bac.example.microservices.app.domain.Book;
import com.bac.example.microservices.app.repository.BookRepository;
import com.bac.example.microservices.app.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author chandra on 24/10/2020 13:52
 */

@Service
public class BookServiceImpl implements BookService {
    
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findByAuthorId(String authorId) {
        return bookRepository.findByAuthorIdAndDeleteFlag(authorId, false);
    }

    @Override
    public Optional<Book> findById(String id) {
        return bookRepository.findByIdAndDeleteFlag(id, false);
    }

    @Override
    public List<Book> findAllIgnoreDeleteFlag() {
        List<Book> bookList = new ArrayList<>();
        bookRepository.findAll().forEach(book -> bookList.add(book));
        return bookList;
    }
}
