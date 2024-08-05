package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.kimDetailAnonymousDTO;
import org.springframework.stereotype.Service;

@Service
public interface KimDetailAnonymousService {

    kimDetailAnonymousDTO detailAnonymous(Long anonymousId);
}
