package com.one.games.service;

import com.one.games.domain.entity.Game;
import com.one.games.domain.entity.GameConsult;
import com.one.games.domain.vo.GameVo;

import java.util.List;

public interface GameService {
    Game search(String gameName);
    Game searchImg(String gameName);
    List<GameVo> gameIndex();
    List<GameConsult> consult();
}
