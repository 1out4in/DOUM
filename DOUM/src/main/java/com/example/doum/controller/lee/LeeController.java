package com.example.doum.controller.lee;


import com.example.doum.domain.dto.lee.LeeMyPageDTO;
import com.example.doum.domain.dto.lee.LeeMyPageStoryDTO;
import com.example.doum.service.lee.LeeService;
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
@RequestMapping("/Lee")
@RequiredArgsConstructor
public class LeeController {

    //마이페이지

    //마이페이지 스토리 작성 폼으로 이동
    @GetMapping("/writingStory")
    public String writingStory(Model model) {
        model.addAttribute("story", new LeeMyPageStoryDTO());
        return "myPage/writingStory";
    }
    //스토리 작성 처리
    @PostMapping("writingStory")
    public String write(LeeMyPageDTO myPage, @RequestParam("userId") String userId,
                        List<MultipartFile> files) {
        myPage.setUserId(userId);
       // LeeService.saveStory(story,files);
        return "redirect:/lee/myPage-user";
    }




}
