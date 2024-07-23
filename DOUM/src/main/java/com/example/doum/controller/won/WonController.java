package com.example.doum.controller.won;


import com.example.doum.domain.dto.won.WonJoinOrgDTO;
import com.example.doum.service.won.WonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Won")
@RequiredArgsConstructor

public class WonController {

    private final WonService wonService;

    @GetMapping("/org_join")
    public String join() {

        return "won/org_join1";

    }


    @PostMapping("/save")
    public String save(@ModelAttribute WonJoinOrgDTO wonJoinOrgDTO) {
       return "won/org_join1";
    }

    @GetMapping("/guest_main")
    public String guestMain() {
        return "won/guest_main";
    }






}




