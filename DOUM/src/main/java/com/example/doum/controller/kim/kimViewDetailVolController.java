package com.example.doum.controller.kim;

import com.example.doum.domain.dto.kim.kimViewDetailVolDTO;
import com.example.doum.service.kim.kimViewDetailVolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/DetailVol")
@RequiredArgsConstructor
public class kimViewDetailVolController {

    private final kimViewDetailVolService kimViewDetailVolService;

    @GetMapping("/Vol/{organizationId}")
    public String vol(@PathVariable long organizationId, Model model) {
        kimViewDetailVolDTO viewDetail = kimViewDetailVolService.selectViewDetailVol(organizationId);
        model.addAttribute("viewDetail", viewDetail);
        return "kim/viewDetail";
    }
}
