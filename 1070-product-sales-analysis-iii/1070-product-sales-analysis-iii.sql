# Write your MySQL query statement below
select  product_id,year first_year,quantity,price
from
(
select product_id,year,quantity,price,
dense_rank() over(partition by product_id order by year) as  hell
from Sales  
) as x 
where hell = 1;
