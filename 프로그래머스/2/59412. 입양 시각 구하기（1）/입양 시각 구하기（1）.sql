-- 코드를 입력하세요
SELECT TO_CHAR(DATETIME, 'FMHH24') AS HOUR, COUNT(*)
FROM ANIMAL_OUTS
WHERE TO_CHAR(DATETIME, 'FMHH24') BETWEEN 9 AND 19
GROUP BY TO_CHAR(DATETIME, 'FMHH24')
ORDER BY TO_NUMBER(HOUR);