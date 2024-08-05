package com.example.doum.domain.dto.kim;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class KimEditOrtListDTO {

    // PK 회원 아이디
    private Long organizationId;

    // 주소
    private Long locationId;

    // 기관 이름
    private String name;

    // 회원번호?
    private String providerId;

    // 이메일
    private String email;

    // 휴대전화 번호 (원래는 대표 전화번호이지만 대표자를 없애면서 휴대전화 번호 정보가 남아 담당자 연락처로 대체함.)
    private String managerPhoneNumber;

    // 유선전화
    private String phoneNumber;

////     이메일 수신 동의
    private long emailApprove;
//
//     휴대전화 수신 동의
    private long phoneApprove;

    // 계정 생성일?
    private LocalDateTime registerDate;

}
