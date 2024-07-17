package com.example.doum.domain.dto.won;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class WonOrganizationReview {
//    기관리뷰 테이블 유저가 기관을 리뷰하는

    private Long organizationReviewId;
    private Long organizationId;
    private Long userId; ;
    private String content;
    private Long rating;


}