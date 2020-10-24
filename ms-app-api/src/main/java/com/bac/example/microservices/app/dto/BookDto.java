package com.bac.example.microservices.app.dto;

import lombok.Data;

/**
 * @author chandra on 24/10/2020 13:54
 */

@Data
public class BookDto {
    
    private String id;
    
    private String name;
    
    private String authorId;
    
    private String authorName;
    
}
