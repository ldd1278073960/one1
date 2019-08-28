package com.one.games.domain.vo;

import com.one.games.domain.entity.GameImg;
import lombok.Data;

import java.util.List;

/**
 * @author Administrator
 */
@Data
public class GameImgVo extends GameImg {

    List<GameImg> listGameImgVo;

}
