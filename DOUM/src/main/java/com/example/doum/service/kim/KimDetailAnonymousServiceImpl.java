package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.kimDetailAnonymousDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class KimDetailAnonymousServiceImpl implements KimDetailAnonymousService {


    private final com.example.doum.mapper.kim.kimMapper kimMapper;

    @Override
    @Transactional
    public kimDetailAnonymousDTO detailAnonymous(Long anonymousId) {
        return kimMapper.selectDetailAnonymous(anonymousId);

    }
}
