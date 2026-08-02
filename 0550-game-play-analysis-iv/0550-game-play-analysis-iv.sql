select round(count(distinct a.player_id)/(select count(distinct player_id) from activity),2) as fraction
from activity a 
join
(
    select player_id,min(event_date) as login_date
    from activity
    group by player_id
) as x
on x.player_id  = a.player_id
where datediff(event_date,login_date) = 1 