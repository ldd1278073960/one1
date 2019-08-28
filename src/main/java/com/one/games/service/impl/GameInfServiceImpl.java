package com.one.games.service.impl;

import com.one.games.domain.entity.Game;
import com.one.games.domain.entity.GameComment;
import com.one.games.mapper.GameCommentMapper;
import com.one.games.mapper.GameMapper;
import com.one.games.service.GameInfService;
import com.one.games.utils.RecommendGame;
import com.one.games.utils.enumeration.GameTypeEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GameInfServiceImpl implements GameInfService {

    @Resource
    private GameMapper gameMapper;

    @Resource
    private GameCommentMapper gameCommentMapper;

    /**
     * 游戏详情页面游戏属性
     *
     * @param gameId 游戏id
     * @return 游戏集合
     */
    @Override
    public List<Game> gameInf(int gameId) {
        return gameMapper.gameInf(gameId);
    }

    /**
     * 游戏详情页面的游戏评价
     *
     * @param gameId 游戏id
     * @return 游戏评论集合
     */
    @Override
    public List<GameComment> gameComment(int gameId) {
        return gameCommentMapper.findGameComment(gameId);
    }

    /**
     * 游戏详情页推荐游戏
     *
     * @return
     */
    @Override
    public RecommendGame recommendGame() {

        List<Game> onlineGame = gameMapper.recommedGame(GameTypeEnum.getInstance("ONLINEGAME").getType(), 2);
        List<Game> phoneGame = gameMapper.recommedGame(GameTypeEnum.getInstance("PHONEGAME").getType(), 2);
        List<Game> webGame = gameMapper.recommedGame(GameTypeEnum.getInstance("WEBGAME").getType(), 4);
        List<Game> pcGame = gameMapper.recommedGame(GameTypeEnum.getInstance("PCGAME").getType(), 6);

        RecommendGame recommendGame = new RecommendGame();

        recommendGame.setOnlineGame(onlineGame);
        recommendGame.setPhoneGame(phoneGame);
        recommendGame.setWebGame(webGame);
        recommendGame.setPcGame(pcGame);

        return recommendGame;
    }
}
