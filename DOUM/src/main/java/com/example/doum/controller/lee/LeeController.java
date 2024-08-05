package com.example.doum.controller.lee;


import com.example.doum.domain.dto.lee.*;
import com.example.doum.domain.vo.UserVO;
import com.example.doum.mapper.lee.LeeMapper;
import com.example.doum.service.lee.LeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;



@Controller
@RequestMapping("/Lee")
@RequiredArgsConstructor
public class LeeController {


    private final LeeService leeService;
   // private final FileService fileService;

   private final LeeMapper leeMapper;
    private final UserVO userVO;
//마이페이지 띄우기 ㅇㅇ
    @GetMapping("/myPage/{userId}")
    public String myPage(@PathVariable long userId, Model model) {
        boolean flag = false;
        LeeUsersDTO user= leeService.getUserById(userId);
        //게시물 리스트가 필요함
        List<LeeMyPageStoryDTO> stories = leeService.getStoriesByUserId(userId);
//        List<LeeStoryImageDTO> storyImg = leeService.getStoryImgListByStoryId(userId);

        for (LeeMyPageStoryDTO story : stories){
            Long storyId = story.getStoryId();
            List<LeeStoryImageDTO> imgs = leeService.getStoryImgListByStoryId(storyId);

            if(!imgs.isEmpty()) {
                LeeStoryImageDTO dto = imgs.get(0);
                story.setFileLocation(dto.getFileLocation());
            }
            else {
                LeeStoryImageDTO dto = new LeeStoryImageDTO();
                dto.setStoryId(storyId);
            }
        }

        model.addAttribute("user", user);
        model.addAttribute("stories", stories);

        return "lee/myPage";
    }



    @GetMapping("/searchUser/{userId}")
    public String searchUser(@PathVariable long userId, Model model) {
        LeeUsersDTO user= leeService.getUserById(userId);
        // 유저들 리스트가 필요
//        List<LeeUsersDTO> users = leeService.getUsersById(userId);
        List<LeeUsersDTO> users = leeService.getAllUsers();
        model.addAttribute("user", user);
        model.addAttribute("users", users);
        return "lee/searchUser";

    }

    @GetMapping("/search")
    public String search(@RequestParam("search") String search,
                         @RequestParam("userId") long userId, Model model) {
        LeeUsersDTO user= leeService.getUserById(userId);
        // 검색어로 사용자 목록을 검색
        List<LeeUsersDTO> users = leeService.searchUsers(search);

        // 모델에 결과 추가
        model.addAttribute("user", user);
        model.addAttribute("users", users);
        model.addAttribute("search", search);

        // 검색 결과를 보여줄 뷰로 이동
        return "lee/searchUser";
    }










    //스토리 띄우는거 이거 맞음 잠깐 주석
    @GetMapping("/story/{storyId}")
    public String story(@PathVariable("storyId") long storyId, Model model) {
        LeeMyPageStoryDTO story = leeService.getStoryById(storyId);
        List<LeeCommentListDTO> comments = leeService.getCommentById(storyId);
        List<LeeStoryImageDTO> storyImg = leeService.getStoryImgById(storyId);
//        스토리 좋아요
        LeeStoryLikeDTO like = leeService.plusStoryLike(storyId);



        model.addAttribute("story", story);
        model.addAttribute("comments", comments);
        model.addAttribute("storyImg", storyImg);
        model.addAttribute("like", like);
        return "lee/story";

    }




//마이페이지 프로필 수정
// LeeController.java

    @PostMapping("/updateProfilePic")
    public String updateProfilePic(@RequestParam("profilePic") MultipartFile profilePic, @RequestParam("userId") Long userId) {
        leeService.updateProfilePic(userId, profilePic);
        return "redirect:/Lee/myPage/" + userId;
    }

//마이페이지 자기소개글 수정

    @PostMapping("/updateIntroduction")
    public String updateIntroduction(@RequestParam("introduction") String introduction, @RequestParam("userId") Long userId) {
        leeService.updateIntroduction(userId, introduction);
        return "redirect:/Lee/myPage/" + userId;
    }

//    마이페이지 리뷰 상세보기
@GetMapping("/reviews")
@ResponseBody
public List<LeeOrgReviewDTO> getReviewsForUser(@RequestParam Long userId) {
    return leeService.getReviewsForUser(userId);
}









    @GetMapping("/writingStoryT/{userId}")
    public String writingStory(@PathVariable Long userId,Model model) {
//        System.out.println("writingStory 메소드가 호출되었습니다.");
//        model.addAttribute("userId", userId);
        model.addAttribute("story", new LeeMyPageStoryDTO());
        return "lee/writingStoryT";
    }






    @PostMapping("/writingStoryT")
    public String write(LeeMyPageStoryDTO story,
                        List<MultipartFile> files) {

//        story.setUserId(userId);
        Long userId = 1L; // 로그인 구현 시 현재 로그인 되어있는 객체에서 가져오기
        story.setUserId(userId);
        story.setAppliedVolunteerId(1L);
        leeService.saveStory(story,files);
//        return "redirect:/Lee/myPage/" + userId;
//        return "redirect:/Lee/story/" + story.getStoryId();
//        return "redirect:/Lee/myPage/" + story.getStoryId();
        return "redirect:/Lee/myPage/" + userId;



//        return "redirect:/lee/myPage";
//        return "redirect:/Lee/story/"+story.getStoryId();

    }






//스토리 작성 처리 로그인 처리 하고나서야 가능해질듯 ---? ? ?
//    @PostMapping("/writingStoryT")
//    public String write(LeeMyPageStoryDTO story,@RequestParam("userId") Long userId,
//                        @RequestParam("attachment") List<MultipartFile> files) {
//
//        story.setUserId(userId);
//        leeService.saveStory(story,files);
//        return "redirect:/lee/myPage";
//    }















    @GetMapping("/editStory/{storyId}")
    public String editStory(@PathVariable Long storyId,Model model){
        LeeMyPageStoryDTO story = leeService.getStoryById(storyId);

        List<LeeStoryImageDTO> images = leeService.getStoryImgListByStoryId(storyId);
        model.addAttribute("story", story);
        model.addAttribute("images", images);


        return "lee/editStory";
    }


    @PostMapping("/editStory")
    public String editStory(LeeMyPageStoryDTO story,List<MultipartFile> files){
        System.out.println("들어옴");
        leeService.updateStory(story,files);

        return "redirect:/Lee/story/"+story.getStoryId();
//        return "redirect:/Lee/story/"+story.getStoryId();

    }



    @PostMapping("/delete/{storyId}")
    public String deleteStory(@PathVariable Long storyId) {
        Long userId = leeService.getStoryById(storyId).getUserId();
        leeService.deleteStory(storyId);
        return "redirect:/Lee/myPage/" + userId;


    }





    //스토리 수정
//    @PostMapping("/editStory")
//    public String editStory(LeeMyPageStoryDTO story, List<MultipartFile> files) {
//        leeService.updateStory(story , files);
//
//        return "redirect:/lee/myPage-user" + story.getUserId();
//    }



    //마이페이지 스토리 삭제
//    @PostMapping("/delete/{storyId}")
//    public String delete(@PathVariable Long storyId) {
//        leeService.deleteStory(storyId);
//        return "redirect:/lee/myPage-user";
//    }











}
