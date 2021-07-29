package com.example.demo.repositories;

import com.example.demo.entities.Advert;
import com.example.demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface AdvertsRepository extends JpaRepository<Advert, Long> {
    Advert findByIdEquals(Long id);

    List<Advert> findAllByCategoryId(Long id);
}
