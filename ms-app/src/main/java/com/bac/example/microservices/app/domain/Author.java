package com.bac.example.microservices.app.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author chandra on 24/10/2020 13:37
 */

@Data
@Entity
@Table(name = "ms_author")
public class Author {
    
    @Id
    @Column(name = "id", length = 40)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    
    @Column(name = "name", length = 100)
    private String name;
    
    @Column(name = "delete_flag")
    private boolean deleteFlag;
    
}
