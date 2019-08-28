package com.one.games.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 1为管理员,0为普通用户
     */
    private Integer userAdmin;

    /**
     * 1为不使用,0为使用
     */
    private Integer userStatus;

    /**
     * 用户创建时间
     */
    private Date userCretime;

}