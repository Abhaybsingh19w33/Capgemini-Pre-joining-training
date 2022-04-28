alter session set current_schema=bank;
SET heading OFF;

-- SELECT * FROM BANK_CUSTOMER;
-- SELECT * FROM BANK_CUST_CONTACT;

-- DESC BANK_CUSTOMER;
-- DESC BANK_CUST_CONTACT;

-- Name					   Null?    Type
--  ----------------------------------------- -------- ----------------------------
--  CUST_ID				   NOT NULL NUMBER(6)
--  CUST_FNAME				   NOT NULL VARCHAR2(25)
--  INITIALS					    VARCHAR2(5)
--  CUST_LNAME					    VARCHAR2(20)
--  CUST_SEX					    VARCHAR2(1)
--  CUST_DOB					    DATE
--  CUST_TYPE				   NOT NULL VARCHAR2(4)

--  Name					   Null?    Type
--  ----------------------------------------- -------- ----------------------------
--  CUST_ID				   NOT NULL NUMBER(6)
--  CUST_PHONE				   NOT NULL NUMBER
--  CONTACT_TYPE				   NOT NULL VARCHAR2(10)
--  CUST_ADDR_LINE1				    VARCHAR2(30)
--  CUST_ADDR_LINE2				    VARCHAR2(30)
--  CUST_CITY					    VARCHAR2(25)
--  CUST_STATE					    VARCHAR2(25)
--  CUST_PIN					    NUMBER(6)

SELECT BC.CUST_ID, BC.CUST_FNAME, BC.CUST_LNAME, 
BCC.CUST_PHONE, BCC.CUST_CITY
FROM BANK_CUSTOMER BC JOIN BANK_CUST_CONTACT BCC
ON BC.CUST_ID = BCC.CUST_ID 
WHERE UPPER(BCC.CONTACT_TYPE) = 'HOME' AND UPPER(BCC.CUST_STATE) <> 'KARNATAKA';