package com.one.games.service.impl;

import com.one.games.domain.vo.GameShoppingCartVo;
import com.one.games.mapper.GameShoppingCartMapper;
import com.one.games.service.GameShoppingCartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 购物车
 * @author Administrator
 */
@Service
public class GameShoppingCartServiceImpl implements GameShoppingCartService {

    @Resource
    GameShoppingCartMapper gameShoppingCartMapper;

    /**
     * 查询购物车的所有信息
     * @return
     */
    @Override
    public List<GameShoppingCartVo> selectGameShoppingCartVos() {
        List<GameShoppingCartVo> gameShoppingCartVos = gameShoppingCartMapper.selectGameShoppingCartVos();
        return gameShoppingCartVos;
    }


    /**
     * 删除某条数据的操作
     * @param gameCartId
     * @return
     */
    @Override
    public List<GameShoppingCartVo> deleteGameShoppingCartVos(int gameCartId) {
        List<GameShoppingCartVo> gameShoppingCartVos = gameShoppingCartMapper.deleteGameShoppingCartVos(gameCartId);
        return gameShoppingCartVos;
    }

    /**
     * 如果购物车中存在同一条数据就做+1的操作
     * @param gameCartId
     * @return
     */
    @Override
    public List<GameShoppingCartVo> updateGameShoppingCartVos(int gameCartId) {
        List<GameShoppingCartVo> gameShoppingCartVos = gameShoppingCartMapper.updateGameShoppingCartVos(gameCartId);
        return gameShoppingCartVos;
    }

    /**
     * 如果购物车中不存在这条数据就添加
     * @param gameId
     * @param userId
     * @return
     */
    @Override
    public List<GameShoppingCartVo> insertGameShoppingCartVos(int gameId, int userId) {
        List<GameShoppingCartVo> gameShoppingCartVos = gameShoppingCartMapper.insertGameShoppingCartVos(gameId, userId);
        return gameShoppingCartVos;
    }
}
