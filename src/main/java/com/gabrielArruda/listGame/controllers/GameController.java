package com.gabrielArruda.listGame.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielArruda.listGame.dto.GameMinDTO;

import java.util.List;

import com.gabrielArruda.listGame.services.GameService;

/* Porta de entrada para o Backend (Disponibilizar a API) */

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    public GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
