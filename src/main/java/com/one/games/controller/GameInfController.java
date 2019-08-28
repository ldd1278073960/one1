package com.one.games.controller;


import com.one.games.domain.entity.Game;

import com.one.games.service.GameInfService;
import com.one.games.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("gameInf")
@RestController
public class GameInfController {

    @Resource
    private GameInfService gameInfService;

    @RequestMapping("game")
    public Object gameInf(int gameId){
        try {
            List<Game> games = gameInfService.gameInf(gameId);
            return Result.success(games);
        }catch (Exception e){

            return Result.error();
        }
    }
}
