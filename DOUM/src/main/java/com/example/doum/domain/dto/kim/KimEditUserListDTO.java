package com.example.doum.domain.dto.kim;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Data
public class KimEditUserListDTO {

    // pk 회원번호
    private long user_id;

    // ???
    private String provider_id;

    // 주소
    private long location_id;

    // 이름
    private String name;

    // 생일
    private LocalDate birth_date;

    // 성별
    private String gender;

    // 전화번호
    private String phone_number;

    // 이메일
    private String email;

    // 이메일 수신동의
    private long email_approve;
//
//    // 휴대전화 수신동의
    private long phone_approve;

    // 계정 생성일?
    private LocalDate register_date;
}
