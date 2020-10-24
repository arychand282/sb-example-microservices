package com.bac.example.microservices.app.web.rest;

import com.bac.example.microservices.app.api.AuthorResource;
import com.bac.example.microservices.app.domain.Author;
import com.bac.example.microservices.app.dto.AuthorDto;
import com.bac.example.microservices.app.service.AuthorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chandra on 24/10/2020 14:01
 */

@RestController
public class AuthorController implements AuthorResource {
    
    @Autowired
    private AuthorService authorService;
    
    @Override
    public AuthorDto save(@RequestBody AuthorDto authorDto) {
        return toAuthorDto(authorService.save(toAuthor(authorDto)));
    }
    
    @Override
    public AuthorDto findById(@PathVariable String id) {
        return authorService.findById(id).map(this::toAuthorDto).orElseThrow(() -> new RuntimeException("Record Not Found"));
    }
    
    @Override
    public List<AuthorDto> findAllIgnoreDeleteFlag() {
        return authorService.findAllIgnoreDeleteFlag().stream()
                .map(this::toAuthorDto)
                .collect(Collectors.toList());
    }
    
    private AuthorDto toAuthorDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        BeanUtils.copyProperties(author, authorDto);
        return authorDto;
    }
    
    private Author toAuthor(AuthorDto authorDto) {
        Author author = new Author();
        BeanUtils.copyProperties(authorDto, author);
        return author;
    }
    
}
