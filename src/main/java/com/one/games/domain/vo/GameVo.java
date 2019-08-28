package com.one.games.domain.vo;

import com.one.games.domain.entity.Game;
import lombok.Data;

import java.util.List;

@Data
public class GameVo extends Game {

    List<Game> findByGame;

}
