package com.example.demo.services.impl;

import com.example.demo.entities.Advert;
import com.example.demo.entities.Category;
import com.example.demo.repositories.AdvertsRepository;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.services.AdvertService;
import com.example.demo.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertServiceImpl implements AdvertService {
    @Autowired
    private AdvertsRepository advertsRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Advert addAdvert(Advert advert) {
        return advertsRepository.save(advert);
    }

    @Override
    public Advert getAdvert(Long id) {
        return advertsRepository.getOne(id);
    }

    @Override
    public List<Advert> getAllAdverts() {
        return advertsRepository.findAll();
    }

    @Override
    public List<Advert> getAdvertsByCategoryId(Long id) {
        Category category = categoryRepository.getOne(id);
        return advertsRepository.findAllByCategoryId(category.getId());
    }

    @Override
    public void deleteAdvert(Long id) {
        advertsRepository.deleteById(id);
    }
}
