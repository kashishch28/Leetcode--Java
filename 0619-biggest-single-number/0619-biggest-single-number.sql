# Write your MySQL query statement below
-- select max(num) as num from MyNumbers
-- group by num
-- having count(*)=1
-- order by num desc
-- limit 1;







SELECT COALESCE ((SELECT num FROM MyNumbers GROUP BY num HAVING COUNT(num) = 1 ORDER BY num DESC LIMIT 1), null) AS num;
