package com.example.doum.controller.kim;

import com.example.doum.domain.dto.kim.KimEditOrtListDTO;
import com.example.doum.service.kim.KimEditOrtListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Update")
@RequiredArgsConstructor
public class kimUpdateController {

    private final KimEditOrtListService kimEditOrtListService;

    // 기관 정보 수정 (화면에 띄우는 목적)
    @GetMapping("/update/{organizationId}")
    public String update(@PathVariable long organizationId, Model model) {
        KimEditOrtListDTO updateOrtList = kimEditOrtListService.updateOrtList(organizationId);
        model.addAttribute("updateOrtList", updateOrtList);
        return "kim/editAgencyList";
    }
}
