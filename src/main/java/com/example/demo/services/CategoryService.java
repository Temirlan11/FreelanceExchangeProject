package com.example.demo.services;

import com.example.demo.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category getCategory(Long id);
}
