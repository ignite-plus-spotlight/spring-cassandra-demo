CREATE TABLE ignite.employee (
    emp_id text,
    emp_name text,
    emp_email text,
    PRIMARY KEY (emp_id, emp_name)
) WITH CLUSTERING ORDER BY (emp_name ASC);

INSERT INTO employee(emp_id, emp_name, emp_email)
VALUES ('1','sam','sam@sam.com');
