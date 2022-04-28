alter session set current_schema=bank;
SET heading OFF;

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

SELECT TRANS_DT, TRANS_ACC_NO, TRANS_DESC, TRANS_AMT, 
DECODE (TRANS_TYPE, 'CR', 'Credit', 'DB' , 'Debit') as TRANS_TYPE
FROM BANK_TRANSACTION 
WHERE TRANS_DESC NOT LIKE '%RD INSTLMNT%' AND TRANS_AMT > 10000 
ORDER BY TRANS_TYPE ASC, TRANS_DT DESC;