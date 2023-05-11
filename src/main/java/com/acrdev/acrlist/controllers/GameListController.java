package com.acrdev.acrlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acrdev.acrlist.dto.GameListDTO;
import com.acrdev.acrlist.services.GameListService;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService service;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = service.findAll();
        return result;
    }

}
