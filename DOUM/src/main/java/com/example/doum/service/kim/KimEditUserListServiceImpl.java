package com.example.doum.service.kim;

import com.example.doum.domain.dto.kim.KimEditUserListDTO;
import com.example.doum.mapper.kim.kimMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KimEditUserListServiceImpl implements KimEditUserListService {

    private final kimMapper kimMapper;

//        화면에 띄우는 목적
    @Override
    public KimEditUserListDTO updateUserList(long userId) {
        return kimMapper.updateEditUserList(userId);
    }
//    private final kimMapper kimMapper;
//
//    @Override
//    public void updateEditUserList(KimEditUserListDTO editUserList) {
//        kimMapper.updateEditUserList(UserVO.toEntity(editUserList));
//    }

    // 유저 프로필 페이지가 필요함. (내가 만들수 있는 선까지 만들예정이지만, 내가 만드는게 맞는지 모름;;)
}
