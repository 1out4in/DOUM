package com.example.doum.controller.kim;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Registration")
@RequiredArgsConstructor
public class kimRegistrationController {

//    private final KimRegistrationService kimRegistrationService;
//
//
//    @GetMapping("/insert/{organizationId}")
//    public String insert(@PathVariable long organizationId, Model model) {
//        kimRegistrationDTO insertVol = kimRegistrationService.getVolById(organizationId);
//        model.addAttribute("insertVol", insertVol);
//        return "kim/registration";
//    }
}
