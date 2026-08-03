# Write your MySQL query statement below
select Department,Employee,salary
from 
(
    select d.name as Department,e.name as Employee , salary,
    dense_rank() over(partition by d.id order by salary desc) as rno
    from Employee e 
    join Department d 
    on d.id = e.departmentId
) as x 
where rno in(1,2,3);