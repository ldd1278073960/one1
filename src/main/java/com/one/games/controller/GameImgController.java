package com.one.games.controller;

import com.one.games.domain.vo.GameVo;
import com.one.games.service.GameImgService;
import com.one.games.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 图片画廊
 * @author Administrator
 *
 *
 *
 */
@RestController
@Slf4j
@RequestMapping("/gameImg")
public class GameImgController {

    @Resource
    GameImgService gameImgService;

    /**
     * 图片画廊
     * @return
     */
    @GetMapping("/Gallery")
    public Result gameImgGallery(){
        try{
            List<GameVo> byGameImg = gameImgService.findByGameImg();
            return Result.success(byGameImg);
        }catch (Exception e){
            log.error(e.getMessage());
            return Result.error();
        }
    }

}
