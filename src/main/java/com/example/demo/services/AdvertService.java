package com.example.demo.services;

import com.example.demo.entities.Advert;
import com.example.demo.entities.Category;

import java.util.List;

public interface AdvertService {
    Advert addAdvert(Advert advert);
    Advert getAdvert(Long id);
    List<Advert> getAllAdverts();
    List<Advert> getAdvertsByCategoryId(Long id);
    void deleteAdvert(Long id);
}
