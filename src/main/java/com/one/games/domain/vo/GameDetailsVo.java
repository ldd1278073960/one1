package com.one.games.domain.vo;

import com.one.games.domain.entity.GameConf;
import com.one.games.domain.entity.GameDetails;
import com.one.games.domain.entity.GameImg;
import lombok.Data;

@Data
public class GameDetailsVo extends GameDetails {
    GameConf gameConf;
    GameImgVo gameImgVo;
}
