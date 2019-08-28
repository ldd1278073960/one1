package com.one.games.service;

import com.one.games.domain.entity.Game;
import com.one.games.utils.BannerResult;

import java.util.List;

/**
 *
 * @author Tang
 */
public interface HomeService {
    /**
     * 首页轮播图
     * @return
     */
    BannerResult getBanner();

    /**
     * 获取网络游戏
     * @return
     */
    List<Game> getGameInf();

    /**
     * 排名最好的前三个游戏
     * @return
     */
    List<Game> getBastGameOrFrou();
}
