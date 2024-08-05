package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.kimDetailAnnouncementDTO;
import org.springframework.stereotype.Service;

@Service
public interface kimDetailAnnoService {

    kimDetailAnnouncementDTO detailAnno(Long announcementId);
}
