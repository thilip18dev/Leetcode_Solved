# Write your MySQL query statement below
SELECT 
    student_id,
        subject,
            MIN(CASE WHEN exam_date = first_date THEN score END) AS first_score,
                MIN(CASE WHEN exam_date = last_date THEN score END) AS latest_score
                FROM (
                    SELECT 
                            s.*,
                                    MIN(exam_date) OVER (PARTITION BY student_id, subject) AS first_date,
                                            MAX(exam_date) OVER (PARTITION BY student_id, subject) AS last_date
                                                FROM Scores s
                                                ) t
                                                GROUP BY student_id, subject, first_date, last_date
                                                HAVING latest_score > first_score
                                                ORDER BY student_id, subject;
                                                