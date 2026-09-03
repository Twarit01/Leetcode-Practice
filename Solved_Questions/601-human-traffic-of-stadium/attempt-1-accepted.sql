# Write your MySQL query statement below
SELECT id, visit_date, people
FROM Stadium
WHERE id IN (
    SELECT s1.id
    FROM Stadium s1
    JOIN Stadium s2 ON s1.id = s2.id - 1
    JOIN Stadium s3 ON s2.id = s3.id - 1
    WHERE s1.people >= 100 AND s2.people >= 100 AND s3.people >= 100
)
OR id IN (
    SELECT s2.id
    FROM Stadium s1
    JOIN Stadium s2 ON s1.id = s2.id - 1
    JOIN Stadium s3 ON s2.id = s3.id - 1
    WHERE s1.people >= 100 AND s2.people >= 100 AND s3.people >= 100
)
OR id IN (
    SELECT s3.id
    FROM Stadium s1
    JOIN Stadium s2 ON s1.id = s2.id - 1
    JOIN Stadium s3 ON s2.id = s3.id - 1
    WHERE s1.people >= 100 AND s2.people >= 100 AND s3.people >= 100
)
ORDER BY visit_date;
