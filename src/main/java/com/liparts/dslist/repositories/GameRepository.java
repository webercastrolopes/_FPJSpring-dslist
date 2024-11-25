package com.liparts.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liparts.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
