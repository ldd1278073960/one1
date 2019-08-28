package com.one.games.mapper;

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
    List<GameShoppingCartVo> deleteGameShoppingCartVos(@Param("gameCartId") int gameCartId);

    /**
     * 如果购物车中存在同一条数据就做+1的操作
     * @param gameCartId
     * @return
     */
    List<GameShoppingCartVo> updateGameShoppingCartVos(@Param("gameCartId") int gameCartId);

    /**
     * 如果购物车中不存在这条数据就添加
     * @param gameId
     * @param userId
     * @return
     */
    List<GameShoppingCartVo> insertGameShoppingCartVos(@Param("gameId") int gameId , @Param("userId") int userId);
}
