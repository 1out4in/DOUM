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
public class StoryCommentVO {
    private Long storyCommentId;
    private Long storyId;
    private Long userId;
    private String content;
    private LocalDateTime createdDate;

    @Builder
    public StoryCommentVO(Long storyCommentId, Long storyId, Long userId, String content, LocalDateTime createdDate) {
        this.storyCommentId = storyCommentId;
        this.storyId = storyId;
        this.userId = userId;
        this.content = content;
        this.createdDate = createdDate;
    }
}

