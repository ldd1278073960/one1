package com.one.games.mapper;


import com.one.games.domain.entity.Game;
import org.apache.ibatis.annotations.Param;
import com.one.games.domain.vo.GameVo;


import java.util.List;

/**
 * @author Administrator
 */
public interface GameMapper {

    /**
     * 总游戏表,做图片画廊用的
     * @return
     */
    List<GameVo> findByGame();


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
     * 推荐游戏(1为 网游 2为手游 3为页游 4为单机大作)
     *
     * @param gameType 游戏类型
     * @param howMany  输出多少
     * @return 游戏集合
     */
    List<Game> recommedGame(@Param("gameType") int gameType,@Param("howMany") int howMany);


//    /**
//     * 游戏全部信息
//     * @param gameId
//     * @return
//     */
//    List<Game> gameInf(@Param("gameId") int gameId);
//
//    /**
//     * 推荐游戏(1为 网游 2为手游 3为页游 4为单机大作)
//     *
//     * @param gameType 游戏类型
//     * @param howMany  输出多少
//     * @return 游戏集合
//     */
//    List<Game> recommedGame(@Param("gameType") int gameType,@Param("howMany") int howMany);
}