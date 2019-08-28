package com.one.games.mapper;


import com.one.games.domain.vo.BannerVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BannerMapper {

    public List<BannerVo> geiBanner(@Param("type") String type);
}