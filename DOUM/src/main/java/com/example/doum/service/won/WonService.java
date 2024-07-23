package com.example.doum.service.won;

import com.example.doum.domain.dto.won.WonJoinOrgDTO;
import org.springframework.stereotype.Service;

@Service
public interface WonService {

    void signUp(WonJoinOrgDTO joinOrgDTO);

}
