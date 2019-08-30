package com.one.games.service;

import com.one.games.domain.vo.GameShoppingCartVo;

import java.util.List;

/**
 *
 * @author Administrator
 */
public interface GameShoppingCartService {

    /**
     * 购物车所有数据的查询，页面展示的
     * @return
     */
    List<GameShoppingCartVo> selectGameShoppingCartVos();

    /**
     * 购物车删除数据的操作
     * @param gameCartId
     * @return
     */
    int deleteGameShoppingCartVos(int gameCartId);


    /**
     * 根据某条Id查询数据库的某条数据,如果存在这条数据就做数量+1的操作，如果不存在就做添加这条数据的操作
     * @param cartId
     * @param gameId
     * @return
     */
    int selectCartId(int cartId,int gameId);


    /**
     * 在购物车中做增加减少商品数量的操作
     * @param gameCartId
     * @param num
     * @return
     */
    int shopCartNum(int gameCartId,int num);
}
