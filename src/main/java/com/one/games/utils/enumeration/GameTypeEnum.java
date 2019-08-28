package com.one.games.utils.enumeration;

/**
 * 游戏类型枚举
 * @author Tang
 */

public enum GameTypeEnum {
    /**
     * 网络游戏
     * 手机游戏
     * 网页游戏
     * PC游戏
     */
    ONLINEGAME("ONLINEGAME",1),
    PHONEGAME("PHONEGAME",2),
    WEBGAME("WEBGAME",3),
    PCGAME("PCGAME",4);


    private String code;
    private Integer type;


    public String getCode(){
        return code;
    }

    public Integer getType(){
        return type;
    }

    GameTypeEnum(String code, Integer type){
        this.code = code;
        this.type = type;
    }

    public static GameTypeEnum getInstance(String code){
        for (GameTypeEnum value : GameTypeEnum.values()){
            if(value.getCode().equals(code)){
                return value;
            }
        }
        return null;
    }
}
