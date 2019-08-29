package com.one.games.domain.entity;

public class GameConf {
    /**
     * 游戏配置ID
     */
    private Integer gameConfId;

    /**
     * 游戏详情id
     */
    private Integer gameDetailsId;

    /**
     * 推荐操作系统
     */
    private String gameConfRecomOs;

    /**
     * 推荐cpu
     */
    private String gameConfRecomCpu;

    /**
     * 推荐内存
     */
    private String gameConfRecomMem;

    /**
     * 推荐显卡
     */
    private String gameConfRecomGra;

    /**
     * 推荐内存空间
     */
    private String gameConfRecomInter;

    /**
     * 最低操作系统
     */
    private String gameConfLowOs;

    /**
     * 最低cpu
     */
    private String gameConfLowCpu;

    /**
     * 最低内存
     */
    private String gameConfLowMem;

    /**
     * 最低显卡
     */
    private String gameConfLowGar;

    /**
     * 最低内存空间
     */
    private String gameConfLowInter;

    /**
     * game_id的外键约束
     */
    private Integer gameId;

    public Integer getGameConfId() {
        return gameConfId;
    }

    public void setGameConfId(Integer gameConfId) {
        this.gameConfId = gameConfId;
    }

    public Integer getGameDetailsId() {
        return gameDetailsId;
    }

    public void setGameDetailsId(Integer gameDetailsId) {
        this.gameDetailsId = gameDetailsId;
    }

    public String getGameConfRecomOs() {
        return gameConfRecomOs;
    }

    public void setGameConfRecomOs(String gameConfRecomOs) {
        this.gameConfRecomOs = gameConfRecomOs;
    }

    public String getGameConfRecomCpu() {
        return gameConfRecomCpu;
    }

    public void setGameConfRecomCpu(String gameConfRecomCpu) {
        this.gameConfRecomCpu = gameConfRecomCpu;
    }

    public String getGameConfRecomMem() {
        return gameConfRecomMem;
    }

    public void setGameConfRecomMem(String gameConfRecomMem) {
        this.gameConfRecomMem = gameConfRecomMem;
    }

    public String getGameConfRecomGra() {
        return gameConfRecomGra;
    }

    public void setGameConfRecomGra(String gameConfRecomGra) {
        this.gameConfRecomGra = gameConfRecomGra;
    }

    public String getGameConfRecomInter() {
        return gameConfRecomInter;
    }

    public void setGameConfRecomInter(String gameConfRecomInter) {
        this.gameConfRecomInter = gameConfRecomInter;
    }

    public String getGameConfLowOs() {
        return gameConfLowOs;
    }

    public void setGameConfLowOs(String gameConfLowOs) {
        this.gameConfLowOs = gameConfLowOs;
    }

    public String getGameConfLowCpu() {
        return gameConfLowCpu;
    }

    public void setGameConfLowCpu(String gameConfLowCpu) {
        this.gameConfLowCpu = gameConfLowCpu;
    }

    public String getGameConfLowMem() {
        return gameConfLowMem;
    }

    public void setGameConfLowMem(String gameConfLowMem) {
        this.gameConfLowMem = gameConfLowMem;
    }

    public String getGameConfLowGar() {
        return gameConfLowGar;
    }

    public void setGameConfLowGar(String gameConfLowGar) {
        this.gameConfLowGar = gameConfLowGar;
    }

    public String getGameConfLowInter() {
        return gameConfLowInter;
    }

    public void setGameConfLowInter(String gameConfLowInter) {
        this.gameConfLowInter = gameConfLowInter;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }
}