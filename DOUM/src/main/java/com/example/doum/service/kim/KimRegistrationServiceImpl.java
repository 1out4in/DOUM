package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.kimRegistrationDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KimRegistrationServiceImpl implements KimRegistrationService {


    private final com.example.doum.mapper.kim.kimMapper kimMapper;

    @Override
    @Transactional
    public void selectRegistration(kimRegistrationDTO registration, List<MultipartFile> files) {
        long organizationId = kimMapper.Edit();
        registration.setOrganization_id(organizationId);
        kimMapper.selectRegistration(registration);
    }
}
