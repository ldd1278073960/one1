package com.one.games.domain.entity;

import lombok.Data;

@Data
public class GameConsult {
    /**
     * 游戏咨询id
     */
    private Integer gameConsultId;

    /**
     * game_consult_title
     */
    private String gameConsultTitle;

    /**
     * game_consult_conte
     */
    private String gameConsultConte;

    /**
     * 游戏ID 外键
     */
    private Integer gameId;


}