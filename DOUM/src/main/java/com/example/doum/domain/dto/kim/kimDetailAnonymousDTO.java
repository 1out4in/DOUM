package com.example.doum.domain.dto.kim;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class kimDetailAnonymousDTO {

    private Long anonymousId;
    private Long userId;
    private Long views;
    private String title;
    private String content;
    private LocalDateTime createdDate;

}
