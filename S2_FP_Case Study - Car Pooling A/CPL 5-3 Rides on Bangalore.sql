SELECT * FROM CARPOOLING.USER_DETAILS 
WHERE USER_ID IN ( 10018, 11004,10019, 10001, 11002);

-- SELECT DISTINCT CR.USER_ID FROM CARPOOLING.RIDE_USERS CR
-- JOIN CARPOOLING.USER_DETAILS CU
-- ON CR.USER_ID = CU.USER_ID
-- JOIN CARPOOLING.RIDE CAR
-- ON CR.RIDE_ID = CAR.RIDE_ID
-- ORDER BY CR.USER_ID;

-- SELECT CR.USER_ID, EMAIL_ID, PASSWORD, FIRST_NAME, LAST_NAME, CITY, GENDER, PHONE_NO, TO_LOCATION 
-- FROM CARPOOLING.RIDE_USERS CR
-- JOIN CARPOOLING.USER_DETAILS CU
-- ON CR.USER_ID = CU.USER_ID
-- JOIN CARPOOLING.RIDE CAR
-- ON CR.RIDE_ID = CAR.RIDE_ID
-- WHERE TO_LOCATION IN ('Bangalore', 'Bangalore Airport', 'Electronic City')
-- ORDER BY CR.RIDE_ID;

-- SELECT CR.USER_ID, EMAIL_ID, PASSWORD, FIRST_NAME, LAST_NAME, CITY, GENDER, PHONE_NO
-- FROM CARPOOLING.RIDE_USERS CR
-- JOIN CARPOOLING.USER_DETAILS CU
-- ON CR.USER_ID = CU.USER_ID
-- WHERE CR.RIDE_ID IN ( SELECT RIDE_ID FROM CARPOOLING.RIDE
-- WHERE TO_LOCATION IN ('Bangalore', 'Bangalore Airport', 'Electronic City'))
-- ORDER BY CR.USER_ID;

-- SELECT DISTINCT CU.RIDE_ID, CU.USER_ID FROM CARPOOLING.RIDE_USERS CU
-- JOIN CARPOOLING.RIDE CR
-- ON CU.RIDE_ID = CR.RIDE_ID
-- WHERE TO_LOCATION IN ('Bangalore', 'Bangalore Airport', 'Electronic City')
-- ORDER BY CU.USER_ID;

-- SELECT RIDE_ID FROM CARPOOLING.RIDE

-- SELECT * FROM CARPOOLING.RIDE;

-- SELECT USER_ID FROM CARPOOLING.USER_DETAILS;