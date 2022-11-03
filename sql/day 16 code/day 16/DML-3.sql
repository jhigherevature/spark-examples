-- INNER JOIN
-- gets all columns from both tables where there is a match
SELECT * FROM food_items f INNER JOIN home_items h ON f.price = h.price;

-- custom resultset
SELECT (f.name)  AS "Food Item", (h.name)  AS "Home Item", f.price AS "Price"
FROM food_items f 
INNER JOIN home_items h 
ON f.price = h.price;

-- FULL JOIN
SELECT * FROM food_items f FULL JOIN home_items h ON f.price = h.price;

-- LEFT JOIN
SELECT * FROM food_items f LEFT JOIN home_items h ON f.price = h.price;

-- RIGHT JOIN
SELECT * FROM food_items f RIGHT JOIN home_items h ON f.price = h.price;

-- set operations

-- UNION: combine all records returned from both queries
-- (get all food and home items that are less than 7 in price)
SELECT * FROM food_items WHERE price < 7 UNION SELECT * FROM home_items WHERE price < 7;
-- select * from food_items f, home_items h where f.price < 7 AND h.price < 7; -- cartesian product

-- INTERSECT: return only common records from both queries
-- (get all sale items less than 7 in price that are home items)
SELECT * from sale_items WHERE price < 7 INTERSECT SELECT * FROM home_items;

-- EXCEPT: return only records that are unique to first query
-- (get all sale items less than 7 in price that are not home items)
SELECT * FROM sale_items WHERE price < 7 EXCEPT SELECT * FROM home_items;