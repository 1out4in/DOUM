package com.example.doum.controller.kim;

import com.example.doum.domain.dto.kim.kimRegistrationDTO;
import com.example.doum.service.kim.KimRegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("/Registration")
@RequiredArgsConstructor
public class kimRegistrationController {

    private final KimRegistrationService kimRegistrationService;

    // 봉사글 등록 폼으로 이동
    @GetMapping("/write")
    public String writeForm(Model model) {
        model.addAttribute("write", new kimRegistrationDTO());
        return "kim/registration";
    }

    // 봉사글 등록하기
    @PostMapping("/write")
    public String write(kimRegistrationDTO registration, @RequestParam("organizationId") long organizationId,
                        @RequestParam("file") List<MultipartFile> files) {

            registration.setOrganizationId(organizationId);
            kimRegistrationService.selectRegistration(registration, files);
        return "redirect:/kim/write" + registration.getOrganizationId();
    }

}
