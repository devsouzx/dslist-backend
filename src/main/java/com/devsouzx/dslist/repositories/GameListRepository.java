package com.devsouzx.dslist.repositories;

import com.devsouzx.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository  extends JpaRepository<GameList, Long> {
}
