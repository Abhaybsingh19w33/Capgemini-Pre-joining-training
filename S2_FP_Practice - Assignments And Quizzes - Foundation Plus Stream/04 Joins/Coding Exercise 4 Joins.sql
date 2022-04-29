alter session set current_schema=bank;
SET heading OFF;

-- SELECT * FROM BANK_EMPLOYEE;
-- DESC BANK_EMPLOYEE;

-- Name					   Null?    Type
--  ----------------------------------------- -------- ----------------------------
--  BANK_EMP_ID				   NOT NULL NUMBER(5)
--  EMP_NAME				   NOT NULL VARCHAR2(40)
--  EMP_SEX				   NOT NULL CHAR(1)
--  DESIGNATION					    VARCHAR2(20)
--  MANAGER_ID					    NUMBER(6)

-- SELECT * FROM BANK_TRANSACTION;
-- DESC BANK_TRANSACTION;

-- Name					   Null?    Type
--  ----------------------------------------- -------- ----------------------------
--  TRANS_NO				   NOT NULL NUMBER(16)
--  TRANS_TYPE				   NOT NULL CHAR(2)
--  TRANS_DT				   NOT NULL DATE
--  TRANS_ACC_NO				   NOT NULL NUMBER(15)
--  TRANS_DESC				   NOT NULL VARCHAR2(50)
--  TRANS_AMT				   NOT NULL NUMBER(20,2)
--  BANK_EMP_ID					    NUMBER(5)

SELECT BE.BANK_EMP_ID, BE.EMP_NAME, BE.DESIGNATION, BT.TRANS_DESC 
FROM BANK_EMPLOYEE BE LEFT OUTER JOIN BANK_TRANSACTION BT
ON BE.BANK_EMP_ID = BT.BANK_EMP_ID 
WHERE (BE.DESIGNATION LIKE '%ASST. MGR.%' OR BE.DESIGNATION LIKE '%MANAGER%');