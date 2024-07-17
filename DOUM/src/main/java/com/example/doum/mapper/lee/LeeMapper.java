package com.example.doum.mapper.lee;


import com.example.doum.domain.dto.lee.LeeCommentDTO;
import com.example.doum.domain.dto.lee.LeeFileDTO;
import com.example.doum.domain.dto.lee.LeeMyPageStoryDTO;
import com.example.doum.domain.dto.lee.UserReviewDTO;
import com.example.doum.domain.vo.StoryVO;
import com.example.doum.domain.vo.UserVO;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LeeMapper {

  //  void getDate();


    //마이페이지 유저 프로필 정보
   UserVO getUser(String userId);

     //마이페이지 유저가 작성한 게시물 목록 가져오기
     LeeMyPageStoryDTO getStories(String userId);


    //마이페이지 유저가 작성한 게시물 목록
    //List<LeeMyPageStoryDTO> getStories(String userId);

    //마이페이지 총 스토리 갯수
    //Long countStories();


    //마이페이지 속 스토리에 달린 댓글
    //List<LeeCommentDTO> getComments(String storyId);

    //다음 시퀀스 쿼리문



    //마이페이지 게시물에 달린 공감 수
    //Long getLikes(String storyId);

    //마이페이지 유저가 받은 리뷰 가져오기
    //List<UserReviewDTO> getReviews(String userId);

    //마이페이지 스토리 상세보기
  //  LeeMyPageStoryDTO getStoriesDetail(String storyId, String userId);

    //마이페이지 스토리 조회수 +1
  //  void plusView(String storyId);

    //마이페이지 스토리 수정
    //void updateStory(String storyId, String title,String content);

    //마이페이지 스토리 삭제
    //void deleteStory(String storyId);













}
