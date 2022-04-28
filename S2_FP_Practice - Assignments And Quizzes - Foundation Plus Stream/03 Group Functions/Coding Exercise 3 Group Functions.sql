alter session set current_schema=bank;
SET heading OFF;

-- SELECT * FROM BANK_CUST_CONTACT;

-- DESC BANK_CUST_CONTACT;

--  Name					   Null?    Type
--  ----------------------------------------- -------- 
--  CUST_ID				   NOT NULL NUMBER(6)
--  CUST_PHONE				   NOT NULL NUMBER
--  CONTACT_TYPE				   NOT NULL VARCHAR2(10)
--  CUST_ADDR_LINE1				    VARCHAR2(30)
--  CUST_ADDR_LINE2				    VARCHAR2(30)
--  CUST_CITY					    VARCHAR2(25)
--  CUST_STATE					    VARCHAR2(25)
--  CUST_PIN					    NUMBER(6)

SELECT CUST_ID, COUNT(CUST_ID)
FROM BANK_CUST_CONTACT
WHERE CONTACT_TYPE = 'OFFICE'
GROUP BY CUST_ID
HAVING COUNT(CUST_ID) > 1;