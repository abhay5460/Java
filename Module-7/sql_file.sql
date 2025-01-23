CREATE TABLE DEPT (
    Deptno INT(2) NOT NULL PRIMARY KEY DEFAULT 0,
    Dname VARCHAR(14) DEFAULT NULL,
    Loc VARCHAR(13) DEFAULT NULL
);
CREATE TABLE STUDENT (
    Rno INT(2) NOT NULL PRIMARY KEY DEFAULT 0,
    Sname VARCHAR(14) DEFAULT NULL,
    City VARCHAR(20) DEFAULT NULL,
    State VARCHAR(20) DEFAULT NULL
);
CREATE TABLE EMP_LOG (
    Emp_id INT(5) NOT NULL,
    Log_date DATE DEFAULT NULL,
    New_salary INT(10) DEFAULT NULL,
    ACTION VARCHAR(20) DEFAULT NULL
);
CREATE TABLE EMP (
    Empno INT(4) NOT NULL PRIMARY KEY DEFAULT 0,
    Ename VARCHAR(10) DEFAULT NULL,
    Job VARCHAR(9) DEFAULT NULL,
    Mgr INT(4) DEFAULT NULL,
    Hiredate DATE DEFAULT NULL,
    Sal DECIMAL(7,2) DEFAULT NULL,
    Comm DECIMAL(7,2) DEFAULT NULL,
    Deptno INT(2) DEFAULT NULL,
    FOREIGN KEY (Deptno) REFERENCES DEPT(Deptno)
);
INSERT INTO DEPT (Deptno, Dname, Loc) VALUES
(10, 'ACCOUNTING', 'NEW YORK'),
(20, 'RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONS', 'BOSTON');

INSERT INTO EMP (Empno, Ename, Job, Mgr, Hiredate, Sal, Comm, Deptno) VALUES
(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800.00, NULL, 20),
(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600.00, 300.00, 30),
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250.00, 500.00, 30),
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975.00, NULL, 20),
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250.00, 1400.00, 30),
(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850.00, NULL, 30),
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450.00, NULL, 10),
(7788, 'SCOTT', 'ANALYST', 7566, '1987-06-11', 3000.00, NULL, 20),
(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000.00, NULL, 10),
(7844, 'TURNER', 'SALESMAN', 7369, '1981-08-09', 1500.00, 0.00, 30),
(7876, 'ADAMS', 'CLERK', 7788, '1987-07-13', 1100.00, NULL, 20),
(7900, 'JAMES', 'CLERK', 7698, '1981-03-12', 950.00, NULL, 30),
(7902, 'FORD', 'ANALYST', 7566, '1981-03-12', 3000.00, NULL, 20),
(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300.00, NULL, 10);

---1 queries------
SELECT DISTINCT job FROM emp;

---2 queries------
SELECT * FROM EMP ORDER BY Deptno ASC, Job DESC;

---3 queries------
SELECT DISTINCT(Job) FROM EMP ORDER BY Job DESC;

---4 queries------
SELECT * FROM EMP WHERE Hiredate < '1981-01-01';

---5 queries------
SELECT empno,ename,sal,sal/365 AS dailysal FROM emp ORDER BY sal ASC;

---6 queries------
SELECT Empno,Ename,Sal,(YEAR(CURDATE())-YEAR(Hiredate)) AS EXP FROM EMP WHERE Mgr=7369;

---7 queries------
SELECT * FROM emp WHERE comm > sal;

---8 queries------
SELECT * FROM emp WHERE job='clerk' OR job='analyst' ORDER BY job DESC;

---9 queries------
SELECT * FROM emp WHERE (sal*12) BETWEEN 22000 AND 45000;

---10 queries-----
SELECT ename FROM emp WHERE ename LIKE 'S____';

---11 queries-----
SELECT * FROM emp WHERE empno LIKE '78%';

---12 queries-----
SELECT * FROM emp WHERE job='clerk' AND deptno=20;

---13 queries-----
SELECT e.empno, e2.ename
FROM emp e , emp e2
WHERE e.mgr = e2.empno AND e.Hiredate < e2.Hiredate;

---14 queries-----
SELECT * 
FROM emp 
WHERE deptno=20 AND job IN (SELECT job FROM emp WHERE deptno=10);

---15 queries-----
SELECT * 
FROM emp
WHERE sal = (SELECT sal FROM emp WHERE ename='ford') OR sal = (SELECT sal FROM emp WHERE ename='smith') ORDER BY sal DESC;

---16 queries-----
SELECT * 
FROM emp
WHERE job IN (SELECT job FROM emp WHERE ename = 'smith')
	OR job IN (SELECT job FROM emp WHERE ename = 'allen');

---17 queries-----
SELECT DISTINCT job
FROM emp WHERE deptno=10 AND job NOT IN (SELECT DISTINCT job FROM emp WHERE deptno=20);

---18 queries-----
SELECT MAX(sal) AS HighestSalary FROM emp;

---19 queries-----
SELECT *
FROM emp WHERE Sal = (SELECT MAX(Sal) FROM emp);

---20 queries-----
SELECT SUM(Sal) AS TotalManagerSalary
FROM emp WHERE job = 'mgr';

---21 queries-----
SELECT *
FROM emp WHERE Ename LIKE '%A%';

---22 queries-----
SELECT E.*
FROM emp E
JOIN (
    SELECT Job, Sal
    FROM emp
    WHERE (Job, Sal) IN ( SELECT Job, MIN(Sal) FROM emp GROUP BY Job ) ) M ON E.Job = M.Job AND E.Sal = M.Sal ORDER BY E.Job ASC;

---23 queries-----
SELECT *
FROM emp 
WHERE Sal > (SELECT Sal FROM emp WHERE Ename = 'BLAKE');

---24 queries-----
CREATE VIEW v1 AS
SELECT E.ename, E.job, D.dname, D.loc
FROM emp E
JOIN dept D
ON E.deptno = D.deptno;

---25 queries-----
DELIMITER //
CREATE PROCEDURE GetEmployeeDetails(IN dno INT)
BEGIN
    SELECT E.ename, D.dname
    FROM emp E
    JOIN dept D ON E.deptno = D.deptno
    WHERE E.deptno = dno;
END //
DELIMITER ;

---26 queries-----
ALTER TABLE student ADD COLUMN Pin BIGINT;

---27 queries-----
ALTER TABLE student
MODIFY COLUMN sname VARCHAR(40);

DESCRIBE student;
---28 queries-----
DELIMITER //

CREATE TRIGGER after_sal_update
AFTER UPDATE ON EMP
FOR EACH ROW
BEGIN
    IF NEW.sal <> OLD.sal THEN
        INSERT INTO emp_log (Empno, ACTION, ChangeDate)
        VALUES (NEW.Empno, 'New Salary', NOW());
    END IF;
END //

DELIMITER ;


