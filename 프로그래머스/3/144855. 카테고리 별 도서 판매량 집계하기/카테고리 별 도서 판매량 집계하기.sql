-- 코드를 입력하세요
SELECT b.CATEGORY, sum(s.SALES) as TOTAL_SALES
from BOOK b left join BOOK_SALES s on b.BOOK_ID = s.BOOK_ID
where DATE_FORMAT(s.SALES_DATE, '%Y-%m') = '2022-01'  
group by b.CATEGORY
order by b.CATEGORY asc
