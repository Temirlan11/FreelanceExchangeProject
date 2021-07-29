package com.example.demo.services.impl;

import com.example.demo.entities.Winners;
import com.example.demo.repositories.WinnerRepository;
import com.example.demo.services.WinnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WinnerServiceImpl  implements WinnerService {

    @Autowired
    private WinnerRepository winnerRepository;

    @Override
    public Winners addWinner(Winners winner) {
        return winnerRepository.save(winner);
    }

    @Override
    public Winners getWinner(Long id) {
        return winnerRepository.getOne(id);
    }

    @Override
    public List<Winners> getALlWinners() {
        return winnerRepository.findAll();
    }

    @Override
    public List<Winners> getWinnersByUserId(Long id) {
        return winnerRepository.getWinnersByUserId(id);
    }

    @Override
    public Winners updateWinner(Winners winners) {
        return winnerRepository.save(winners);
    }

    @Override
    public void deleteWinnerById(Long id) {
        winnerRepository.deleteById(id);
    }

    @Override
    public void deleteWinner(Winners winners) {
        winnerRepository.delete(winners);
    }
}
