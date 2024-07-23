package com.example.doum.service.lee;


import com.example.doum.domain.dto.lee.*;
import com.example.doum.domain.vo.StoryCommentVO;
import com.example.doum.domain.vo.StoryImageVO;
import com.example.doum.domain.vo.StoryVO;
import com.example.doum.domain.vo.UserVO;
import com.example.doum.mapper.lee.LeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LeeServiceImpl implements LeeService {


    private final StoryImageVO storyImageVO;
    private final StoryCommentVO storyCommentVO;
    private final StoryVO storyVO;


    @Autowired
    private LeeMapper leeMapper;


    @Override
    public LeeUsersDTO getUserById(Long userId) {
        return leeMapper.getUser(userId);
    }

    @Override
    public List<LeeMyPageStoryDTO> getStoriesByUserId(Long userId) {
        return leeMapper.getStories(userId);
    }

    @Override
    public int getMyPageStoriesCount() {
        return leeMapper.countMyPageStories();
    }





    @Override
    @Transactional // 해당 메소드를 하나의 트랜잭션으로 묶는다. ㅇㅇ
    public void saveStory(LeeMyPageStoryDTO myPageStory, List<MultipartFile> files) {

        Long storyId = leeMapper.getSeq();
        myPageStory.setStoryId(storyId);
        leeMapper.saveStory(myPageStory); // 스토리 정보 저장

        saveFile(storyId, files);


    }

    //마이 페이지 스토리 삭제 ㅇㅇ
    @Override
    public void deleteStory(Long storyId) {
        leeMapper.deleteStory(storyId);
    }

    @Override
    public void updateStory(LeeMyPageStoryDTO story, List<MultipartFile> files) {
        leeMapper.updateStory(StoryVO.toEntity(story));
        leeMapper.deleteStory(story.getStoryId());

        saveFile(story.getStoryId(), files);
    }


    //마이 페이지 스토리 이미지 저장
    @Override
    public void saveFile(Long storyId, List<MultipartFile> files) {
        // 현재 날짜를 기반으로 폴더 경로 생성
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String datePath = now.format(formatter);

        for (MultipartFile file : files) {
            // 방어코드
            if (file.isEmpty()) continue; // 파일이 비어있으면 건너뜀

            String originalFileName = file.getOriginalFilename();
            String storedFileName = UUID.randomUUID().toString().replaceAll("-", "") + "_" + originalFileName;
            Long fileSize = file.getSize();

            try {
                // 파일 저장 경로 설정
                Path directoryPath = Paths.get("C:/upload/" + datePath);
                if (!Files.exists(directoryPath)) {
                    Files.createDirectories(directoryPath); // 폴더가 없으면 생성
                }
                Path filePath = directoryPath.resolve(storedFileName);
                // 파일 저장
                Files.copy(file.getInputStream(), filePath);

                LeeStoryImageDTO storyImageDTO = new LeeStoryImageDTO();
                //storyImageDTO.setStoryImgId(storyImgId);
                storyImageDTO.setStoryId(storyId);
                storyImageDTO.setFileLocation(directoryPath + "/" + storedFileName);


                leeMapper.insertFile(storyImageVO.toEntity(storyImageDTO)); // 파일 정보 저장
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    @Transactional
    public LeeMyPageStoryDTO getStoryById(Long storyId) {
        LeeMyPageStoryDTO story = leeMapper.selectMyPageStory(storyId);

        //조회수 상승 결정할 if 추가해야함 customOAuth2User 추가 후
    return leeMapper.selectMyPageStory(storyId);
//        return story;
    }

    @Override
    public List<LeeStoryImageDTO> getStoryImgListByStoryId(Long storyId) {

            return leeMapper.selectStoryImgList(storyId);

    }

    @Override
    public List<LeeStoryImageDTO> getStoryImgById(Long storyId) {
        return leeMapper.selectStoryImgList(storyId);
    }

    @Override
    public List<LeeCommentListDTO> getCommentById(Long storyId) {
        return leeMapper.selectCommentById(storyId);
    }

    @Override
    public void saveStoryComment(LeeCommentDTO leeCommentDTO) {
        leeMapper.insertStoryComment(storyCommentVO.toEntity(leeCommentDTO));
    }

    @Override
    public void deleteStoryComment(Long storyCommentId) {
        leeMapper.deleteStoryComment(storyCommentId);

    }


    @Override
    public void updateStoryComment(LeeCommentDTO leeCommentDTO) {
        leeMapper.updateStoryComment(storyCommentVO.toEntity(leeCommentDTO));
    }

//    @Override
//    public void updateProfilePic(Long userId, MultipartFile profilePic) {
//
//    }


}