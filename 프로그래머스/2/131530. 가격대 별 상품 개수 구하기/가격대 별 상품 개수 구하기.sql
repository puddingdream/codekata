-- 코드를 입력하세요
SELECT TRUNCATE(PRICE, -4) as PRICE_GROUP, count(*) as PRODUCTS
from PRODUCT 
group by 1
order by 1