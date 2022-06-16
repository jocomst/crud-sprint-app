package com.example.blog.model;

import javax.persistence.*;
import java.util.HashSet;
//import java.util.List;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String username;

    @Column
    private String fullName;

    @Column
    private String email;

    @Column
    private String password;




    @Column
    @OneToMany(mappedBy = "user", fetch=FetchType.EAGER)
    private List<BlogPost> posts;

    public User(Long id, String username, String fullName, String password, String email) {
        this.id = id;
        this.username = username;
        this.fullName  = fullName;
        this.email = email;
        this.password = password;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String firstName) {
        this.username = firstName;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName; }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<BlogPost> getPosts() {
        return posts;
    }

    public void setPosts(List<BlogPost> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", fullName='" + fullName + '\'' + '}';
}

}























//@Entity
//@Table(name = "users")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false, length = 30, unique = true)
//    private String username;
//
////    @Column
////    private String email;
//
//    @Column(length = 60)
//    private String passwordHash;
//
//    @Column(length = 100)
//    private String fullName;
//
//    @Column
//    @OneToMany(mappedBy = "user")
//    private Set<BlogPost> posts = new HashSet<>();
//
//    public User(Long id, String username, String fullName) {
//        this.id = id;
//        this.username = username;
//        this.fullName  = fullName;
////        this.password = password;
////        this.email = email;
//    }
//
//    public User() {
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String firstName) {
//        this.username = firstName;
//    }
////    public String getEmail() {
////        return email;
////    }
////
////    public void setEmail(String email) {
////        this.email = email;
////    }
//
//    public String getPassword() {
//        return passwordHash;
//    }
//
//    public void setPassword(String password) {
//        this.passwordHash = password;
//    }
//
//    public String getFullName() {
//        return fullName; }
//    public void setFullName(String fullName) {
//
//        this.fullName = fullName;
//    }
//
//        public Set<BlogPost> getPosts() {
//        return posts;
//    }
//
//    public void setPosts(Set<BlogPost> posts) {
//        this.posts = posts;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" + "id=" + id + ", username='" + username + '\'' +
//                ", passwordHash='" + passwordHash + '\'' +
//                ", fullName='" + fullName + '\'' + '}';
//    }
//}
