package com.example.demo.models.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entities.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value="/users") 
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "caguei", "csdff", "24234252", "@1412431");
        return ResponseEntity.ok().body(u);
    }
}
