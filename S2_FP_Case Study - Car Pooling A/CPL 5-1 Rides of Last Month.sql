SELECT FROM_LOCATION, TO_LOCATION FROM CARPOOLING.RIDE 
WHERE NOT TO_CHAR(SYSDATE, 'DD-MON-YY') = '01-JAN-20'
AND TO_CHAR(START_ON, 'DD-MON-YY') = '01-DEC-2020';