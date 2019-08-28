package com.one.games.domain.entity;

import lombok.Data;

@Data
public class Navigation {
    /**
     * 导航栏id
     */
    private Integer navigationId;

    /**
     * 导航名
     */
    private String navgationName;

    /**
     * 是否使用,1为不使用,0为使用
     */
    private Integer navgationStatus;

}