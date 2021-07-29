package com.example.demo.repositories;


import com.example.demo.entities.Winners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface WinnerRepository extends JpaRepository<Winners, Long> {
    List<Winners> getWinnersByUserId(Long id);
}
