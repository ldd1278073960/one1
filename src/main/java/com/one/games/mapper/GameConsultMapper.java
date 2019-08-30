package com.one.games.mapper;


import com.one.games.domain.entity.GameConsult;

import java.util.List;

public interface GameConsultMapper {
    /**
     * 咨询页面
     * @return
     */
    List<GameConsult> consult();
}