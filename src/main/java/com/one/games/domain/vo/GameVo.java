package com.one.games.domain.vo;

import com.one.games.domain.entity.Game;
import com.one.games.domain.entity.GameDetails;
import com.one.games.domain.entity.GameImg;
import lombok.Data;

import java.util.List;

@Data
public class GameVo extends Game {

    List<Game> findByGame;


    /**
     * 图片数组
     */
    List<GameImg> gameImgs;


    /**
     * 配置信息类
     */
    GameDetailsVo gameDetailsVo;
}
