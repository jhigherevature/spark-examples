-- adding in constraints
DROP TABLE IF EXISTS school CASCADE;
DROP TABLE IF EXISTS student CASCADE;

-- table 1
CREATE TABLE school(
	id SERIAL PRIMARY KEY,
	name VARCHAR(100)
);

-- table 2
CREATE TABLE student(
	id SERIAL PRIMARY KEY,
	full_name VARCHAR(100),
	gpa NUMERIC,
	school_id INTEGER REFERENCES school(id)
);
