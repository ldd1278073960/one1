package com.one.games.domain.entity;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class GameImg {
    /**
     * 游戏图片id
     */
    private Integer gameImgId;

    /**
     * 游戏图片地址
     */
    private String gameImgUrl;

    /**
     * 游戏配置id
     */
    private Integer gameDetailsId;

    /**
     * 是否使用,1为使用,0为不使用
     */
    private Integer gameImgStatus;

    /**
     * 游戏id的外键
     */
    private Integer gameId;

    public Integer getGameImgId() {
        return gameImgId;
    }

    public void setGameImgId(Integer gameImgId) {
        this.gameImgId = gameImgId;
    }

    public String getGameImgUrl() {
        return gameImgUrl;
    }

    public void setGameImgUrl(String gameImgUrl) {
        this.gameImgUrl = gameImgUrl;
    }

    public Integer getGameDetailsId() {
        return gameDetailsId;
    }

    public void setGameDetailsId(Integer gameDetailsId) {
        this.gameDetailsId = gameDetailsId;
    }

    public Integer getGameImgStatus() {
        return gameImgStatus;
    }

    public void setGameImgStatus(Integer gameImgStatus) {
        this.gameImgStatus = gameImgStatus;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }
}