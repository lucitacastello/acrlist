package com.acrdev.acrlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acrdev.acrlist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
