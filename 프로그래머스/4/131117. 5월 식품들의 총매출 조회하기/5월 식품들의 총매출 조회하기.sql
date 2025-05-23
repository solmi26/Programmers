-- 코드를 입력하세요
SELECT P.PRODUCT_ID, P.PRODUCT_NAME, SUM(P.PRICE * O.AMOUNT) AS TOTAL_SALES
FROM  FOOD_PRODUCT P JOIN FOOD_ORDER O ON P.PRODUCT_ID = O.PRODUCT_ID
WHERE O.PRODUCE_DATE BETWEEN TO_DATE('2022-05-01', 'YYYY-MM-DD') AND TO_DATE('2022-05-31', 'YYYY-MM-DD')
GROUP BY P.PRODUCT_ID, P.PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, P.PRODUCT_ID;

