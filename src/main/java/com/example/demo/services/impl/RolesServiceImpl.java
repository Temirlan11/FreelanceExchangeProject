package com.example.demo.services.impl;

import com.example.demo.entities.Roles;
import com.example.demo.repositories.RolesRepository;
import com.example.demo.services.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesServiceImpl implements RolesService {
    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public Roles getRole(String role) {
        return rolesRepository.findByRoleEquals(role);
    }
}
