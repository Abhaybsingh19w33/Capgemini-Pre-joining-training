select c.*, rd.* from carpooling.user_details c 
left join carpooling.ride_users r on c.user_id = r.user_id 
left join carpooling.ride rd on r.ride_id = rd.ride_id;