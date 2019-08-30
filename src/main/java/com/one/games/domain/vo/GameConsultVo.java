package com.one.games.domain.vo;

import com.one.games.domain.entity.GameConsult;
import com.one.games.domain.entity.GameImg;
import lombok.Data;

/**
 * @author Shinelon
 */
@Data
public class GameConsultVo extends GameConsult {
    /**
     * 咨询对应图片
     */
    GameImgVo gameImgVo;
}
