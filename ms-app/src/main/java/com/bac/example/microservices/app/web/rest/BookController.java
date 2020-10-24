package com.bac.example.microservices.app.web.rest;

import com.bac.example.microservices.app.api.BookResource;
import com.bac.example.microservices.app.domain.Author;
import com.bac.example.microservices.app.domain.Book;
import com.bac.example.microservices.app.dto.BookDto;
import com.bac.example.microservices.app.service.AuthorService;
import com.bac.example.microservices.app.service.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chandra on 24/10/2020 13:25
 */

@RestController
public class BookController implements BookResource {
    
    @Autowired
    private BookService bookService;
    
    @Autowired
    private AuthorService authorService;
    
    @Override
    public BookDto save(@RequestBody BookDto bookDto) {
        return toBookDto(bookService.save(toBook(bookDto)));
    }
    
    @Override
    public BookDto findById(@PathVariable String id) {
        return bookService.findById(id).map(this::toBookDto).orElseThrow(() -> new RuntimeException("Record Not Found"));
    }

    @Override
    public List<BookDto> findByAuthorId(@PathVariable String authorId) {
        return bookService.findByAuthorId(authorId).stream()
                .map(this::toBookDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<BookDto> findAllIgnoreDeleteFlag() {
        return bookService.findAllIgnoreDeleteFlag().stream()
                .map(this::toBookDto)
                .collect(Collectors.toList());
    }

    private BookDto toBookDto(Book book) {
        BookDto bookDto = new BookDto();
        BeanUtils.copyProperties(book, bookDto);
        bookDto.setAuthorId(book.getAuthor().getId());
        bookDto.setAuthorName(book.getAuthor().getName());
        return bookDto;
    }
    
    private Book toBook(BookDto bookDto) {
        Book book = new Book();
        BeanUtils.copyProperties(bookDto, book);

        Author author = authorService.findById(bookDto.getAuthorId())
                .orElseThrow(() -> new RuntimeException("Author Not Found"));
        book.setAuthor(author);
        return book;
    }
    
}
