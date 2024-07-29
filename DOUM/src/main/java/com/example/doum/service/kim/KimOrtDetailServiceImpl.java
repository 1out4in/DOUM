package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.KimOrtDetailDTO;
import com.example.doum.mapper.kim.kimMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class KimOrtDetailServiceImpl implements KimOrtDetailService {

    private final kimMapper kimMapper;

    @Override
    @Transactional
    public KimOrtDetailDTO getDetailById(long organizationId) {

        return kimMapper.selectOrtDetail(organizationId);
    }
}
