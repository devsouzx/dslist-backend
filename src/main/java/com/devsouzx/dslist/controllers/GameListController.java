package com.devsouzx.dslist.controllers;

import com.devsouzx.dslist.dto.GameListDTO;
import com.devsouzx.dslist.dto.GameMinDTO;
import com.devsouzx.dslist.dto.ReplacementDTO;
import com.devsouzx.dslist.services.GameListService;
import com.devsouzx.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping("/{id}")
    public GameListDTO findById(@PathVariable Long id) {
        return gameListService.findById(id);
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findGames(@PathVariable Long listId) {
        return gameService.FindByGameList(listId);
    }

    @PostMapping("/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
