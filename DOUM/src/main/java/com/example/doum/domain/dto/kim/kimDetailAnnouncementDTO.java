package com.example.doum.domain.dto.kim;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class kimDetailAnnouncementDTO {

    private Long announcementId;
    private String title;
    private String content;
}
