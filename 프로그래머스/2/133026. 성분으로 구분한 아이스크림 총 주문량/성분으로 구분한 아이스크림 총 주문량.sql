-- 코드를 입력하세요
SELECT i.INGREDIENT_TYPE, sum(f.TOTAL_ORDER) as TOTAL_ORDER
from ICECREAM_INFO i left join FIRST_HALF f on f.FLAVOR = i.FLAVOR
group by 1
order by 2