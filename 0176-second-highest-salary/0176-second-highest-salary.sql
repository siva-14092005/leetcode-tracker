select(
select salary 
from 
(
    select salary,row_number() over(order by salary desc) as rno
    from (select distinct salary from employee) as y
) as x
where rno = 2
) as SecondHighestSalary;