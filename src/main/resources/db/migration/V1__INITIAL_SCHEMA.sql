CREATE TABLE employee (
	id SERIAL NOT NULL CONSTRAINT employee_pk PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50)
)