package com.example.doum.domain.dto.won;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class WonAnontmousDTO {
    private Long anonymous;
    private Long userId;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private Long views;



}
