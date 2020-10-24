package com.bac.example.microservices.app.repository;

import com.bac.example.microservices.app.domain.Author;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author chandra on 24/10/2020 13:43
 */

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author, String> {
   
    Optional<Author> findByIdAndDeleteFlag(String id, boolean deleteFlag);
    
}
