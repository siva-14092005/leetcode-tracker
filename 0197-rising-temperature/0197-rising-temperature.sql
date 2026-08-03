/*
select a.id 
from weather a 
join  weather b 
on datediff(a.recorddate,b.recorddate) = 1
where a.temperature > b.temperature;
*/


select id 
from
(
    select id ,temperature,recordDate,
    lag(temperature) over(order by recordDate) as ll,
    lag(recordDate) over(order by recordDate) as dd
    from weather
)
as x
where temperature  > ll and datediff(recordDate,dd)=1;

