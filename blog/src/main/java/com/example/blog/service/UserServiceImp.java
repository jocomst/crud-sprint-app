package com.example.blog.service;

import java.util.Objects;

import com.example.blog.model.BlogPost;
import com.example.blog.model.User;
import com.example.blog.repository.UserRepository;
import com.example.blog.web.dto.UserRegistrationDto;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

 import java.util.Arrays;
 import java.util.Collection;
 import java.util.stream.Collectors;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.security.core.GrantedAuthority;
 import org.springframework.security.core.authority.SimpleGrantedAuthority;
 import org.springframework.security.core.userdetails.UserDetails;
 import org.springframework.security.core.userdetails.UsernameNotFoundException;
 import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {
//
//        @Override
//    public boolean authenticate(String username, String password) {
//        return Objects.equals(username, password);
//    }
@Autowired
    private UserRepository userRepository;

    @Autowired
    @Lazy
    private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImp(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }
    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getId(), registrationDto.getUsername(),
                registrationDto.getFullName(), passwordEncoder.encode(registrationDto.getPassword()), registrationDto.getEmail());

        return userRepository.save(user);
    }
//    @Override
//    public User save(UserRegistrationDto registrationDto) {
//        User user = new User(registrationDto.getFirstName(),
//                registrationDto.getLastName(), registrationDto.getEmail(),
//                passwordEncoder.encode(registrationDto.getPassword()), Arrays.asList(new Role("ROLE_USER")));
//
//        return userRepository.save(user);
//    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user == null) {

            throw new UsernameNotFoundException("Invalid username or password");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), mapBlogPostsToAuthorities(user.getPosts()));
    }

    private Collection<? extends GrantedAuthority> mapBlogPostsToAuthorities(Collection<BlogPost> posts) {
        return posts.stream().map(post -> new SimpleGrantedAuthority(post.getContent())).collect(Collectors.toList());
    }

}
