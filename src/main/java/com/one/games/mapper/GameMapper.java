package com.one.games.mapper;


import com.one.games.domain.entity.Game;

import java.util.List;

/**
 * @author Administrator
 */
public interface GameMapper {

    /**
     * 总游戏表
     * @return
     */
    List<Game> findByGame();

}