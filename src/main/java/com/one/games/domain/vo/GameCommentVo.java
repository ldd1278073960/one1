package com.one.games.domain.vo;

import com.one.games.domain.entity.GameComment;
import com.one.games.domain.entity.User;
import lombok.Data;

@Data
public class GameCommentVo extends GameComment {
    User user;
}
