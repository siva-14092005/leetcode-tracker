# Write your MySQL query statement below
select d.name as department , e.name as employee,salary 
from employee e
left join department d 
on e.departmentId = d.id 
where e.salary = 
(
    select max(salary)
    from employee
    where departmentId =  e.departmentId
)
