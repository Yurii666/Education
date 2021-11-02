-- ур. 25.
select maker
from product as k inner join
     (select distinct b.model
      from pc b
      where b.ram = (select min(c.ram)from pc c)
      group by b.model ,b.speed) as a
     on a.model=k.model
where type in ('Printer','PC')
group by maker;

--ур.26

select avg(a.price)
from(select price
    from product inner join pc on product.model = pc.model
    where maker = 'A'
    union all
    select price
    from product inner join laptop on product.model = laptop.model
    where maker ='A')as a;

--ур.27
select a.maker,avg(b.hd)
    from product as a inner join pc as b
    on a.model = b.model
    group by a.maker
    having a.maker in (select maker
                      from product
                      where type =('Printer')
                      group by maker);

--ур.28.

Select  count(maker)
from product
group by maker
having count (model)=2;


