package com.example.doum.domain.dto.kim;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Data
public class kimViewDetailVolDTO {

    // 제목
    private String title;
    // 봉사 모집일
    private LocalDate recruit_start_date;
    // 봉사 모집 종료일
    private LocalDate recruit_end_date;
    // 봉사 시작일
    private LocalDate volunteer_date;
    // 모집인원
    private long recruit_number;
    // 봉사자
    private long volunteer_id;
    // 주소
    private long location_id;
    // 기관
    private long organization_id;
    // 봉사 내용
    private String content;
    // 봉사 분야
    private String category;
    // 봉사 대상
    private String target;
    // 활동구분
    private long is_online;
    // 봉사자유형(성인)
    private long is_adult_allowed;
    // 봉사자유형(청소년)
    private long is_teen_allowed;
    //담당자 이름
    private String manager_name;
    //담당자 전화번호
    private String manager_phone_number;
}
