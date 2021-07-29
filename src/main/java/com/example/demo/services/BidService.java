package com.example.demo.services;

import com.example.demo.entities.Bid;

import java.util.List;

public interface BidService {
    List<Bid> getAllBids();
    Bid getBid(Long id);
    Bid createBid(Bid bid);
    void deleteBidById(Long id);
    void deleteBid(Bid bid);
    Bid updateBid(Bid bid);
}
