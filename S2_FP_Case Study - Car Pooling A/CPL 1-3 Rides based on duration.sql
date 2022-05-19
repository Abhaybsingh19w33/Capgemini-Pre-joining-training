
SELECT * FROM CARPOOLING.RIDE 
WHERE ENDS_ON - START_ON < INTERVAL '0 1:00:00.00' TO SECOND (2);

-- SELECT ENDS_ON - START_ON FROM CARPOOLING.RIDE;
-- WHERE ENDS_ON - START_ON;

-- trunc( mod(mod(end_date - start_date,1)*24,1)*60 ) as mins

DESC CARPOOLING.RIDE;

-- Name					   Null?    Type
--  ----------------------------------------- -------- ----------------------------
--  RIDE_ID				   NOT NULL NUMBER(5)
--  FROM_LOCATION					    VARCHAR2(20)
--  TO_LOCATION					    VARCHAR2(20)
--  SEATS_LEFT					    NUMBER(2)
--  SEATS_TOTAL					    NUMBER(2)
--  RIDE_PROVIDER_ID				    NUMBER(8)
--  START_ON					    TIMESTAMP(2)
--  ENDS_ON					    TIMESTAMP(2)
--  ISSTARTED					    VARCHAR2(4)
--  ISFINISHED					    VARCHAR2(4)

SELECT * FROM CARPOOLING.RIDE 
WHERE RIDE_ID IN (12003, 12004, 12008, 12010, 12011, 12016, 12020);