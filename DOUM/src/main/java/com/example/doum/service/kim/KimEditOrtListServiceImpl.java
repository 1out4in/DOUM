package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.KimEditOrtListDTO;
import com.example.doum.mapper.kim.kimMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KimEditOrtListServiceImpl implements KimEditOrtListService{


    private final kimMapper kimMapper;

//    @Override
//    public void updateEditOrtList(KimEditOrtListDTO editOrtList) {
//
//    }

    @Override
    public KimEditOrtListDTO updateOrtList(long organizationId) {
        return kimMapper.updateEditOrtList(organizationId);
    }

//    private final kimMapper kimMapper;
//
//    @Override
//    public void updateEditOrtList(KimEditOrtListDTO editOrtList) {
//        kimMapper.updateEditOrtList(OrganizationVO.toEntity(editOrtList));
//    }

    // 기관 정보를 수정할때 가지고 갈 기관 정보가 필요함.
    // 내가 가지고 있는 기관 상세보기는 봉사를 신청할때 기관 상세보기에 있는 목록이라
    // 유저 프로필 처럼 기관 프로필이 필요하다고 생각됨.
//    @Override
//    public void 서비스 이름(Long organizationId)
}
