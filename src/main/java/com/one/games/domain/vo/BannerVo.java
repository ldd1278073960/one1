package com.one.games.domain.vo;

import com.one.games.domain.entity.Banner;
import com.one.games.domain.entity.Game;
import lombok.Data;

/**
 * @author Tang
 */
@Data
public class BannerVo extends Banner {
    Game game;
}
