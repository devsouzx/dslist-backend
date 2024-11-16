package com.devsouzx.dslist.dto;

import com.devsouzx.dslist.entities.GameList;
import lombok.Getter;

@Getter
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
