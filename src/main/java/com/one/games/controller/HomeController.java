package com.one.games.controller;

import com.one.games.domain.entity.Game;
import com.one.games.service.HomeService;
import com.one.games.utils.BannerResult;
import com.one.games.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/home")
@RestController
public class HomeController {

    @Resource
    HomeService homeService;

    /**
     * 轮播图
     * @return
     */
    @RequestMapping("/banner")
    public Object getBanner() {
        try {
            BannerResult banner = homeService.getBanner();
            return Result.success(banner);
        }catch (Exception e){
            return Result.error();
        }
    }

    @RequestMapping("/gameInf")
    public Object getOnlineGameInf(){
        try {
            List<Game> gameInf = homeService.getGameInf();
            return Result.success(gameInf);
        }catch (Exception e){
            return Result.error();
        }
    }

    /**
     * 前四个最佳游戏
     * @return
     */
    @RequestMapping("/bastGame")
    public Object getBastGame(){
        try {

            List<Game> bastGameOrFrou = homeService.getBastGameOrFrou();

            return Result.success(bastGameOrFrou);

        }catch (Exception e){
            return Result.error();
        }
    }
}
