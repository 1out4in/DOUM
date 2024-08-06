package com.example.doum.service.won;

import com.example.doum.domain.dto.won.WonVolunteerDTO;
import com.example.doum.mapper.won.VolunteerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VolunteerServiceImpl implements VolunteerService {

    private final VolunteerMapper volunteerMapper;


    @Override
    public List<WonVolunteerDTO> getVolunteerTitles() {
        return volunteerMapper.selectVolunteerTitles();
    }
}
