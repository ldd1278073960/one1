package com.one.games.utils;

import com.one.games.domain.entity.Game;
import lombok.Data;

import java.util.List;


/**
 * @author Tang
 * 不同游戏类型的游戏
 */
@Data
public class RecommendGame {
    List<Game> onlineGame;
    List<Game> phoneGame;
    List<Game> webGame;
    List<Game> pcGame;
}
