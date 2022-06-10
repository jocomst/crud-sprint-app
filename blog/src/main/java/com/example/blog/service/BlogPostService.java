package com.example.blog.service;

import com.example.blog.model.BlogPost;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface BlogPostService {
    List<BlogPost> getAllBlogPosts();
}
