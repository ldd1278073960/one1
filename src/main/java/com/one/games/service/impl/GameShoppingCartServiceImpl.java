package com.one.games.service.impl;

import com.one.games.domain.entity.GameShoppingCart;
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
     * 查询购物车的所有信息，用来展示
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
    public int deleteGameShoppingCartVos(int gameCartId) {
        int gameShoppingCartVos = gameShoppingCartMapper.deleteGameShoppingCartVos(gameCartId);
        return gameShoppingCartVos;
    }


    /**
     * 根据某条Id查询数据库的某条数据
     * @param gameId
     * @return
     */
    @Override
    public int selectCartId(int userId,int gameId) {
        //查询数据库有无此条信息
        GameShoppingCart cartId1 = gameShoppingCartMapper.selectCartId(userId,gameId);

        if (cartId1 == null ){

            int insert = gameShoppingCartMapper.insertGameShoppingCartVos(userId,gameId);
            return insert;

        }else{
            int update = gameShoppingCartMapper.updateGameShoppingCartVos(gameId,userId);
            return update;

        }
    }

    /**
     * 在购物车中做增加减少商品数量的操作
     * @param gameCartId
     * @param num
     * @return
     */
    @Override
    public int shopCartNum(int gameCartId,int num) {
        int i = gameShoppingCartMapper.shopCartNum(gameCartId, num);
        return i;
    }


}
