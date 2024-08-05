package com.example.doum.controller.kim;

import com.example.doum.domain.dto.kim.kimDetailAnnouncementDTO;
import com.example.doum.service.kim.kimDetailAnnoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/DetailAnno")
@RequiredArgsConstructor
public class kimDetailAnnouncementController {

    private final kimDetailAnnoService kimDetailAnnoService;

    @GetMapping("/anno/{announcementId}")
    public String anno(@PathVariable Long announcementId, Model model) {
        kimDetailAnnouncementDTO detailAnno = kimDetailAnnoService.detailAnno(announcementId);

        model.addAttribute("anno", detailAnno);
        return "kim/announcement";
    }
}
