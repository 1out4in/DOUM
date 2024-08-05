package com.example.doum.controller.kim;

import com.example.doum.domain.dto.kim.KimEditOrtListDTO;
import com.example.doum.service.kim.KimEditOrtListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Update")
@RequiredArgsConstructor
public class kimUpdateController {

    private final KimEditOrtListService kimEditOrtListService;

    // 기관 정보 수정 (화면에 띄우는 목적)
    @GetMapping("/update/{organizationId}")
    public String update(@PathVariable long organizationId, Model model) {
        KimEditOrtListDTO updateOrtList = kimEditOrtListService.updateOrtList(organizationId);
        System.out.println(updateOrtList);
        model.addAttribute("updateOrtList", updateOrtList);
        return "kim/editAgencyList";
    }

//    @PostMapping("/edit")
//    public String edit(KimEditOrtListDTO editOrtList, @RequestParam("editOrtList")) {
//        KimEditOrtListService.updateEditOrtList(editOrtList);
//        return "redirect:/OrtDetail/detail/" + editOrtList.getOrganizationId();
//    }
}
