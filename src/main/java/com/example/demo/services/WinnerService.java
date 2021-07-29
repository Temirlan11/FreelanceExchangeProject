package com.example.demo.services;

import com.example.demo.entities.Winners;

import java.util.List;

public interface WinnerService {
    Winners addWinner(Winners winner);
    Winners getWinner(Long id);
    List<Winners> getALlWinners();
    List<Winners> getWinnersByUserId(Long id);
    Winners updateWinner(Winners winners);
    void deleteWinnerById(Long id);
    void deleteWinner(Winners winners);
}
