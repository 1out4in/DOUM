package com.example.doum.controller.kim;

import com.example.doum.domain.dto.kim.kimDetailAnonymousDTO;
import com.example.doum.service.kim.KimDetailAnonymousService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/DetailAnonymous")
@RequiredArgsConstructor
public class kimDetailAnonymousController {

    private final KimDetailAnonymousService kimDetailAnonymousService;

    @GetMapping("/anonymous/{anonymousId}")
    public String anonymous(@PathVariable Long anonymousId, Model model) {
        kimDetailAnonymousDTO anonymous = kimDetailAnonymousService.detailAnonymous(anonymousId);

        System.out.println(anonymous);

        model.addAttribute("anonymous", anonymous);
        return "kim/unknownViewDetail";
    }

}
