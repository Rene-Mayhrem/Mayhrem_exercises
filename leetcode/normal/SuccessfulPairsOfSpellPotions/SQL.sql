emp_id, name, salary, dep_id, manager_id

SELECT name, count(*) as appeareance FROM employees GROUP BY(name) AND HAVING COUNT(*) > 1;

