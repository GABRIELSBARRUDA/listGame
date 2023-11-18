package com.gabrielArruda.listGame.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.gabrielArruda.listGame.dto.GameMinDTO;
import com.gabrielArruda.listGame.entities.Game;
import com.gabrielArruda.listGame.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    public GameRepository gameRepository; /* Chamando o componencte GameRepository */

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
    
}
