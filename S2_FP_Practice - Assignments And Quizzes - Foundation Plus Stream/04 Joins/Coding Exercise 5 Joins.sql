alter session set current_schema=bank;
SET heading OFF;

-- SELECT * FROM BANK_CUSTOMER;
-- DESC BANK_CUSTOMER;

-- Name					   Null?    Type
--  ----------------------------------------- -------- ----------------------------
--  CUST_ID				   NOT NULL NUMBER(6)
--  CUST_FNAME				   NOT NULL VARCHAR2(25)
--  INITIALS					    VARCHAR2(5)
--  CUST_LNAME					    VARCHAR2(20)
--  CUST_SEX					    VARCHAR2(1)
--  CUST_DOB					    DATE
--  CUST_TYPE				   NOT NULL VARCHAR2(4)

-- SELECT * FROM BANK_RD_ACCOUNT;
-- DESC BANK_RD_ACCOUNT;

-- Name					   Null?    Type
--  ----------------------------------------- -------- ----------------------------
--  ACCOUNT_NO				   NOT NULL NUMBER(15)
--  RD_CUST_ID				   NOT NULL NUMBER(6)
--  RD_START_DT				   NOT NULL DATE
--  RD_TERM_YRS				   NOT NULL NUMBER(3)
--  INSTALLMENT_AMT			   NOT NULL NUMBER(20,2)
--  CURR_BALANCE					    NUMBER(20,2)
--  ACC_STATUS					    VARCHAR2(10)

SELECT BC.CUST_ID AS CUST_ID, BC.CUST_FNAME AS CUST_FNAME, 
CASE 
    WHEN BRD.ACCOUNT_NO IS NULL THEN 'NA'
    ELSE TO_CHAR (BRD.ACCOUNT_NO)
END AS ACCOUNT_NO,
CASE 
    WHEN BRD.INSTALLMENT_AMT IS NULL THEN 'NA'
    ELSE TO_CHAR (BRD.INSTALLMENT_AMT)
END AS INSTALLMENT_AMT
FROM BANK_CUSTOMER BC LEFT OUTER JOIN BANK_RD_ACCOUNT BRD
ON BC.CUST_ID = BRD.RD_CUST_ID ;