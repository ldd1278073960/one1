package com.one.games.domain.entity;

import lombok.Data;

@Data
public class GameCommentImg {
    /**
     * 论坛图片id
     */
    private Integer gameCommentImgId;

    /**
     * 论坛id
     */
    private Integer gameCommentId;

    /**
     * 论坛图片名字
     */
    private String gameCommentName;


}