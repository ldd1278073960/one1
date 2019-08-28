package com.one.games.service.impl;


import com.one.games.domain.vo.GameVo;
import com.one.games.mapper.GameMapper;
import com.one.games.service.GameImgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 图片画廊
 * @author Administrator
 */
@Service
public class GameImgServiceImpl implements GameImgService{

    @Resource
    GameMapper gameMapper;
    @Override
    public List<GameVo> findByGameImg() {
        List<GameVo> byGame = gameMapper.findByGame();
        return byGame;
    }
}
