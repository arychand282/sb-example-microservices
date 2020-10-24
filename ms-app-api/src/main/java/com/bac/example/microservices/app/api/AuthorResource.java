package com.bac.example.microservices.app.api;

import com.bac.example.microservices.app.dto.AuthorDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chandra on 24/10/2020 14:28
 */

@RequestMapping(value = "/api/v1/author")
public interface AuthorResource {

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    AuthorDto save(@RequestBody AuthorDto authorDto);

    @GetMapping(value = "/{id}")
    AuthorDto findById(@PathVariable String id);

    @GetMapping(value = "/all")
    List<AuthorDto> findAllIgnoreDeleteFlag();
    
}
