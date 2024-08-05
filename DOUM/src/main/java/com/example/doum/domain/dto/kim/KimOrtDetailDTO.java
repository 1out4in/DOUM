package com.example.doum.domain.dto.kim;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class KimOrtDetailDTO {

    // pk
    private long organizationId;

    // 주소
    private long locationId;

    // 기관 이름
    private String name;

    // 담당자명
    private String managerName;

    // 담당자 전화번호
    private String managerPhoneNumber;

    // 이메일
    private String email;

    // 기관 전화번호
    private String phoneNumber;

}
