package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.KimOrtDetailDTO;
import org.springframework.stereotype.Service;

@Service
public interface KimOrtDetailService {

    KimOrtDetailDTO getDetailById(long organizationId);
}
