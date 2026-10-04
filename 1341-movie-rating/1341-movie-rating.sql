# Write your MySQL query statement below

# For  users who rated the most
(
    select u.name as results
from Users u
join MovieRating mr on u.user_id = mr.user_id
group by u.name,u.user_id
order by count(*)desc, u.name
limit 1
)
UNION ALL

(
select m.title as results
from Movies m
join MovieRating mr on m.movie_id = mr.movie_id
where mr.created_at>='2020-02-01'
and mr.created_at<'2020-03-01'
group by mr.movie_id,m.title
order by avg(rating) desc,m.title
limit 1
);