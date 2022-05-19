SELECT CR.USER_ID, EMAIL_ID, PASSWORD, FIRST_NAME, LAST_NAME, CITY, GENDER, PHONE_NO,
CR.RIDE_ID, FROM_LOCATION, TO_LOCATION, SEATS_LEFT, SEATS_TOTAL, RIDE_PROVIDER_ID, 
START_ON, ENDS_ON, ISSTARTED, ISFINISHED
FROM CARPOOLING.RIDE_USERS CR
JOIN CARPOOLING.USER_DETAILS CU
ON CR.USER_ID = CU.USER_ID
JOIN CARPOOLING.RIDE CAR
ON CR.RIDE_ID = CAR.RIDE_ID
WHERE TO_CHAR(START_ON, 'DD-MON-YYYY') = '25-NOV-2020'
ORDER BY CR.USER_ID;