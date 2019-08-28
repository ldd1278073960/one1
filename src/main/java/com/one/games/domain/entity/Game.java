package com.one.games.domain.entity;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class Game {
    /**
     * 游戏ID
     */
    private Integer gameId;

    /**
     * 游戏名字
     */
    private String gameName;

    /**
     * 1为不使用,0为使用
     */
    private Integer gameStatus;

    /**
     * 游戏类型
     */
    private Integer gameTypeId;

    /**
     * 游戏图片的一对一查询
     */
    private GameImg gameImg;
}