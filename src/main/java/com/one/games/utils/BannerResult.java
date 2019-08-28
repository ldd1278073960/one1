package com.one.games.utils;

import com.one.games.domain.vo.BannerVo;
import lombok.Data;

import java.util.List;


/**
 *
 * @author Tang
 */
@Data
public class BannerResult {

    List<BannerVo> mainBanner;
    List<BannerVo> featureBanner;
    List<BannerVo> onlineBanner;

}
