DROP TABLE IF EXISTS food_items;
DROP TABLE IF EXISTS home_items;
DROP TABLE IF EXISTS sale_items;

CREATE TABLE food_items(
	name VARCHAR(100),
	price NUMERIC
);

CREATE TABLE home_items(
	name VARCHAR(100),
	price NUMERIC
);

CREATE TABLE sale_items(
	name VARCHAR(100),
	price NUMERIC
);

INSERT INTO food_items VALUES ('Pasta Sauce', 3.99);
INSERT INTO food_items VALUES ('Soy Milk', 2.50);
INSERT INTO food_items VALUES ('Italian Sausage', 8.79);
INSERT INTO food_items VALUES ('Organic Spinach', 5.99);
INSERT INTO food_items VALUES ('Frozen Garlic Bread', 9.99);

INSERT INTO home_items VALUES ('Pillows (2-pack)', 18.99);
INSERT INTO home_items VALUES ('House Slippers', 8.50);
INSERT INTO home_items VALUES ('Garlic Press', 3.99);
INSERT INTO home_items VALUES ('Phone Charger (2-pack)', 3.99);
INSERT INTO home_items VALUES ('Bath Towel', 5.99);

INSERT INTO sale_items VALUES ('Phone Charger (2-pack)', 3.99);
INSERT INTO sale_items VALUES ('Organic Spinach', 5.99);
INSERT INTO sale_items VALUES ('Pasta Sauce', 3.99);
INSERT INTO sale_items VALUES ('House Slippers', 8.50);

SELECT * FROM food_items;
SELECT name FROM food_items WHERE price < 5;

SELECT * FROM home_items;
SELECT * FROM home_items WHERE price BETWEEN 5 AND 10;

SELECT * FROM sale_items;
SELECT price FROM sale_items WHERE name='Organic Spinach';