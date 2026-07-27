# Write your MySQL query statement below
select name as employee from employee e
where salary  >
(
    select m.salary from employee m
    where m.id = e.managerid
)