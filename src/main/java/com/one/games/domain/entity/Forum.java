package com.one.games.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Forum {
    /**
     * 论坛表id
     */
    private Integer forumId;

    /**
     * 论坛标题
     */
    private String forumTitle;

    /**
     * 论坛创建时间
     */
    private Date fprumCretime;

    /**
     * 用户ID-外键
     */
    private Integer userId;

    /**
     * 游戏类型
     */
    private Integer gameTypeId;

}