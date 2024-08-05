package com.example.doum.controller.kim;

import com.example.doum.domain.dto.kim.KimEditOrtListDTO;
import com.example.doum.domain.dto.kim.KimOrtDetailDTO;
import com.example.doum.service.kim.KimOrtDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/OrtDetail")
@RequiredArgsConstructor
public class kimController {

    private final KimOrtDetailService kimOrtDetailService;

    // 기관 상세보기
    @GetMapping("/detail/{organizationId}")
    public String detail(@PathVariable long organizationId, Model model) {
        KimOrtDetailDTO ortDetail = kimOrtDetailService.getDetailById(organizationId);
        model.addAttribute("detail", ortDetail);
        return "kim/agencyDetail";
    }

    // --------------------------------------------------------

//     기관 정보 수정
//    @GetMapping("/edit/{organizationId}")
//    public String edit(@PathVariable Long organizationId, Model model) {
//        model.addAttribute("kimEditOrtList", kimEditOrtListService.updateEditOrtList(organizationId));
//        return "kim/editAgencyList";
//    }
//


    // --------------------------------------------------------





//    // 유저 정보 수정, 기관 정보 수정과 같이 기관 프로필, 유저 프로필이 없어 현재 제작불가
//        @GetMapping("/edit/{userId}")
//        public String edit(@PathVariable Long userId, Model model) {
//            model.addAttribute("updateEditUserList", KimEditUserListService.updateEditUserList(userId));
//            return "kim/editMyList";
//        }
//        @PostMapping("/edit")
//        public String edit(KimEditUserListDTO updateEditUserList, @RequestParam("updateUserList") {
//            KimEditUserListService.updateEditUserList(userId);
//            return "redirect:/"
//        }

    // --------------------------------------------------------

//    // 봉사글 등록하기
//    @GetMapping("/Registration/{volunteerId}")
//    public String registration(@PathVariable("volunteerId") Long volunteerId, Model model) {
//        return "kim/registration";
//    }

    // --------------------------------------------------------

//    // 봉사글 상세보기
//    @GetMapping("/ViewDetail/{volunteerId}")
//    public String viewDetail(@PathVariable("volunteerId") Long volunteerId, Model model) {
//        return "kim/viewDetail";
//    }

    // --------------------------------------------------------

//    // 익명게시판 상세보기
//    @GetMapping("/Anonymous/{anonymousId}")
//    public String anonymous(@PathVariable("anonymousId") Long anonymousId, Model model) {
//        return "kim/anonymous";
//    }

    // --------------------------------------------------------

//    // 공지사항 상세보기
//    @GetMapping("/announcement/{announcementId}")
//    public String announcement(@PathVariable("announcementId") Long announcementId, Model model) {
//        return "kim/announcement";
//    }
}
