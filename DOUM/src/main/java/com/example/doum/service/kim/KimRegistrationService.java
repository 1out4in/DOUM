package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.kimRegistrationDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface KimRegistrationService {

    void selectRegistration(kimRegistrationDTO registration, List<MultipartFile> files);
}
