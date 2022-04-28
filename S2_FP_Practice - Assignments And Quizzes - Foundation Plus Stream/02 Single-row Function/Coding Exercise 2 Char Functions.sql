alter session set current_schema=bank;
SET heading OFF;

-- SELECT * FROM BANK_TRANSACTION;

-- DESC BANK_TRANSACTION;

--  Name					   Null?    Type
--  ----------------------------------------- -------- ----------------------------
--  TRANS_NO				   NOT NULL NUMBER(16)
--  TRANS_TYPE				   NOT NULL CHAR(2)
--  TRANS_DT				   NOT NULL DATE
--  TRANS_ACC_NO				   NOT NULL NUMBER(15)
--  TRANS_DESC				   NOT NULL VARCHAR2(50)
--  TRANS_AMT				   NOT NULL NUMBER(20,2)
--  BANK_EMP_ID					    NUMBER(5)

SELECT TRANS_DT, SUBSTR(TRANS_DESC ,1, 20) AS TRANS_DESC, TRANS_AMT 
FROM BANK_TRANSACTION 
WHERE TRANS_TYPE = 'CR' AND TO_CHAR(TRANS_DT , 'MM-YYYY') = '06-2010';
