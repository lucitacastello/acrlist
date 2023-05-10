package com.acrdev.acrlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acrdev.acrlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
