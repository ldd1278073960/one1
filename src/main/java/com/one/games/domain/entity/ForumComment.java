package com.one.games.domain.entity;

import java.util.Date;

public class ForumComment {
    /**
    * 论坛id
    */
    private Integer forumCommentId;

    /**
    * 用户ID-外键
    */
    private Integer userId;

    /**
    * fourum_comment_cont
    */
    private String fourumCommentCont;

    /**
    * 创建时间
    */
    private Date fourumCommentCretime;

    public Integer getForumCommentId() {
        return forumCommentId;
    }

    public void setForumCommentId(Integer forumCommentId) {
        this.forumCommentId = forumCommentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFourumCommentCont() {
        return fourumCommentCont;
    }

    public void setFourumCommentCont(String fourumCommentCont) {
        this.fourumCommentCont = fourumCommentCont;
    }

    public Date getFourumCommentCretime() {
        return fourumCommentCretime;
    }

    public void setFourumCommentCretime(Date fourumCommentCretime) {
        this.fourumCommentCretime = fourumCommentCretime;
    }
}