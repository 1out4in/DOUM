package com.example.doum.service.won;

import com.example.doum.domain.dto.won.WonJoinOrgDTO;
import com.example.doum.mapper.won.WonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WonServiceImpl implements WonService {

    private final WonMapper wonMapper;


    @Override
    public void signUp(WonJoinOrgDTO joinOrgDTO) {

    }
}


