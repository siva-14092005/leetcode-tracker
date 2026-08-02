select round( count(distinct a.player_id)/( select count(distinct player_id) from activity),2) as fraction
from activity a
join
(
SELECT
    player_id,
    MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id
) as x
on x.player_id = a.player_id
where event_date =  date_add(first_login, interval 1 day);