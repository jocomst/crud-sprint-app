package com.example.blog.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
    public class HomeController {

        @RequestMapping("/")
        public String home() {
            return "home";
        }

        @GetMapping("/logout")
        public String logout() {
            return "logout";
        }

        @GetMapping("/login")
        public String login() {
            return "login";
        }

    }
