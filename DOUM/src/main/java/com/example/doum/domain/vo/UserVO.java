//package com.example.doum.domain.vo;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//import org.springframework.stereotype.Component;
//
//@Component
//@Getter
//@ToString
//@NoArgsConstructor
//public class UserVO {
////    private Long userId;
////    private Long locationId;
////    private String email;
////    private String password;
////    private String name;
////    private String phoneNumber;
////    private LocalDateTime registerDate;
////    private Long emailApprove;
////    private Long phoneApprove;
////    private LocalDateTime birthDate;
////    private String gender;
////    private String introduction;
////    private String providerId;
////    private String provider;
////    private String role;
////
////    @Builder
////    public UserVO(Long userId, Long locationId, String email, String password, String name, String phoneNumber, LocalDateTime registerDate,
////                Long emailApprove, Long phoneApprove, LocalDateTime birthDate, String gender, String introduction, String providerId,
////                String provider, String role) {
////        this.userId = userId;
////        this.locationId = locationId;
////        this.email = email;
////        this.password = password;
////        this.name = name;
////        this.phoneNumber = phoneNumber;
////        this.registerDate = registerDate;
////        this.emailApprove = emailApprove;
////        this.phoneApprove = phoneApprove;
////        this.birthDate = birthDate;
////        this.gender = gender;
////        this.introduction = introduction;
////        this.providerId = providerId;
////        this.provider = provider;
////        this.role = role;
////    }
//// 내가 한 분분
////    private Long userId;
////    private String providerId;
////    private Long locationId;
////    private String name;
////    private LocalDate birthday;
////    private String gender;
////    private String phoneNumber;
////    private String email;
////    private Long emailApprove;
////    private Long phoneApprove;
////
////
////    @Builder
////    public UserVO(Long userId,String providerId,Long locationId,String email,String name,LocalDate birthday,String gender,String phoneNumber,Long emailApprove,Long phoneApprove) {
////        this.userId = userId;
////        this.providerId = providerId;
////        this.locationId = locationId;
////        this.name = name;
////        this.birthday = birthday;
////        this.gender = gender;
////        this.phoneNumber = phoneNumber;
////        this.email = email;
////        this.emailApprove = emailApprove;
////        this.phoneApprove = phoneApprove;
////    }
////
////    public static UserVO toEntity(KimEditUserListDTO kimEditUserListDTO) {
////        return UserVO.builder().userId(kimEditUserListDTO.getUserId())
////                .userId(kimEditUserListDTO.getUserId())
////                .providerId(kimEditUserListDTO.getProviderId())
////                .locationId(kimEditUserListDTO.getLocationId())
////                .name(kimEditUserListDTO.getName())
////                .birthday(kimEditUserListDTO.getBirthday())
////                .gender(kimEditUserListDTO.getGender())
////                .phoneNumber(kimEditUserListDTO.getPhoneNumber())
////                .email(kimEditUserListDTO.getEmail())
////                .emailApprove(kimEditUserListDTO.getEmailApprove())
////                .phoneApprove(kimEditUserListDTO.getPhoneApprove())
////                .build();
////    }
//}
