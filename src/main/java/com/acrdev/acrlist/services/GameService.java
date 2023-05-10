package com.acrdev.acrlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acrdev.acrlist.dto.GameDTO;
import com.acrdev.acrlist.dto.GameMinDTO;
import com.acrdev.acrlist.entities.Game;
import com.acrdev.acrlist.repositories.GameRepository;



@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();

        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){

        Game result = gameRepository.findById(id).get(); //get por causa do Optional
        GameDTO dto = new GameDTO(result);
        return dto;

    }
}
