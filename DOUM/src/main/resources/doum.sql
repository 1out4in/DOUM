CREATE TABLE TBL_LOCATION
(
    LOCATION_ID NUMBER PRIMARY KEY,
    CITY        VARCHAR2(100)   NOT NULL,
    ADDRESS      VARCHAR2(1000)   NOT NULL,
    DETAIL      VARCHAR2(1000)
);

CREATE TABLE TBL_ORGANIZATION
(
    ORGANIZATION_ID            NUMBER PRIMARY KEY,
    LOCATION_ID         NUMBER    NOT NULL,
    EMAIL         VARCHAR2(100)    NOT NULL,
    PASSWORD        VARCHAR2(100)    NOT NULL,
    NAME         VARCHAR2(100)    NOT NULL,
    PHONE_NUMBER       VARCHAR2(100)   NOT NULL,
    REGISTER_DATE DATE   DEFAULT SYSDATE,
    EMAIL_APPROVE  NUMBER(1)   NOT NULL,
    PHONE_APPROVE  NUMBER(1)   NOT NULL,

    MANAGER_NAME         VARCHAR2(100)    NOT NULL,
    MANAGER_PHONE_NUMBER       VARCHAR2(100)   NOT NULL,
    FILE_LOCATION VARCHAR2(1000)   NOT NULL,
    STATUS VARCHAR2(100)   NOT NULL,

    PROVIDER_ID         VARCHAR2(255),
    PROVIDER    VARCHAR2(100),
    ROLE VARCHAR2(100),
    CONSTRAINT FK_ORGANIZATION_TO_LOCATION FOREIGN KEY (LOCATION_ID)
        REFERENCES TBL_LOCATION (LOCATION_ID) ON DELETE CASCADE
);

CREATE TABLE TBL_USER
(
    USER_ID            NUMBER PRIMARY KEY,
    LOCATION_ID         NUMBER    NOT NULL,
    EMAIL         VARCHAR2(100)    NOT NULL,
    PASSWORD        VARCHAR2(100)    NOT NULL,
    NAME         VARCHAR2(100)    NOT NULL,
    PHONE_NUMBER       VARCHAR2(100)   NOT NULL,
    REGISTER_DATE DATE   DEFAULT SYSDATE,
    EMAIL_APPROVE  NUMBER(1)   NOT NULL,
    PHONE_APPROVE  NUMBER(1)   NOT NULL,

    BIRTH_DATE DATE NOT NULL,
    GENDER VARCHAR(100) NOT NULL,
    INTRODUCTION       VARCHAR2(1000)   NOT NULL,

    PROVIDER_ID         VARCHAR2(255),
    PROVIDER    VARCHAR2(100),
    ROLE VARCHAR2(100),

    CONSTRAINT FK_USER_TO_LOCATION FOREIGN KEY (LOCATION_ID)
        REFERENCES TBL_LOCATION (LOCATION_ID) ON DELETE CASCADE
);

CREATE TABLE TBL_VOLUNTEER
(
    VOLUNTEER_ID            NUMBER PRIMARY KEY,
    LOCATION_ID         NUMBER    NOT NULL,
    ORGANIZATION_ID         NUMBER    NOT NULL,
    TITLE         VARCHAR2(100)    NOT NULL,
    CONTENT       VARCHAR2(1000)   NOT NULL,
    CATEGORY   VARCHAR2(100)   NOT NULL,
    TARGET   VARCHAR2(100)   NOT NULL,
    RECRUIT_START_DATE DATE DEFAULT SYSDATE,
    RECRUIT_END_DATE   DATE NOT NULL ,
    RECRUIT_NUMBER     NUMBER,
    VOLUNTEER_DATE DATE NOT NULL,
    IS_ADULT_ALLOWED NUMBER(1) DEFAULT 1,
    IS_TEEN_ALLOWED NUMBER(1) DEFAULT 1,
    IS_ONLINE NUMBER(1) DEFAULT 0,
    CONSTRAINT FK_VOLUNTEER_TO_LOCATION FOREIGN KEY (LOCATION_ID)
        REFERENCES TBL_LOCATION (LOCATION_ID) ON DELETE CASCADE,
    CONSTRAINT FK_VOLUNTEER_TO_ORGANIZATION FOREIGN KEY (ORGANIZATION_ID)
        REFERENCES TBL_ORGANIZATION (ORGANIZATION_ID) ON DELETE CASCADE
);

CREATE TABLE TBL_APPLIED_VOLUNTEER
(
    APPLIED_VOLUNTEER_ID   NUMBER PRIMARY KEY,
    VOLUNTEER_ID          NUMBER    NOT NULL,
    USER_ID          NUMBER    NOT NULL,
    APPLIED_DATE   DATE NOT NULL ,
    STATUS VARCHAR2(100) NOT NULL,
    CONSTRAINT FK_APPLIED_VOL_TO_VOL FOREIGN KEY (VOLUNTEER_ID)
        REFERENCES TBL_VOLUNTEER (VOLUNTEER_ID) ON DELETE CASCADE,
    CONSTRAINT FK_APPLIED_VOL_TO_USER FOREIGN KEY (USER_ID)
        REFERENCES TBL_USER (USER_ID) ON DELETE CASCADE
);

CREATE TABLE TBL_USER_NOTIFICATION
(
    USER_NOTIFICATION_ID   NUMBER PRIMARY KEY,
    USER_ID          NUMBER    NOT NULL,
    TITLE VARCHAR2(100) NOT NULL ,
    CONTENT VARCHAR2(1000) NOT NULL ,
    STATUS VARCHAR2(100) NOT NULL,
    CONSTRAINT FK_USER_NOTIFICATION_TO_USER FOREIGN KEY (USER_ID)
        REFERENCES TBL_USER (USER_ID) ON DELETE CASCADE
);

CREATE TABLE TBL_ORGANIZATION_NOTIFICATION
(
    ORGANIZATION_NOTIFICATION_ID   NUMBER PRIMARY KEY,
    ORGANIZATION_ID          NUMBER    NOT NULL,
    TITLE VARCHAR2(100) NOT NULL ,
    CONTENT VARCHAR2(1000) NOT NULL ,
    STATUS VARCHAR2(100) NOT NULL,
    CONSTRAINT FK_USER_NOTI_TO_ORG FOREIGN KEY (ORGANIZATION_ID)
        REFERENCES TBL_ORGANIZATION (ORGANIZATION_ID) ON DELETE CASCADE
);

CREATE TABLE TBL_USER_REVIEW
(
    USER_REVIEW_ID   NUMBER PRIMARY KEY,
    USER_ID          NUMBER    NOT NULL,
    ORGANIZATION_ID          NUMBER    NOT NULL,
    CONTENT VARCHAR2(1000) NOT NULL ,
    RATING NUMBER NOT NULL,
    CONSTRAINT FK_USER_REVIEW_TO_USER FOREIGN KEY (USER_ID)
        REFERENCES TBL_USER (USER_ID) ON DELETE CASCADE,
    CONSTRAINT FK_USER_REVIEW_TO_ORG FOREIGN KEY (ORGANIZATION_ID)
        REFERENCES TBL_ORGANIZATION (ORGANIZATION_ID) ON DELETE CASCADE
);

CREATE TABLE TBL_ORGANIZATION_REVIEW

(
    ORGANIZATION_REVIEW_ID   NUMBER PRIMARY KEY,
    ORGANIZATION_ID          NUMBER    NOT NULL,
    USER_ID          NUMBER    NOT NULL,
    CONTENT VARCHAR2(1000) NOT NULL ,
    RATING NUMBER NOT NULL,
    CONSTRAINT FK_ORG_REVIEW_TO_ORG FOREIGN KEY (ORGANIZATION_ID)
        REFERENCES TBL_ORGANIZATION (ORGANIZATION_ID) ON DELETE CASCADE,
    CONSTRAINT FK_ORG_REVIEW_TO_USER FOREIGN KEY (USER_ID)
        REFERENCES TBL_USER (USER_ID) ON DELETE CASCADE
);

CREATE TABLE TBL_ANONYMOUS
(
    ANONYMOUS_ID  NUMBER PRIMARY KEY,
    USER_ID          NUMBER    NOT NULL,
    TITLE VARCHAR2(100) NOT NULL ,
    CONTENT VARCHAR2(1000) NOT NULL ,
    CREATED_DATE DATE DEFAULT SYSDATE,
    VIEWS NUMBER DEFAULT 0,
    CONSTRAINT FK_ANONYMOUS_TO_USER FOREIGN KEY (USER_ID)
        REFERENCES TBL_USER (USER_ID) ON DELETE CASCADE
);

CREATE TABLE TBL_ANONYMOUS_COMMENT
(
    ANONYMOUS_COMMENT_ID  NUMBER PRIMARY KEY,
    ANONYMOUS_ID NUMBER    NOT NULL,
    USER_ID          NUMBER    NOT NULL,
    CONTENT VARCHAR2(100) NOT NULL ,
    CREATED_DATE DATE DEFAULT SYSDATE,
    CONSTRAINT FK_ANONY_COMMENT_TO_ANONY FOREIGN KEY (ANONYMOUS_ID)
        REFERENCES TBL_ANONYMOUS (ANONYMOUS_ID) ON DELETE CASCADE,
    CONSTRAINT FK_ANONY_COMMENT_TO_USER FOREIGN KEY (USER_ID)
        REFERENCES TBL_USER (USER_ID) ON DELETE CASCADE
);

CREATE TABLE TBL_ANNOUNCEMENT
(
    ANNOUNCEMENT_ID  NUMBER PRIMARY KEY,
    TITLE VARCHAR2(100) NOT NULL,
    CONTENT VARCHAR2(1000) NOT NULL ,
    CREATED_DATE DATE DEFAULT SYSDATE,
    VIEWS NUMBER DEFAULT 0
);


CREATE TABLE TBL_STORY
(
    STORY_ID  NUMBER PRIMARY KEY,
    USER_ID          NUMBER    NOT NULL,
    ANONYMOUS_ID NUMBER    NOT NULL,
    APPLIED_VOLUNTEER_ID NUMBER NOT NULL,
    TITLE VARCHAR2(100) NOT NULL,
    CONTENT VARCHAR2(1000) NOT NULL ,
    CREATED_DATE DATE DEFAULT SYSDATE,
    VIEWS NUMBER DEFAULT 0,
    CONSTRAINT FK_STORY_TO_USER FOREIGN KEY (USER_ID)
        REFERENCES TBL_USER (USER_ID) ON DELETE CASCADE,
    CONSTRAINT FK_STORY_TO_APPLIED_VOL FOREIGN KEY (APPLIED_VOLUNTEER_ID)
        REFERENCES TBL_APPLIED_VOLUNTEER (APPLIED_VOLUNTEER_ID) ON DELETE CASCADE
);


CREATE TABLE TBL_STORY_IMG
(
    STORY_IMG_ID  NUMBER PRIMARY KEY,
    STORY_ID          NUMBER    NOT NULL,
    FILE_LOCATION VARCHAR2(1000) NOT NULL,
    CONSTRAINT FK_STORY_IMG_TO_STORY FOREIGN KEY (STORY_ID )
        REFERENCES TBL_STORY (STORY_ID ) ON DELETE CASCADE
);

CREATE TABLE TBL_STORY_COMMENT
(
    STORY_COMMENT_ID  NUMBER PRIMARY KEY,
    STORY_ID NUMBER    NOT NULL,
    USER_ID          NUMBER    NOT NULL,
    CONTENT VARCHAR2(1000) NOT NULL ,
    CREATED_DATE DATE DEFAULT SYSDATE,
    CONSTRAINT FK_STORY_COMMENT_TO_STORY FOREIGN KEY (STORY_ID)
        REFERENCES TBL_ANONYMOUS (ANONYMOUS_ID) ON DELETE CASCADE,
    CONSTRAINT FK_STORY_COMMENT_TO_USER FOREIGN KEY (USER_ID)
        REFERENCES TBL_USER (USER_ID) ON DELETE CASCADE
);

CREATE TABLE TBL_STORY_LIKE
(
    STORY_LIKE_ID  NUMBER PRIMARY KEY,
    STORY_ID NUMBER    NOT NULL,
    USER_ID          NUMBER    NOT NULL,
    CONSTRAINT FK_STORY_LIKE_TO_STORY FOREIGN KEY (STORY_ID)
        REFERENCES TBL_ANONYMOUS (ANONYMOUS_ID) ON DELETE CASCADE,
    CONSTRAINT FK_STORY_LIKE_TO_USER FOREIGN KEY (USER_ID)
        REFERENCES TBL_USER (USER_ID) ON DELETE CASCADE
);











