select max(n.model)
from (select a.price, a.model
      from pc as a
      where a.price = (select max(k.price) from pc as k)
      union all
      select b.price, b.model
      from laptop as b
      where b.price = (select max(l.price) from laptop as l)
      union all
      select c.price, c.model
      from printer as c
      where c.price = (select max(m.price) from printer as m)) as n
group by n.model


SELECT model
FROM ( SELECT model, price
         FROM pc
         UNION
         SELECT model, price
         FROM Laptop
         UNION
         SELECT model, price
         FROM Printer
     ) t1
WHERE price = (
    SELECT MAX(price)
    FROM (
             SELECT price
             FROM pc
             UNION
             SELECT price
             FROM Laptop
             UNION
             SELECT price
             FROM Printer
         ) t2
);

SELECT * FROM pc OFFSET 50 LIMIT 50


select distinct a.model
from( select model, price from pc
union all
select model, price from laptop
union all
select model, price from printer) as a
where a.price =(select max(b.price) from
(select price from pc union all
select price from laptop union all
select price from printer)as b);


