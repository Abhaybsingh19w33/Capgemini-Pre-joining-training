alter session set current_schema=bank;
SET heading ON;

-- SELECT * FROM BANK_TRANSACTION;

-- DESC BANK_TRANSACTION;

-- Name					   Null?    Type
--  ----------------------------------------- --------
--  TRANS_NO				   NOT NULL NUMBER(16)
--  TRANS_TYPE				   NOT NULL CHAR(2)
--  TRANS_DT				   NOT NULL DATE
--  TRANS_ACC_NO				   NOT NULL NUMBER(15)
--  TRANS_DESC				   NOT NULL VARCHAR2(50)
--  TRANS_AMT				   NOT NULL NUMBER(20,2)
--  BANK_EMP_ID					    NUMBER(5)

select savings.account_no as account_no,
trans.trans_type as trans_type,
trans.trans_dt as trans_dt,
trans.trans_desc as trans_desc,
trans.trans_amt as trans_amt
from bank_sb_account savings,
bank_transaction trans
where savings.account_no = trans.trans_acc_no and
trans.trans_amt > 1000
order by savings.account_no,
trans.trans_type,
trans.trans_dt;

-- SELECT TRANS_ACC_NO AS ACCOUNT_NO,
-- TRANS_TYPE AS TR,
-- TRANS_DT, TRANS_DESC, TRANS_AMT
-- FROM BANK_TRANSACTION
-- WHERE TRANS_AMT > 1000
-- ORDER BY TRANS_ACC_NO, TRANS_TYPE, TRANS_DT;

-- SELECT BT1.TRANS_ACC_NO AS ACCOUNT_NO, 
-- BT1.TRANS_TYPE AS TR, 
-- BT1.TRANS_DT, BT1.TRANS_DESC, BT1.TRANS_AMT 
-- FROM BANK_TRANSACTION BT1 JOIN BANK_TRANSACTION BT2
-- ON BT1.TRANS_NO = BT2.TRANS_NO
-- WHERE BT1.TRANS_AMT > 1000 
-- ORDER BY ACCOUNT_NO, TR, BT1.TRANS_DT;