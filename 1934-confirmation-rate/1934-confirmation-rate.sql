# Write your MySQL query statement below
select s.user_id,ifnull(round(cc/total,2),0) as  confirmation_rate 
from signups s
left join
( 
    select user_id,count(*) as cc
    from confirmations 
    where action  = 'confirmed'
    group by user_id
)c
on c.user_id =  s.user_id
left join
(
    select user_id,count(*) as total
    from confirmations
    group by user_id
)x
on x.user_id = s.user_id
group by s.user_id;