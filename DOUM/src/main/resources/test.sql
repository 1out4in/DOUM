
select *
from  TBL_USER
WHERE  USER_ID =2;




SELECT S.STORY_ID, S.USER_ID, S.TITLE, S.CONTENT, S.CREATED_DATE, S.VIEWS,
       AV.VOLUNTEER_ID,
       O.ORGANIZATION_ID, O.NAME,
       L.CITY, L.ADDRESS
FROM
    TBL_STORY S
        JOIN TBL_APPLIED_VOLUNTEER AV ON S.APPLIED_VOLUNTEER_ID = AV.APPLIED_VOLUNTEER_ID
        JOIN TBL_USER U ON S.USER_ID = U.USER_ID
        JOIN TBL_ORGANIZATION O ON AV.ORGANIZATION_ID = O.ORGANIZATION_ID
        JOIN TBL_LOCATION L ON O.LOCATION_ID = L.LOCATION_ID
WHERE
    S.STORY_ID = 2 AND
    S.USER_ID = 1;







SELECT S.STORY_ID,S.TITLE, S.CONTENT, S.CREATED_DATE, S.VIEWS, SI.FILE_LOCATION AS IMAGE
FROM TBL_STORY S LEFT JOIN TBL_STORY_IMG SI ON S.STORY_ID=SI.STORY_ID
WHERE S.USER_ID =1
ORDER BY S.CREATED_DATE DESC;


select count(*)
from TBL_STORY;



SELECT SC.STORY_ID, SC.USER_ID, SC.CONTENT
FROM TBL_STORY_COMMENT SC JOIN TBL_USER U ON SC.USER_ID=U.USER_ID
WHERE SC.STORY_ID = 2
ORDER BY SC.CREATED_DATE ASC;



SELECT COUNT(*) AS LIKE_COUNT
FROM TBL_STORY_LIKE
WHERE STORY_ID =2;



SELECT UR.USER_REVIEW_ID, UR.CONTENT, UR.RATING, O.NAME AS ORGANAZATION_NAME
FROM TBL_USER_REVIEW UR JOIN TBL_ORGANIZATION O ON UR.ORGANIZATION_ID = O.ORGANIZATION_ID
WHERE UR.USER_ID = 1;




SELECT
    U.USER_ID,
    U.EMAIL,
    U.NAME,
    U.PHONE_NUMBER,
    U.REGISTER_DATE,
    U.EMAIL_APPROVE,
    U.PHONE_APPROVE,
    U.BIRTH_DATE,
    U.GENDER,
    U.INTRODUCTION,
    (SELECT COUNT(*) FROM TBL_APPLIED_VOLUNTEER AV WHERE AV.USER_ID = U.USER_ID) AS VOLUNTEER_COUNT,
    (SELECT AVG(R.RATING) FROM TBL_USER_REVIEW R WHERE R.USER_ID = U.USER_ID) AS AVERAGE_RATING
FROM
    TBL_USER U;




select *
    from TBL_ORGANIZATION;



-- INSERT INTO tbl_organization (
--     organization_id, location_id, email, password, name,
--     phone_number, register_date, email_approve, phone_approve, manager_name,
--     manager_phone_number, file_location, status, provider_id, provider, role
-- )
-- VALUES (
--            8,7, '#{email}', '1234' ,
--            '#{name}', '1111',to_date('2024-07-12'),11, 94, '#{managerName}',
--            '1234', '/files/org1/}','Inactive', '123','2', '#{role}'
--        );
--




select organization_id,password
from tbl_organization;

INSERT INTO tbl_organization (
    organization_id, location_id, email, password, name,
    phone_number, register_date, email_approve, phone_approve, manager_name,
    manager_phone_number, file_location, status, provider_id, provider, role
)
VALUES (
           'your_organization_id_value', 'your_location_id_value', 'your_email_value', 'your_password_value',
           'your_name_value', 'your_phone_number_value', 'your_register_date_value', 'your_email_approve_value', 'your_phone_approve_value', 'your_manager_name_value',
           'your_manager_phone_number_value', 'your_file_location_value', 'your_status_value', 'your_provider_id_value', 'your_provider_value', 'your_role_value'
       );


    select *
    from TBL_VOLUNTEER;
