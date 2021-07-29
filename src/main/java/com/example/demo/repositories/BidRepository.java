package com.example.demo.repositories;

import com.example.demo.entities.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BidRepository extends JpaRepository<Bid, Long> {
}
