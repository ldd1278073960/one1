package com.one.games.domain.entity;

import lombok.Data;

@Data
public class Banner {
    /**
     * 轮播图id
     */
    private Integer bannerId;

    /**
     * 轮播类型
     */
    private String bannerType;

    /**
     * 游戏ID-外键
     */
    private Integer gameId;

    /**
     * 轮播图片
     */
    private String bannerImg;

}