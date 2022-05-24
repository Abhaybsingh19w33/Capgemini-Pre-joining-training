SELECT * FROM CARPOOLING.USER_DETAILS WHERE USER_DETAILS IN (10014, 10009, 10016, 10011, 10013, 10010, 10012);

SELECT U.* 
FROM CARPOOLING.USER_DETAILS U
LEFT JOIN CARPOOLING.RIDE R ON U.USER_ID = R.RIDE_PROVIDER_ID
WHERE R.RIDE_PROVIDER_ID IS NULL;