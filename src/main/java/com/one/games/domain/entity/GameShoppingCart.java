package com.one.games.domain.entity;

import lombok.Data;

/**
 * 购物车类
 * @author Administrator
 */
@Data
public class GameShoppingCart {

    private Integer gameCartId;

    private Integer gameId;

    private Integer userId;

    private Integer num;

    private String createDate;

    private Integer cartStatus;

}
