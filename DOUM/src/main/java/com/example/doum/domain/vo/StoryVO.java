package com.example.doum.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Getter
@ToString
@NoArgsConstructor
public class StoryVO {
    private Long storyId;
    private Long userId;
    private Long anonymousId;
    private Long appliedVolunteerId;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private Long views;

    @Builder
    public StoryVO(Long storyId, Long userId, Long anonymousId, Long appliedVolunteerId, String title, String content, LocalDateTime createdDate, Long views) {
        this.storyId = storyId;
        this.userId = userId;
        this.anonymousId = anonymousId;
        this.appliedVolunteerId = appliedVolunteerId;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.views = views;
    }
}

