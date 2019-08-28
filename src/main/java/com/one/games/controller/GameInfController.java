package com.one.games.controller;


import com.one.games.domain.entity.Game;

import com.one.games.domain.entity.GameComment;
import com.one.games.service.GameInfService;
import com.one.games.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Tang
 */
@RequestMapping("gameInf")
@RestController
public class GameInfController {

    @Resource
    private GameInfService gameInfService;

    /**
     * 游戏详情信息
     * @param gameId 游戏id
     * @return
     */
    @RequestMapping("game")
    public Object gameInf(int gameId){
        try {
            List<Game> games = gameInfService.gameInf(gameId);
            return Result.success(games);
        }catch (Exception e){
            return Result.error();
        }
    }

    /**
     * 游戏评论信息
     * @param gameId 游戏id
     * @return
     */
    @RequestMapping("gameComment")
    public Object gameComment(int gameId){
        try{
            List<GameComment> gameComments = gameInfService.gameComment(gameId);
            return Result.success(gameComments);
        }catch (Exception e){
            return Result.error();
        }
    }


}
