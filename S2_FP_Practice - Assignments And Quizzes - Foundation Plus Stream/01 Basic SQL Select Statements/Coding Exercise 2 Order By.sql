alter session set current_schema=bank;
SET heading OFF;

-- DESC BANK_SB_ACCOUNT;

--  Name					   Null?    Type
--  ----------------------------------------- -------- ----------------------------
--  ACCOUNT_NO				   NOT NULL NUMBER(15)
--  PRIMARY_CUST_ID			   NOT NULL NUMBER(6)
--  SECONDARY_CUST_ID				    NUMBER(6)
--  CURR_BAL_AMT				   NOT NULL NUMBER(20,2)
--  ACC_STATUS				   NOT NULL VARCHAR2(10)
--  START_DATE				   NOT NULL DATE
--  END_DATE					    DATE

SELECT ACCOUNT_NO, PRIMARY_CUST_ID, CURR_BAL_AMT, 
START_DATE FROM BANK_SB_ACCOUNT WHERE ACC_STATUS = 'Active' ORDER BY START_DATE;