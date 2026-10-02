# Write your MySQL query statement below
select DISTINCT num as ConsecutiveNums
from (
    select num,
            lag(num,1) OVER(order by id) as prev1,
            lag(num,2) OVER(order by id) as prev2
        from Logs    
    )t
where num=prev1
AND num=prev2;    