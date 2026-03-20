-- 코드를 입력하세요
SELECT DISTINCT c.CAR_ID
from CAR_RENTAL_COMPANY_CAR c join CAR_RENTAL_COMPANY_RENTAL_HISTORY  h on c.CAR_ID = h.CAR_ID
where c.CAR_TYPE = '세단'
and date_format( h.START_DATE, '%m') = '10'
order by 1 desc