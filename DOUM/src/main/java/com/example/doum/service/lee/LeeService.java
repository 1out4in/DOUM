package com.example.doum.service.lee;

import com.example.doum.domain.dto.lee.LeeMyPageStoryDTO;
import com.example.doum.mapper.lee.LeeMapper;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface LeeService {


    //게시물(내 스토리들) 목록
   // List<LeeMyPageStoryDTO> getStories();



    //게시물(story) 작성
    void saveStory(LeeMyPageStoryDTO myPageStoryDTO, List<MultipartFile> files);








        //게시글 상세보기
        // LeeMyPageStoryDTO getStoryById(Long storyId, CustomOAuth2User customOAuth2User);








}
