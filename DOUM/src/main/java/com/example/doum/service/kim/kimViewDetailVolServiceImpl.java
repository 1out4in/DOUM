package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.kimViewDetailVolDTO;
import com.example.doum.mapper.kim.kimMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class kimViewDetailVolServiceImpl implements kimViewDetailVolService {

    private final kimMapper kimMapper;

    @Override
    @Transactional
    public kimViewDetailVolDTO selectViewDetailVol(long organizationId) {
        return kimMapper.selectViewDetailVol(organizationId);
    }
}
