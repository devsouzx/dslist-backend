package com.devsouzx.dslist.services;

import com.devsouzx.dslist.dto.GameMinDTO;
import com.devsouzx.dslist.entities.Game;
import com.devsouzx.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        return games.stream().map(GameMinDTO::new).toList();
    }
}
