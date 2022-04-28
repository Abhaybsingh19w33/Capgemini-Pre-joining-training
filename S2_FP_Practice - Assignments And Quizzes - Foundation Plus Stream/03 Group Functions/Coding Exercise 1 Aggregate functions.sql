alter session set current_schema=bank;
SET heading OFF;

-- SELECT * FROM BANK_RD_ACCOUNT;

-- DESC BANK_RD_ACCOUNT;

-- Name					   Null?    Type
--  ----------------------------------------- -------
--  ACCOUNT_NO				   NOT NULL NUMBER(15)
--  RD_CUST_ID				   NOT NULL NUMBER(6)
--  RD_START_DT				   NOT NULL DATE
--  RD_TERM_YRS				   NOT NULL NUMBER(3)
--  INSTALLMENT_AMT			   NOT NULL NUMBER(20,2)
--  CURR_BALANCE					    NUMBER(20,2)
--  ACC_STATUS					    VARCHAR2(10)

SELECT MIN(INSTALLMENT_AMT), MAX(INSTALLMENT_AMT)
FROM BANK_RD_ACCOUNT
WHERE TO_CHAR(RD_START_DT , 'YYYY') = 2008;