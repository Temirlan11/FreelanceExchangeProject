package com.example.demo.services.impl;

import com.example.demo.entities.Users;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        Users users = userRepository.findByEmail(s);
//        if(users != null){
//            System.out.println("USER FOUND");
//            return users;
//        }else{
//            throw new UsernameNotFoundException("USER NOT FOUND");
//        }
//    }

    @Override
    public Users addUser(Users users) {
        return userRepository.save(users);
    }

    @Override
    public Users findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Users saveUser(Users users) {
        return userRepository.save(users);
    }

    @Override
    public Users getUser(Long id) {
        return userRepository.getOne(id);
    }
}
