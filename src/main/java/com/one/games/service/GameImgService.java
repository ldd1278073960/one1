package com.one.games.service;

import com.one.games.domain.vo.GameVo;

import java.util.List;

/**
 * @author Administrator
 */
public interface GameImgService {

    /**
     * 图片画廊
     * @return
     */
    List<GameVo> findByGameImg();

}
