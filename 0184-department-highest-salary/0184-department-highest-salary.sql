select Department,Employee,Salary
from
(
    select e.name as Employee, e.id,e.salary,e.departmentId,d.name as Department,
    dense_rank() over(partition by d.id order by  e.salary desc ) as rno
    from employee e
    join department d 
    on e.departmentId = d.id
) as x 
where rno = 1;