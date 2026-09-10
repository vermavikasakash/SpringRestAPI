package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User createUser(String name){
        System.out.println("Creating user: " + name);
        return new User(name);
    }
}
