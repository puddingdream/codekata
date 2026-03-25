-- 코드를 입력하세요
SELECT a.CATEGORY, a.PRICE as MAX_PRICE, a.PRODUCT_NAME
from FOOD_PRODUCT a
join (
    select CATEGORY, max(PRICE) as PRICE
    from FOOD_PRODUCT
    where CATEGORY in ('과자','국','김치','식용유')
    group by CATEGORY
) b
on a.CATEGORY = b.CATEGORY
and a.PRICE = b.PRICE
order by a.PRICE desc