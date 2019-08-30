package com.one.games.domain.vo;

import com.one.games.domain.entity.Game;
import com.one.games.domain.entity.GameDetails;
import com.one.games.domain.entity.GameImg;
import lombok.Data;

import java.util.List;

/**
 * @author Administrator
 */

@Data
public class GameVo extends Game {

    /**
     * 总游戏类
     */
    List<Game> GameS;

    /**
     * 图片数组
     */
    List<GameImg> gameImgs;


    /**
     * 配置信息类
     */
    GameDetailsVo gameDetailsVo;

    /**
     * 根据名字查图片
     */
    GameImg gameImg;



}
