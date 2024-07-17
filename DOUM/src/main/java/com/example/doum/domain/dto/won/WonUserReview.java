package com.example.doum.domain.dto.won;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class WonUserReview {
    //유저리뷰 테이블  기관이 유저리뷰를 작성하는
    private Long userReviewId;
    private  Long userId;
    private Long organizationId;
    private String  content;

}

