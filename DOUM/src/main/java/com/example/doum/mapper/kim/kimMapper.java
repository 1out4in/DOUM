package com.example.doum.mapper.kim;

import com.example.doum.domain.dto.kim.KimEditOrtListDTO;
import com.example.doum.domain.dto.kim.KimEditUserListDTO;
import com.example.doum.domain.dto.kim.KimOrtDetailDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface kimMapper {

    // 공지사항 상세보기

    // 기관 상세보기
    KimOrtDetailDTO selectOrtDetail(long organizationId);

    // 기관 상세보기 리뷰 모달


    // 기관 정보 수정
//    void updateEditOrtList(OrganizationVO organizationVO);
    KimEditOrtListDTO updateEditOrtList(long organizationId);

    // 유저 정보 수정
    KimEditUserListDTO updateEditUserList(long userId);
//    void updateEditUserList(UserVO userVO);

    // 봉사글 등록하기
//    kimRegistrationDTO insertVol(long organizationId);

    // 봉사글 상세보기

    // 익명 게시판 상세보기

}
