package com.example.doum.mapper.kim;

import com.example.doum.domain.dto.kim.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface kimMapper {

    // 공지사항 상세보기

    kimDetailAnnouncementDTO selectDetailAnnouncement(Long announcementId);

    // 기관 상세보기
    KimOrtDetailDTO selectOrtDetail(long organizationId);

    // 기관 상세보기 리뷰 모달


    // 기관 정보 수정
//    void updateEditOrtList(OrganizationVO organizationVO);
    KimEditOrtListDTO updateEditOrtList(long organizationId);

    // 유저 정보 수정
    KimEditUserListDTO updateEditUserList(long userId);
//    void updateEditUserList(UserVO userVO);

    // 봉사글 등록하려는 기관 페이지
    long Edit();

    // 봉사글 등록하기 페이지
    void selectRegistration(kimRegistrationDTO registration);

    // 봉사글 상세보기
    kimViewDetailVolDTO selectViewDetailVol(long organizationId);

    // 익명 게시판 상세보기
    kimDetailAnonymousDTO selectDetailAnonymous(Long anonymousId);

}
