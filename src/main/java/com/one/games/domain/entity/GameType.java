package com.one.games.domain.entity;

import lombok.Data;

@Data
public class GameType {
    /**
     * 游戏类型ID
     */
    private Integer gameTypeId;

    /**
     * 游戏类型名字
     */
    private String gameTypeName;

    /**
     * 是否使用,1为不使用,0为使用
     */
    private Integer gameTypeStatus;


}