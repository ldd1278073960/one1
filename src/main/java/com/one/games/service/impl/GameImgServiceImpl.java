package com.one.games.service.impl;


import com.one.games.domain.entity.Game;
import com.one.games.domain.vo.GameImgVo;
import com.one.games.domain.vo.GameVo;
import com.one.games.mapper.GameImgMapper;
import com.one.games.mapper.GameMapper;
import com.one.games.service.GameImgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class GameImgServiceImpl implements GameImgService{

    @Resource
    GameImgMapper gameImgMapper;

    @Resource
    GameMapper gameMapper;

    @Override
    public List<GameVo> findByGameImg() {
        List<GameVo> gameImgVos = gameImgMapper.byFindGameImgVo();
        return gameImgVos;
    }
}
