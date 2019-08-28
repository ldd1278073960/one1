package com.one.games.service;

import com.one.games.domain.entity.Game;
import com.one.games.domain.entity.GameComment;
import com.one.games.utils.RecommendGame;

import java.util.List;

public interface GameInfService {

    /**
     * 游戏详情页面游戏属性
     * @param gameId
     * @return
     */
    List<Game> gameInf(int gameId);

    /**
     * 游戏详情页面的游戏评价
     * @param gameId
     * @return
     */
    List<GameComment> gameComment(int gameId);

    /**
     * 推荐游戏
     * @return
     */
    RecommendGame recommendGame();

}
