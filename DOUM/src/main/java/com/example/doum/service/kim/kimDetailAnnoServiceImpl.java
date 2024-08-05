package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.kimDetailAnnouncementDTO;
import com.example.doum.mapper.kim.kimMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class kimDetailAnnoServiceImpl implements kimDetailAnnoService{


    private final kimMapper kimMapper;

    @Override
    @Transactional
    public kimDetailAnnouncementDTO detailAnno(Long announcementId) {

        return kimMapper.selectDetailAnnouncement(announcementId);
    }
}
