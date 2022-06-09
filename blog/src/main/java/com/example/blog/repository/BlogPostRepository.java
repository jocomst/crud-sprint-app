package com.example.blog.repository;

import com.example.blog.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Optional;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
    Collection<BlogPost> findALlByOrderByCreationDateDesc();
    Optional<BlogPost> findById(Long id);
}
