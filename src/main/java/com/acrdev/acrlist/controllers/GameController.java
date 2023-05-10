package com.acrdev.acrlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acrdev.acrlist.dto.GameDTO;
import com.acrdev.acrlist.dto.GameMinDTO;
import com.acrdev.acrlist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    //parei em 56:59
    //https://www.youtube.com/watch?v=fDcfZ7t4NsA
    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {

        GameDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll() {

        List<GameMinDTO> result = gameService.findAll();
        return result;

    }

}
