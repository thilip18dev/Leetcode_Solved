# Write your MySQL query statement below
SELECT 
s.product_id,
f.first_year,
s.quantity,
s.price
FROM Sales s
JOIN (
SELECT product_id, MIN(year) AS first_year
FROM Sales
GROUP BY product_id
) f
ON s.product_id = f.product_id
AND s.year = f.first_year;
