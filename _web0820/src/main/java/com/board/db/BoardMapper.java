package com.board.db;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BoardMapper {
	@Select("select count(*) from board")
	int countBoard();

}
