package com.one.games.mapper;


import com.one.games.domain.entity.Game;
import com.one.games.domain.vo.GameVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface GameMapper {

    /**
     * 总游戏表
     * @return
     */
    List<Game> findByGame();


    /**
     * 返回首页游戏轮播图
     * @return
     */
    List<Game> homeOnlineGameInf();

    /**
     * 评价最高的游戏
     * @return
     */
    List<Game> bastGame();


    /**
     * 游戏全部信息
     * @param gameId
     * @return
     */
    List<Game> gameInf(@Param("gameId") int gameId);

    /**
     * 根据游戏名字查找游戏信息
     * @param gameName
     * @return
     */
    Game search(@Param("gameName")String gameName);

    /**
     * 根据游戏名字查找游戏图片
     * @param gameName
     * @return
     */
    Game searchImg(@Param("gameName") String gameName);

    /**
     * 游戏页面图片展示
     * @return
     */
    List<GameVo> gameIndex();
}