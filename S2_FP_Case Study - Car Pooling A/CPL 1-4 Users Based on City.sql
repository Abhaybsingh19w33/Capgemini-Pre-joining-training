
-- DESC CARPOOLING.USER_DETAILS;

-- Name					   Null?    Type
--  ----------------------------------------- --
--  USER_ID				   NOT NULL NUMBER(8)
--  EMAIL_ID					    VARCHAR2(20)
--  PASSWORD					    VARCHAR2(20)
--  FIRST_NAME					    VARCHAR2(20)
--  LAST_NAME					    VARCHAR2(20)
--  CITY						    VARCHAR2(20)
--  GENDER 					    CHAR(1)
--  PHONE_NO					    NUMBER(10)

SELECT CITY, COUNT(*) FROM CARPOOLING.USER_DETAILS GROUP BY CITY;