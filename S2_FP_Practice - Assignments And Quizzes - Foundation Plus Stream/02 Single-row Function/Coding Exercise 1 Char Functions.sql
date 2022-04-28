alter session set current_schema=bank;
SET heading OFF;

-- SELECT * FROM BANK_CUSTOMER;

-- DESC BANK_CUSTOMER;

--  Name					   Null?    Type
--  ----------------------------------------- -------- ----------------------------
--  CUST_ID				   NOT NULL NUMBER(6)
--  CUST_FNAME				   NOT NULL VARCHAR2(25)
--  INITIALS					    VARCHAR2(5)
--  CUST_LNAME					    VARCHAR2(20)
--  CUST_SEX					    VARCHAR2(1)
--  CUST_DOB					    DATE
--  CUST_TYPE				   NOT NULL VARCHAR2(4)

SELECT CUST_ID, UPPER(CUST_FNAME), UPPER(CUST_LNAME), 
TO_CHAR(CUST_DOB, 'DD-Mon') AS DOB FROM BANK_CUSTOMER WHERE CUST_SEX = 'F';