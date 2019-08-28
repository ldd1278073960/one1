package com.one.games.mapper;


import com.one.games.domain.entity.GameComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GameCommentMapper {
    public List<GameComment> findGameComment(@Param("gameId") int gameId);
}