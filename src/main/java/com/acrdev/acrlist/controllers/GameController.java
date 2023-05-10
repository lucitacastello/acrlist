package com.acrdev.acrlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acrdev.acrlist.dto.GameMinDTO;
import com.acrdev.acrlist.entities.Game;
import com.acrdev.acrlist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findall(){

        List<GameMinDTO> result = gameService.findAll();
        return result;

    }
    
}