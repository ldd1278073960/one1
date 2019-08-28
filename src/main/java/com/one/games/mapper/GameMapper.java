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


    /**
     * 返回首页游戏轮播图
     * @return
     */
    List<Game> homeOnlineGameInf();

    /**
     * 评价最高的游戏
     * @return
     */
    List<Game> bastGame();
}