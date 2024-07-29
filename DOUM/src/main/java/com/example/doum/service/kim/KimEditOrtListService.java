package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.KimEditOrtListDTO;
import org.springframework.stereotype.Service;

@Service
public interface KimEditOrtListService {

    // 기관 정보를 수정할때 가지고 updateOrtList 갈 기관 정보가 필요함.
    // 내가 가지고 있는 기관 상세보기는 봉사를 신청할때 기관 상세보기에 있는 목록이라
    // 유저 프로필 처럼 기관 프로필이 필요하다고 생각됨.

    // DTO selectUpdateOrt (Long organizationId)

//    void updateEditOrtList(KimEditOrtListDTO editOrtList);

    KimEditOrtListDTO updateOrtList(long organizationId);
}
