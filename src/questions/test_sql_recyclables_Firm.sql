--ур 29.
SELECT Income_o.point, Income_o.dates, SUM(inc), SUM(out)
FROM Income_o LEFT JOIN
     Outcome_o ON Income_o.point = Outcome_o.point AND
                  Income_o.dates = Outcome_o.dates
GROUP BY Income_o.point, Income_o.dates
UNION
SELECT Outcome_o.point, Outcome_o.dates, SUM(inc), SUM(out)
FROM Outcome_o LEFT JOIN
     Income_o ON Income_o.point = Outcome_o.point AND
                 Income_o.dates = Outcome_o.dates
GROUP BY Outcome_o.point, Outcome_o.dates


SELECT Income.point, Income.dates, SUM(inc), SUM(out)
FROM Income LEFT JOIN
     Outcome ON Income.code = Outcome.code
GROUP BY Income.point, Income.dates
UNION
SELECT Outcome.point, Outcome.dates, SUM(inc), SUM(out)
FROM Outcome LEFT JOIN
     Income ON Income.code = Outcome.code
GROUP BY Outcome.point, Outcome.dates
