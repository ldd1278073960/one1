package com.one.games.mapper;

import com.one.games.domain.entity.GameShoppingCart;
import com.one.games.domain.vo.GameShoppingCartVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author Administrator
 */
public interface GameShoppingCartMapper {

    /**
     * 购物车所有数据的查询
     * @return
     */
    List<GameShoppingCartVo> selectGameShoppingCartVos();

    /**
     * 购物车删除数据的操作
     * @param gameCartId
     * @return
     */
    int deleteGameShoppingCartVos(@Param("gameCartId") int gameCartId);

    /**
     * 如果购物车中存在同一条数据就做+1的操作
     * @param gameId
     * @param userId
     * @return
     */
    int updateGameShoppingCartVos(@Param("gameId") int gameId,@Param("userId") int userId);

    /**
     * 如果购物车中不存在这条数据就添加
     * @param gameId
     * @param userId
     * @return
     */
    int  insertGameShoppingCartVos(@Param("gameId") int gameId , @Param("userId") int userId);


    /**
     * 根据某条Id查询数据库的某条数据
     * @param gameId
     * @param userId
     * @return
     */
    GameShoppingCart selectCartId(@Param("gameId") int gameId, @Param("userId") int userId);


    /**
     * 在购物车中做增加减少商品数量的操作
     * @param gameCartId
     * @param num
     * @return
     */
    int shopCartNum(@Param("gameCartId")int gameCartId , @Param("num") int num);
}
