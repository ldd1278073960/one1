package com.one.games.mapper;


import com.one.games.domain.vo.GameImgVo;
import com.one.games.domain.vo.GameVo;

import java.util.List;

/**
 * @author Administrator
 */
public interface GameImgMapper {


    /**
     * 图片画廊
     *
     * @return 图片集合
     */
    List<GameVo> byFindGameImgVo();
}