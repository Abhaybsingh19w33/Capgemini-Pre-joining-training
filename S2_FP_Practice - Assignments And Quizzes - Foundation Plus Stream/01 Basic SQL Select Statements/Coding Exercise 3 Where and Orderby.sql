alter session set current_schema=bank;
SET heading OFF;

-- select * from BANK_EMPLOYEE;

-- desc BANK_EMPLOYEE;

-- Name					   Null?    Type
--  ----------------------------------------- -------- ----------------------------
--  BANK_EMP_ID				   NOT NULL NUMBER(5)
--  EMP_NAME				   NOT NULL VARCHAR2(40)
--  EMP_SEX				   NOT NULL CHAR(1)
--  DESIGNATION					    VARCHAR2(20)
--  MANAGER_ID					    NUMBER(6)

SELECT DESIGNATION, BANK_EMP_ID, EMP_NAME, EMP_SEX FROM BANK_EMPLOYEE 
WHERE MANAGER_ID IS NOT NULL 
order by DESIGNATION desc, EMP_NAME asc;
