package com.one.games.domain.entity;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class GameComment {
    /**
     * 游戏评论表的id
     */
    private Integer gameCommentId;

    /**
     * 游戏评论的内容
     */
    private String gameCommentContent;

    /**
     * 用户ID-外键
     */
    private Integer userId;

    /**
     * 游戏ID-外键
     */
    private Integer gameId;

}