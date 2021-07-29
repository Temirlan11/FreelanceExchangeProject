package com.example.demo.services.impl;

import com.example.demo.entities.Bid;
import com.example.demo.repositories.BidRepository;
import com.example.demo.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BidServiceImpl implements BidService {

    @Autowired
    private BidRepository bidRepository;

    @Override
    public List<Bid> getAllBids() {
        return bidRepository.findAll();
    }

    @Override
    public Bid getBid(Long id) {
        return bidRepository.getOne(id);
    }

    @Override
    public Bid createBid(Bid bid) {
        return bidRepository.save(bid);
    }

    @Override
    public void deleteBidById(Long id) {
        bidRepository.deleteById(id);
    }

    @Override
    public void deleteBid(Bid bid) {
        bidRepository.delete(bid);
    }

    @Override
    public Bid updateBid(Bid bid) {
        return bidRepository.save(bid);
    }
}
