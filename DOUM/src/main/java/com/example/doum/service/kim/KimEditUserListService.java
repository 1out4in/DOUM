package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.KimEditUserListDTO;
import org.springframework.stereotype.Service;

@Service
public interface KimEditUserListService {
//    void updateEditUserList(KimEditUserListDTO editUserList);

    // 화면에 띄우는 목적
    KimEditUserListDTO updateUserList(long userId);
}
