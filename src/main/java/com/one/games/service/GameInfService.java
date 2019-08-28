package com.one.games.service;

import com.one.games.domain.entity.Game;

import java.util.List;

public interface GameInfService {

    /**
     * 游戏详情页面游戏属性
     * @param gameId
     * @return
     */
    List<Game> gameInf(int gameId);
}
