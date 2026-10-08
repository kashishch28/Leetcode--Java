# Write your MySQL query statement below
select Department, Employee,Salary
from (
    select
    d.name as Department, e.name as Employee, e.salary as Salary,
    DENSE_RANK() OVER(PARTITION BY e.departmentId
    order by e.salary desc
    ) AS rnk
    from Employee e
    join Department d on d.id = e.departmentId
)t
where rnk<=3;
