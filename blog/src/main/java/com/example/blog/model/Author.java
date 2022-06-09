package com.example.blog.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String url;

    @Column
    @OneToMany(mappedBy = "author")
    private List<BlogPost> posts;

}
