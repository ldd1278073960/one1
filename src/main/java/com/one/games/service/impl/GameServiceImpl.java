package com.one.games.service.impl;

import com.one.games.domain.entity.Game;
import com.one.games.domain.entity.GameConsult;
import com.one.games.domain.vo.GameVo;
import com.one.games.mapper.GameConsultMapper;
import com.one.games.mapper.GameMapper;
import com.one.games.service.GameService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GameServiceImpl implements GameService {
    @Resource
    GameMapper gameMapper;
    @Resource
    GameConsultMapper gameConsultMapper;
    @Override
    public Game search(String gameName) {
        Game game = gameMapper.search(gameName);
        return game;
    }


    @Override
    public List<GameVo> gameIndex() {
        List<GameVo> gameVos = gameMapper.gameIndex();
        return gameVos;
    }

    @Override
    public List<GameConsult> consult() {
        return gameConsultMapper.consult();
    }
}
