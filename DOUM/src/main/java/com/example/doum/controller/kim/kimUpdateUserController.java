package com.example.doum.controller.kim;

import com.example.doum.domain.dto.kim.KimEditUserListDTO;
import com.example.doum.service.kim.KimEditUserListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/UpdateUser")
@RequiredArgsConstructor
public class kimUpdateUserController {

    private final KimEditUserListService kimEditUserListService;

    // 유저 정보 수정(화면에 띄우는 목적)
    @GetMapping("/User/{userId}")
    public String update(@PathVariable long userId, Model model) {
        KimEditUserListDTO updateUserList = kimEditUserListService.updateUserList(userId);
        model.addAttribute("updateUserList", updateUserList);
        return "kim/editMyList";
    }
}
