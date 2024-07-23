//package com.example.doum.controller.lee;
//
//
//import com.example.doum.domain.dto.lee.LeeMyPageDTO;
//import com.example.doum.domain.dto.lee.LeeMyPageStoryDTO;
//import com.example.doum.mapper.lee.UsersMapper;
//import com.example.doum.service.lee.MyPageService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/myPage")
//@RequiredArgsConstructor
//public class MyPageController {
//
//
//    private final MyPageService myPageService;
//    private final UsersMapper usersMapper;
//
//
//
//    //게시물 작성 폼으로 이동
//    @GetMapping("/write")
//    public String writeForm(Model model) {
//
//        model.addAttribute("myPage",new LeeMyPageDTO());
//        return "mypage/write";
//
//    }
//
//
//    //게시물 작성 처리
//    @PostMapping("/write")
//    public String write(LeeMyPageDTO myPage, @RequestParam("providerId") String providerId, List<MultipartFile> files) {
//
//        myPage.setProviderId(providerId);
//
//        myPageService.saveStory(myPage,files);
//        return "redirect:/myPage/list";
//
//    }
//
//
//    //게시글 상세보기
//    @GetMapping("/story/{storyId}")
//    public String story(@PathVariable("storyId") Long storyId, Model model,
//                        @AuthenticationPrincipal CustomOAuth2User customOAuth2User) {
//
//        LeeMyPageStoryDTO story = myPageService.getStoryById(storyId, customOAuth2User);
//        List<FileDTO> files = fileService.getFileListByStoryId(storyId);
//
//        model.addAttribute("story",story);
//        model.addAttribute("files",files);
//
//        return "mypage/story";
//
//    }
//
//
//}
