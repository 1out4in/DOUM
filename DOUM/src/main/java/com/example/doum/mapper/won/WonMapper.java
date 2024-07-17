package com.example.doum.mapper.won;

import com.example.doum.domain.dto.won.WonJoinOrgDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WonMapper {

    void orgJoin (WonJoinOrgDTO dto);

    // 게시판 목록
//     List<anonymous> selectAll(int startRow, int endRow);




}
