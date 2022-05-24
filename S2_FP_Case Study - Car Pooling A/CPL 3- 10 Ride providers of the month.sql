select * from carpooling.user_details where user_id in
(select ride_provider_id from carpooling.ride
group by ride_provider_id having count(ride_id) =2);