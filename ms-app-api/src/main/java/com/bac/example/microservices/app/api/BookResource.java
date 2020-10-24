package com.bac.example.microservices.app.api;

import com.bac.example.microservices.app.dto.BookDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chandra on 24/10/2020 14:31
 */

@RequestMapping(value = "/api/v1/book")
public interface BookResource {

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    BookDto save(@RequestBody BookDto bookDto);

    @GetMapping(value = "/{id}")
    BookDto findById(@PathVariable String id);

    @GetMapping(value = "/author/{authorId}")
    List<BookDto> findByAuthorId(@PathVariable String authorId);
    
    @GetMapping(value = "/all")
    List<BookDto> findAllIgnoreDeleteFlag();
    
}
