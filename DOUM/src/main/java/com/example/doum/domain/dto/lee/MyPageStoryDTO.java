package com.example.doum.domain.dto.lee;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class MyPageStoryDTO {

    //개인 스토리 (마이 페이지 속 봉사 게시물)
    //그니까 마이페이지의 디테일.


    //pk
    private Long storyId;
    //작성자 .. providerID?
    private String userId;
    //게시물 제목
    private String title;
    //게시물 내용
    private String content;
    //게시물의 조회수
    private int view;
    //게시물 작성한 날짜
    private LocalDateTime storyRegisterDate;
    //게시물 수정 날짜
    private LocalDateTime storyUpdateDate;
    //첨부파일 갯수
    private int fileCount;
    // 게시물 좋아요 수
    private int like;
    // 게시물 지원한 봉사자의 아이디(위의 userId랑 같은건가?)
    private String appliedVolunteerId;




}
