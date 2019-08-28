package com.one.games.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class GameDetails {
    /**
     * 游戏详情ID
     */
    private Integer gameDetailsId;

    /**
     * 游戏概述
     */
    private String gameDetailsSum;

    /**
     * 游戏配置信息
     */
    private String gameDetailsConf;

    /**
     * 游戏创建时间
     */
    private Date gameDetailsCretime;

    /**
     * 游戏发售时间
     */
    private Date gameDetailsTime;

    /**
     * 游戏下载地址
     */
    private String gameDetailsDownl;

    /**
     * 游戏ID-外键
     */
    private Integer gameId;


}