alter session set current_schema=bank;
SET heading OFF;

-- select * from BANK_CUST_CONTACT;

-- DESC BANK_CUST_CONTACT;

-- Name					   Null?    Type
--  ----------------------------------------- -------- ----------------------------
--  CUST_ID				   NOT NULL NUMBER(6)
--  CUST_PHONE				   NOT NULL NUMBER
--  CONTACT_TYPE				   NOT NULL VARCHAR2(10)
--  CUST_ADDR_LINE1				    VARCHAR2(30)
--  CUST_ADDR_LINE2				    VARCHAR2(30)
--  CUST_CITY					    VARCHAR2(25)
--  CUST_STATE					    VARCHAR2(25)
--  CUST_PIN					    NUMBER(6)
--  ----------------------------------------- -------- ----------------------------

--  CUST_ID, CUST_PHONE, CUST_ADDR_LINE1, CUST_ADDR_LINE2, CUST_CITY, CUST_STATE, CUST_PIN

select CUST_ID, CUST_PHONE, CUST_ADDR_LINE1, CUST_ADDR_LINE2, CUST_CITY, CUST_STATE, 
CUST_PIN from BANK_CUST_CONTACT WHERE CUST_STATE IN ('Tamilnadu', 'Karnataka') 
AND CONTACT_TYPE = 'HOME';