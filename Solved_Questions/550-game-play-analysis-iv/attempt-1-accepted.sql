SELECT
  ROUND(
    SUM(
      CASE 
        WHEN EXISTS (
          SELECT 1
          FROM Activity a
          WHERE a.player_id = b.player_id
            AND a.event_date = DATE_ADD(b.first_login, INTERVAL 1 DAY)
        ) THEN 1 ELSE 0
      END
    ) / COUNT(*),
  2) AS fraction
FROM (
  SELECT player_id, MIN(event_date) AS first_login
  FROM Activity
  GROUP BY player_id
) b;
