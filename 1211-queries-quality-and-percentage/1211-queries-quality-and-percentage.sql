# Write your MySQL query statement below
select query_name, ROUND(avg(rating/position),2) as quality,
ROUND(
    AVG(CASE WHEN rating<3 THEN 1.0
    ELSE 0
    END)*100,2

)AS poor_query_percentage
from Queries
group by query_name;
