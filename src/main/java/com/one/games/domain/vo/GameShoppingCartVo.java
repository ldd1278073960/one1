package com.one.games.domain.vo;

import com.one.games.domain.entity.Game;
import com.one.games.domain.entity.GameShoppingCart;
import com.one.games.domain.entity.User;
import lombok.Data;

import java.util.List;


/**
 * 购物车功能在前端传输的类
 * @author Administrator
 */
@Data
public class GameShoppingCartVo extends GameShoppingCart {

    /**
     * 创建购物车类的集合
     */
    List<GameShoppingCart> gameShoppingCarts;

    /**
     * 一对多查询，游戏表
     */
    List<Game> games;

    /**
     * 一对多查询，用户表表
     */
    List<User> users;
}
