package com.one.games.controller;

import com.one.games.domain.entity.Game;
import com.one.games.domain.entity.GameConsult;
import com.one.games.domain.vo.GameVo;
import com.one.games.service.GameService;
import com.one.games.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SearchController {
    @Resource
    GameService gameService;

    /**
     * 根据名字查找游戏
     * @param gameName
     * @return
     */
   @RequestMapping("/search")
    public Result search(String gameName){
        Game game = null;
        try {
            game = gameService.search(gameName);

            return Result.success(game);
        } catch (Exception e) {
            return Result.error();
        }
    }


    /**
     * 咨询页面
     * @return
     */
    @RequestMapping("/consult")
    public Result consult(){
        try {
            List<GameConsult> consult = gameService.consult();
            return Result.success(consult);
        } catch (Exception e) {
            return Result.error();
        }
    }


    /**
     * 游戏页面展示
     * @return
     */
    @RequestMapping("/gameIndex")
   public Result gameIndex(){
        try {
            List<GameVo> games = gameService.gameIndex();
            return Result.success(games);
        } catch (Exception e) {
            return Result.error();
        }
    }
}
