// package com.example.blog.service;

// import com.example.blog.model.BlogPost;
// import com.example.blog.model.User;
// import com.example.blog.repository.BlogPostRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Objects;
// import java.util.Scanner;
// import java.util.stream.Collectors;

// @Service
// public class BlogPostServiceImpl implements BlogPostService {
//     @Autowired
//     private BlogPostRepository postRepository;

//     @Override
//     public List<Post> findAll() {
//         return this.postRepository.findAll();
//     }

//     @Override
//     public List <Post> findLatest5(){
//         return this.postRepository.findLatest5Posts(PageRequest.of(0,5));
//     }
    
//     @Override
//     public Post create(Post post) {
//     return this.postRepository.save(post);
//     }
    
//     @Override
//     public Post edit(Post post) {
//     return this.postRepository.save(post);
//     }

//     @Override
//     public void save(Post post) {
//         this.postRepository.save(post);
//     }
    
//     @Override
//     public void deleteById(Long id) {
//     this.postRepository.deleteById(id);
//     }

//     @Override
//     public Optional<Post> findById(Long id){
//         return this.postRepository.findById(id);
//     }

