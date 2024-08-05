package com.example.doum.domain.dto.kim;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class kimViewDetailVolDTO {

    // 제목
    private String title;

    // 봉사 모집일
    private LocalDateTime recruitStartDate;

    // 봉사 모집 종료일
    private LocalDateTime recruitEndDate;

    // 봉사 시작일
    private LocalDateTime volunteerDate;

    // 모집인원
    private Long recruitNumber;

    // 봉사자
    private Long volunteerId;

    // 주소
    private Long locationId;

    // 기관
    private Long organizationId;

    // 봉사 내용
    private String content;

    // 봉사 분야
    private String category;

    // 봉사 대상
    private String target;

    // 활동구분
    private Long isOnline;

    // 봉사자유형(성인)
    private Long isAdultAllowed;

    // 봉사자유형(청소년)
    private Long isTeenAllowed;

    // 오가니제이션 테이블에 있는 담당자 이름, 연락처
    //담당자 이름
    private String managerName;

    //담당자 전화번호
    private String managerPhoneNumber;
}
