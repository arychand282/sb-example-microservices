package com.bac.example.microservices.app.repository;

import com.bac.example.microservices.app.domain.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author chandra on 24/10/2020 13:45
 */

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, String> {
    
    List<Book> findByAuthorIdAndDeleteFlag(String authorId, boolean deleteFlag);
    
    Optional<Book> findByIdAndDeleteFlag(String id, boolean deleteFlag);
    
}
