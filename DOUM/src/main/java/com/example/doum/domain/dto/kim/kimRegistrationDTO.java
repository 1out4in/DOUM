package com.example.doum.domain.dto.kim;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class kimRegistrationDTO {

    // pk
    private long organizationId;

    // 주소
    private long locationId;

    // 제목
    private String title;

    // 내용
    private String content;

    // 모집일
    private LocalDateTime recruitStartDate;

    // 종료일
    private LocalDateTime recruitEndDate;

    // 모집인원
    private long recruitNumber;

    // 봉사시작일
    private LocalDateTime volunteerDate;

    // 봉사 분류
    private String category;

    // 담당자 이름
    private String managerName;

    // 담당자 연락처
    private String managerPhoneNumber;

    // 나이 (성인)
    private long isAdultAllowed;

    // 나이(청소년)
    private long isTeenAllowed;

    // 첨부파일
    private String fileLocation;

}
