package com.one.games.domain.vo;

import com.one.games.domain.entity.Game;
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


    List<GameImg> gameImgs;
}
