package com.one.games.service.impl;

import com.one.games.domain.entity.Game;
import com.one.games.domain.entity.GameComment;
import com.one.games.mapper.GameCommentMapper;
import com.one.games.mapper.GameMapper;
import com.one.games.service.GameInfService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GameInfServiceImpl implements GameInfService {

    @Resource
    private GameMapper gameMapper;

    @Resource
    private GameCommentMapper gameCommentMapper;

    @Override
    public List<Game> gameInf(int gameId) {

        return gameMapper.gameInf(gameId);
    }

    @Override
    public List<GameComment> gameComment(int gameId) {
        return gameCommentMapper.findGameComment(gameId);
    }
}
