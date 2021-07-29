package com.example.demo.services;

import com.example.demo.entities.Users;

public interface UserService{
    Users addUser(Users users);
    Users findByEmail(String email);
    Users saveUser(Users users);
    Users getUser(Long id);
}
