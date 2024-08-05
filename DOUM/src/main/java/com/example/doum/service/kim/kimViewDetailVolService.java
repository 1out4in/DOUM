package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.kimViewDetailVolDTO;
import org.springframework.stereotype.Service;

@Service
public interface kimViewDetailVolService {

    kimViewDetailVolDTO selectViewDetailVol(long organizationId);
}
