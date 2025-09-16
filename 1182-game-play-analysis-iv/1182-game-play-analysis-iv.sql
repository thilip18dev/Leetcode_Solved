SELECT 
ROUND(
COUNT(DISTINCT CASE
WHEN a.event_date = DATE_ADD(b.first_login, INTERVAL 1 DAY) 
THEN a.player_id 
END) 
/ COUNT(DISTINCT b.player_id), 2
 ) AS fraction                                                                                                 FROM (                                                                                                   SELECT player_id, MIN(event_date) AS first_login                                                                                          FROM Activity
                                                                                                             GROUP BY player_id
                                                                                                             ) b
                                                                                                             LEFT JOIN Activity a
                                                                                                             ON a.player_id = b.player_id;
