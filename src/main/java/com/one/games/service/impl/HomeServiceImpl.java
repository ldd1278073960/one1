package com.one.games.service.impl;

import com.one.games.domain.entity.Game;
import com.one.games.domain.vo.BannerVo;
import com.one.games.mapper.BannerMapper;
import com.one.games.mapper.GameMapper;
import com.one.games.service.HomeService;
import com.one.games.utils.BannerResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Tang
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Resource
    private BannerMapper bannerMapper;

    @Resource
    private GameMapper gameMapper;

    /**
     * 获取轮播图
     * @return
     */
    @Override
    public BannerResult getBanner() {
        List<BannerVo> a = bannerMapper.geiBanner("特色轮播");

        List<BannerVo> b = bannerMapper.geiBanner("网游轮播");

        List<BannerVo> c = bannerMapper.geiBanner("首页轮播");

        BannerResult bannerResult = new BannerResult();

        bannerResult.setMainBanner(c);
        bannerResult.setFeatureBanner(a);
        bannerResult.setOnlineBanner(b);


        return bannerResult;
    }

    /**
     * 首页游戏信息
     * @return
     */
    @Override
    public List<Game> getGameInf() {

        return gameMapper.homeOnlineGameInf();

    }

    /**
     * 最佳前四游戏
     * @return
     */
    @Override
    public List<Game> getBastGameOrFrou() {

        return gameMapper.bastGame();
    }


}
