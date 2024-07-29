package com.example.doum.mapper.lee;


import com.example.doum.domain.dto.lee.LeeFileDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileMapper {

    //첨부파일 insert
    void insertFile(LeeFileDTO fileDTO);

    //해당 스토리의 파일 select
    List<LeeFileDTO> selectFileList(Long storyId);

    //파일을 db에서 삭제

    void deleteFile(Long storyId);









}
