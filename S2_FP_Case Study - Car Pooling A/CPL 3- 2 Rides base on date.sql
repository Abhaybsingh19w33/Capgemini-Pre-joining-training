-- DESC CARPOOLING.RIDE;
-- Name					   Null?    Type
--  ----------------------------------------- ------
--  RIDE_ID				   NOTNULL NUMBER(5)
--  FROM_LOCATION					    VARCHAR2(20)
--  TO_LOCATION					    VARCHAR2(20)
--  SEATS_LEFT					    NUMBER(2)
--  SEATS_TOTAL					    NUMBER(2)
--  RIDE_PROVIDER_ID				    NUMBER(8)
--  START_ON					    TIMESTAMP(2)
--  ENDS_ON					    TIMESTAMP(2)
--  ISSTARTED					    VARCHAR2(4)
--  ISFINISHED					    VARCHAR2(4)

SELECT * FROM CARPOOLING.RIDE WHERE TO_CHAR(START_ON ,'DD/MM/YY') = '25/11/20';
