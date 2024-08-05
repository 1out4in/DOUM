package com.example.doum.domain.dto.kim;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class KimEditUserListDTO {

    // pk 회원번호
    private long userId;

    // 주소
    private String locationId;

    // 상세 주소
    private String addressDetail;

    // 이름
    private String name;

    // 생일
    private LocalDateTime birthDate;

    // 전화번호
    private String phoneNumber;

    // 이메일
    private String email;

    // 이메일 수신동의
    private long emailApprove;
//
//    // 휴대전화 수신동의
    private long phoneApprove;

    // 계정 생성일?
    private LocalDateTime registerDate;
}
