package com.example.doum.domain.dto.kim;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Data
public class kimRegistrationDTO {

    // pk
    private long organization_id;

    // 주소
    private long location_id;

    // 제목
    private String title;

    // 내용
    private String content;

    // 모집일
    private LocalDate recruit_start_date;

    // 종료일
    private LocalDate recruit_end_date;

    // 모집인원
    private long recruit_number;

    // 봉사시작일
    private LocalDate volunteer_date;

    // 봉사 분류
    private String category;

    // 담당자 이름
    private String manager_name;

    // 담당자 연락처
    private String manager_phone_number;

    // 나이 (성인)
    private long is_adult_allowed;

    // 나이(청소년)
    private long is_teen_allowed;

    // 첨부파일
    private String file_location;

}
