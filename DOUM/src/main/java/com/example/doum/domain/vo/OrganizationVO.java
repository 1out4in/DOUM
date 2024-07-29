package com.example.doum.domain.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@ToString
@NoArgsConstructor
public class OrganizationVO {
////    private Long organizationId;
////    private Long locationId;
////    private String email;
////    private String password;
////    private String name;
////    private String phoneNumber;
////    private LocalDateTime registerDate;
////    private Long emailApprove;
////    private Long phoneApprove;
////    private String managerName;
////    private String managerPhoneNumber;
////    private String fileLocation;
////    private String status;
////    private String providerId;
////    private String provider;
////    private String role;
////
////    @Builder
////    public OrganizationVO(Long organizationId, Long locationId, String email, String password, String name, String phoneNumber,
////                          LocalDateTime registerDate, Long emailApprove, Long phoneApprove, String managerName,
////                        String managerPhoneNumber, String fileLocation, String status, String providerId, String provider, String role) {
////        this.organizationId = organizationId;
////        this.locationId = locationId;
////        this.email = email;
////        this.password = password;
////        this.name = name;
////        this.phoneNumber = phoneNumber;
////        this.registerDate = registerDate;
////        this.emailApprove = emailApprove;
////        this.phoneApprove = phoneApprove;
////        this.managerName = managerName;
////        this.managerPhoneNumber = managerPhoneNumber;
////        this.fileLocation = fileLocation;
////        this.status = status;
////        this.providerId = providerId;
////        this.provider = provider;
////        this.role = role;
////    }
//
////  내가 한 부분
//    private Long organization_id;
//    private Long location_id;
//    private String email;
//    private String managerPhoneNumber;
//    private Long emailApprove;
//    private Long phoneApprove;
//
//    @Builder
//    public OrganizationVO(long organization_id,long location_id, String email, String managerPhoneNumber, Long emailApprove, Long phoneApprove) {
//        this.organization_id = organization_id;
//        this.location_id = location_id;
//        this.email = email;
//        this.managerPhoneNumber = managerPhoneNumber;
//        this.emailApprove = emailApprove;
//        this.phoneApprove = phoneApprove;
//    }
//
//    public static OrganizationVO toEntity(KimEditOrtListDTO kimEditOrtListDTO) {
//        return OrganizationVO.builder().organization_id(kimEditOrtListDTO.getOrganization_id())
//                .organization_id(kimEditOrtListDTO.getOrganization_id())
//                .location_id(kimEditOrtListDTO.getLocation_id())
//                .email(kimEditOrtListDTO.getEmail())
//                .managerPhoneNumber(kimEditOrtListDTO.getManager_phone_number())
//                .emailApprove(kimEditOrtListDTO.getEmail_approve())
//                .phoneApprove(kimEditOrtListDTO.getPhone_approve())
//                .build();
//    }
}
