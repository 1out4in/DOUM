package com.example.doum.domain.dto.won;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class WonUesrJoinDTO {

//    유저 테이블
    private Long userId;
    private Long locationId;
    private  String email;
    private String password;
    private  String name;
    private String phoneNumber;
    private LocalDateTime registerDate;
    private Long emailApprove;
    private Long phoneApprove;

    private LocalDateTime birthDate;
    private String gender;
    private String introduction;

    private String providerId;
    private String provider;
    private String role;


}
