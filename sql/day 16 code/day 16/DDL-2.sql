/* 
	Adding the 'IF EXISTS' clause to a DROP statement allows you
	to remove a table if it exists, or ignore the command if the
	table does not exist. This prevents error messaging when 
	executing these statements.
*/
-- adding in constraints
DROP TABLE IF EXISTS school CASCADE;
DROP TABLE IF EXISTS student CASCADE;

/*
	Primary Keys are constraints identify a column's value as 
	requiring uniqueness when adding records to a table. Primary
	Keys cannot be null, nor duplicated when a record is added
	to a table.
*/
-- table 1
CREATE TABLE school(
	id SERIAL PRIMARY KEY,
	name VARCHAR(100)
);

/*
	The 'REFERENCES' keyword can be used to establish a Foreign
	key relationship to another table. When a Foreign Key is 
	established for a table, then the value for the Foreign key
	must match a Primary Key value of the referenced table.
*/
-- table 2
CREATE TABLE student(
	id SERIAL PRIMARY KEY,
	full_name VARCHAR(100),
	gpa NUMERIC,
	school_id INTEGER REFERENCES school(id)
);
