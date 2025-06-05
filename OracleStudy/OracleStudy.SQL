-- SELECT 문의 기본 형식(4)
desc emp; -- emp 테이블 구조보기
select * from emp; -- emp 테이블 내용보기

desc dept; -- dept 테이블 구조보기
select * from dept; -- dept 테이블 내용보기

desc bonus; -- bonus 테이블 구조보기
select * from bonus; -- bonus 테이블 내용보기

desc salgrade; -- salgrade 테이블 구조보기
select * from salgrade; -- salgrade 테이블 내용보기

select empno, ename, deptno from emp; -- 열을 쉼표로 구분하여 출력하기

select distinct deptno from emp; -- distinct로 열의 중복 제거하기
    
select distinct job, deptno from emp; -- 여러 개 열을 명시하여 중복 제거하기

select all job, deptno from emp; -- 직책, 부서 번호 출력하기(all사용)

select ename, sal, sal*12+comm, comm from emp; -- 열에 연산식을 사용하여 출력하기(급여에 12를 곱하고 급여 외 추가 수당을 더한 값을 출력)

select ename, sal, sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+comm, comm from emp; -- 곱하기를 사용하지 않고 사원의 연간 총 수입 출력하기

select ename, sal, sal*12+comm as annsal, comm from emp; -- as(별칭)을 사용하여 사원의 연간 총 수입 출력

select * from emp order by sal; -- emp 테이블의 모든 열을 sal기준으로 오름차순 정렬

select * from emp order by sal desc; -- emp 테이블의 모든 열을 sal기준으로 내림차순 정렬

select * from emp order by deptno asc, sal desc; -- deptno(오름차순) sal(내림차순)정렬 (deptno가 1순위 sal이 2순위)

-- 더 정확하고 다양하게 결과를 출력하는 WHERE절과 연산자(5)
select * from emp where deptno = 30; -- deptno(부서번호)가 30인 데이터만 출력

select * from emp where deptno = 30 and job = 'SALESMAN'; -- and 연산자를 추가하여 job이 SALESMAN이고 deptno가 30인 데이터 출력

select * from emp where deptno = 30 or job = 'CLERK'; -- or 연산자를 추가하여 deptno가 30이거나 job이 CLERK인 데이터 출력

select * from emp where sal * 12 = 36000; -- sal * 12를 했을때 36000이 되는 데이터 출력

select * from emp where sal >= 3000; -- sal에서 3000이상인 데이터 출력

select * from emp where ename >= 'F'; -- ename에서 앞글자가 F이거나 F이후 데이터 출력

select * from emp where ename <= 'FORZ'; -- enma에서 FORZ보다 사전순으로 앞이거나 같은 데이터 출력

select * from emp where sal != 3000; -- sal에서 3000이 아닌 데이터 출력

select * from emp where sal <> 3000; -- sal에서 3000이 아닌 데이터 출력

select * from emp where sal ^= 3000; -- sal에서 3000이 아닌 데이터 출력

select * from emp where not sal = 3000; -- sal에서 3000이 아닌 데이터 출력

select * from emp where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK'; -- job에서 MANAGER,또는 SALESMAN,또는 CLERK 데이터 출력

select * from emp where job in ('MANAGER', 'SALESMAN', 'CLERK'); -- in을 사용하여 job에서 MANAGER,또는 SALESMAN,또는 CLERK 데이터 출력

select * from emp where job != 'MANAGER' and job <> 'SALESMAN' and job ^= 'CLERK'; -- job에서 MANAGER, SALESMAN, CLERK가 아닌 데이터 출력

select * from emp where job not in ('MANAGER', 'SALESMAN', 'CLERK'); -- not in 을 사용하여 job에서 MANAGER, SALESMAN, CLERK가 아닌 데이터 출력

select * from emp where sal >= 2000 and sal <= 3000; -- sal에서 2000이상 3000이하의 데이터 출려

select * from emp where sal between 2000 and 3000; -- between을 사용하여 sal에서 최소값 2000 최대값 3000인 데이터 출력

select * from emp where sal not between 2000 and 3000; -- not between을 사용하여 sal에서 2000이상 3000이하가 아닌 데이터 출력

select * from emp where ename like 'S%'; -- ename 에서 S로 시작하는 데이터 출력

select * from emp where ename like '_L%'; -- ename 에서 두번째 문자가 L인 데이터 출력

select * from emp where ename like '%AM%'; -- ename 안에서 AM이 들아간 데어터 출력

select * from emp where ename not like '%AM%'; -- ename 안에서 AM이 들어가지 않은 데이터 출력

select ename, sal, sal * 12 + comm as annsal, comm from emp;

select * from emp where comm = null;

select * from emp where comm is null;

select * from emp where mgr is not null;

select * from emp where sal > null and comm is null;

select * from emp where sal > null or comm is null; 

select empno, ename, sal, deptno from emp where deptno = 10 union select empno, ename, sal, deptno from emp where deptno = 20;

-- select empno, ename, sal, deptno from emp where deptno = 10 union select empno, ename, sal from emp where deptno = 20;

-- select empno, ename, sal, deptno from emp where deptno = 10 union select ename, empno, deptno, sal from emp where deptno = 20;

select empno, ename, sal, deptno from emp where deptno = 10 union select sal, job, deptno, sal from emp where deptno = 20;

select empno, ename, sal, deptno from emp where deptno = 10 union select empno, ename, sal, deptno from emp where deptno = 10;

select empno, ename, sal, deptno from emp where deptno = 10 union all select empno, ename, sal, deptno from emp where deptno = 10;

select empno, ename, sal, deptno from emp minus select empno, ename, sal, deptno from emp where deptno = 10; 

select empno, ename, sal, deptno from emp intersect select empno, ename, sal, deptno from emp where deptno= 10;

-- 데이터 처리와 가공을 위한 오라클 함수(6)
select ename, upper(ename), lower(ename), initcap(ename) from emp;

select * from emp where upper(ename) = upper('scott');

select * from emp where upper(ename) like upper('%scott%');

select ename, length(ename) from emp;

select ename, length(ename) from emp where length(ename) >= 5;

select length('한글'), lengthb('한글') from dual;

select job, substr(job, 1, 2), substr(job, 3, 2), substr(job, 5) from emp;

select job, substr(job, -length(job)), substr(job, -length(job), 2), substr(job, -3) from emp;

select instr('HELLO, ORACLE!', 'L') as instr_1, instr('HELLO, ORACLE!', 'L', 5) as instr_2, instr('HELLO, ORACLE!', 'L', 2, 2) as instr_3 from dual;

select * from emp where instr(ename, 'S') > 0;

select * from emp where ename like '%S%'; -- 6-11 실습

-- 126쪽까지 복습(위에다 작성)

-- 214쪽 까지 복습

-- 214쪽 부터

select * from emp, dept order by empno; -- emp 테이블과 dept 테이블을 조인 없이 단순히 모두 곱한 후, empno 기준으로 정렬하여 모든 데이터 출력

select * from emp, dept where emp.DEPTNO = dept.DEPTNO order by empno; --emp 테이블과 dept 테이블을 부서번호(DEPTNO)를 기준으로 조인하고, empno 오름차순으로 정렬해서 모든 열을 출력하라.

select *from emp e, dept d where e.deptno = d.deptno order by empno; -- 위 결과와 같은 의미이다.

-- select empno, ename, deptno, dname, loc from emp e, dept d where e.deptno = d.DEPTNO; -- deptno열은 두 테이블에 모두 존재하므로 어느 테이블에 속해있는 열인지 명시헤야한다.

select E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME, D.LOC FROM EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO ORDER BY D.DEPTNO, E.EMPNO;
-- EMP 테이블과 DEPT 테이블을 부서번호(DEPTNO) 기준으로 조인하고, 그 결과에서 사원번호, 사원이름, 부서번호, 부서명, 지역명을 출력하되 부서번호 오름차순-> 사원번호 오름차순으로 정렬해서 데이터 출력

select e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc from emp e, dept d where e.DEPTNO = d.DEPTNO and sal >= 3000;
-- 사원번호, 이름, 급여, 근무 부서 를 함께 출력하되 급여가 3000 이상인 데이터만 출력

select * from emp;

select * from salgrade;

select * from emp e, salgrade s where e.SAL between s.LOSAL and s.HISAL;
-- EMP 테이블과 SALGRADE 테이블을 조인하되 각 사원의 급여(SAL)가 SALGRADE 테이블의 급여 구간(LOSAL ~ HISAL) 안에 속할 때만 매칭하여 모든 열을 출력하라.

select e1.empno, e1.ename, e1.mgr, e2.empno as mgp_empno, e2.ename as mgr_ename from emp e1, emp e2 where e1.MGR = e2.EMPNO;
-- 사원(emp) 테이블을 자기 자신과 조인해서 각 사원의 "관리자(MGR)"가 누구인지 알아내고 사원 정보와 그 관리자의 사번/이름을 함께 출력한다.

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1, emp e2 where e1.mgr = e2.EMPNO(+) order by e1.EMPNO;

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1, emp e2 where e1.mgr(+) = e2.empno order by e1.empno;

select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, deptno, d.dname, d.loc from emp e natural join dept d order by deptno, e.empno;
-- emp 테이블과 dept 테이블은 공통 열 deptno를 가지고 있으므로 natural join을 사용할때 자동으로 deptno 열을 기준으로 등가 조인된다.

select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, deptno, d.dname, d.loc from emp e join dept d using (deptno) where sal >= 3000 order by deptno, e.empno;
-- emp 테이블과 dept 테이블을 **부서번호(DEPTNO)**로 조인한 뒤 급여(SAL)가 3000 이상인 사원의 정보와 그 부서 정보를 출력하고 부서번호 → 사원번호 순으로 데이터 출력

select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.dname, d.loc from emp e join dept d on (e.deptno = d.deptno) where sal <= 3000 order by e.deptno, empno;
-- emp(사원) 테이블과 dept(부서) 테이블을 **부서번호(deptno)**로 조인하고 급여(sal)가 3000 이하인 사원 정보와 그들의 부서 정보를 함께 출력하며 부서번호 → 사원번호 순으로 데이터 출력

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1 left outer join emp e2 on (e1.mgr = e2.EMPNO) order by e1.EMPNO;
-- emp 테이블에서 **각 사원의 관리자 정보(mgr)**를 같은 테이블에서 다시 찾아서 연결하고 관리자가 없는 사원도 포함하여 출력한 뒤 사원 번호(empno) 순으로 데이터 출력

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1 right outer join emp e2 on (e1.mgr = e2.empno) order by e1.empno, mgr_empno;
-- emp 테이블을 자기 조인하여 **각 관리자(mgr_empno)**가 관리하는 **부하 사원들(e1)**을 찾아 표시하고 부하가 없는 관리자도 결과에 포함하여 출력합니다.

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1 full outer join emp e2 on (e1.mgr = e2.empno) order by e1.empno;
-- 위 2개가 전부 포함한 데이터 출력(관리자가 없는 사원, 부하가 없는 관리자)

select sal from emp where ename = 'JONES'; -- 사원이름이 JONES인 사원의 급여 데이터 출력

select * from emp where sal > 2975; -- 급여가 2975보다 높은 사원 데이터 출력

select * from emp where sal > (select sal from emp where ename = 'JONES'); -- 서브 쿼리를 이용해 JONES의 급여보다 높은 급여를 받는 사원의 데이터 출력

select * from emp where hiredate < (select hiredate from emp where ename = 'SCOTT'); -- 서브 쿼리를 이옹해 SCOTT보다 빨리 입사한 사원의 데이터 출력

select e.empno, e.ename, e.job, e.sal, d.deptno, d.dname, d.loc from emp e, dept d where e.deptno = d.deptno and  e.deptno = 20 and e.SAL > (select avg(sal) from EMP);
-- 부서번호가 20번인 사원 중에서 전체 사원의 평균 급여보다 급여가 높은 사원의 정보와 그 사원이 소속된 부서 정보를 함께 출력합니다

select * from emp where deptno in (20, 30); -- 부서 번호가 20이거나 30인 사원의 데이터 출력

select * from emp where sal in (select max(sal) from emp group by deptno); -- 각 부서별로 가장 높은 급여 데이터 출력

select max(sal) from emp group by deptno; -- 부서별로 최대 급여데이터만 출력

select * from emp where sal = any (select max(sal) from emp group by deptno);

select * from emp where sal = some (select max(sal) from emp group by deptno);

select * from emp where sal < any (select sal from emp where deptno = 30) order by sal, empno;

select sal from emp where deptno = 30;

select * from emp where sal > any (select sal from emp where deptno = 30);

select * from emp  where sal < all (select sal from emp where deptno = 30);

select * from emp where sal > all (select sal from emp where deptno = 30);

select * from emp where exists (select dname from dept where deptno = 10);

select * from emp where exists (select dname from dept where deptno = 50);

select * from emp where (deptno, sal) in (select deptno, max(sal) from emp group by deptno);

select e10.empno, e10.ename, e10.deptno, d.dname, d.loc from (select * from emp where deptno = 10) e10, (select * from dept) d where e10.deptno = d.deptno;

with e10 as (select * from emp where deptno = 10), d as (select * from dept) select e10.empno, e10.ename, e10.deptno, d.dname, d.loc from e10, d where e10.deptno = d. deptno;

select empno, ename, job, sal, (select grade from salgrade where e.sal between losal and hisal) as salgrade, deptno, (select dname from dept where e.deptno = dept.deptno) as dname from emp e;
-- 위에 주석 안단거 주석 달기

create table dept_temp as select * from dept; -- dept테이블을 복사해서 dept_temp 테이블 만들기

select * from dept_temp; -- dept_temp 전체 데이터 출력

insert into dept_temp (deptno, dname, loc) values (50, 'DATABASE', 'SEOUL'); -- dept_temp테이블에 50, DATABASE, SEOUL 데이터 추가

select * from dept_temp; -- dept_temp 전체 데이터 출력

insert into dept_temp values (60, 'NETWORK', 'BUSAN'); -- dept_temp 테이블에 60, NETWORK, BUSAN 데이터 추가

select * from dept_temp; -- dept_temp 전체 데이터 출력

insert into dept_temp (deptno, dname, loc) values (70, 'WEB', null); -- null을 지정하여 데이터 추가

select * from dept_temp; -- dept_temp 전체 데이터 출력

insert into dept_temp (deptno, dname, loc) values (80, 'MOBILE', ''); -- 빈 공백 문자열로 데이터 추가

select * from dept_temp; -- dept_temp 전체 데이터 출력

insert into dept_temp (deptno, loc) values (90, 'INCHEON'); -- 열 데이터를 넣지 않는 방식으로 데이터 추가

select * from dept_temp; -- dept_temp 전체 데이터 출력

create table emp_temp as select * from emp where 1 <> 1; -- emp테이블을 복사해서 emp_temp 테이블 만들기

select * from emp_temp;

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (9999, '홍길동', 'PRESIDENT', null, '2001/01/01', 5000, 1000, 10);

select * from emp_temp;

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (1111, '성춘향', 'MANAGER', 9999, '2001-01-05', 4000, null, 20);

select * from emp_temp;

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (2111, '이순신', 'MANAGER', 9999, to_date('07/01/2001', 'dd/mm/yyyy'), 4000, null, 20);

select * from emp_temp;

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (3111, '심청이', 'MANAGER', 9999, sysdate, 4000, null, 30);

select * from emp_temp;

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno from emp e, salgrade s where e.sal between s.LOSAL and s.hisal and s.grade = 1;

select * from emp_temp;

create table dept_temp2 as select * from dept;

select * from dept_temp2;

update dept_temp2 set loc = 'SEOUL';

select * from dept_temp2;

rollback;

update dept_temp2 set dname = 'DATABASE', loc = 'SEOUL' where deptno = 40;

select * from dept_temp2;

update dept_temp2 set (dname, loc) = (select dname, loc from dept where deptno = 40) where deptno = 40;

update dept_temp2 set loc = 'SEOUL' where deptno = (select deptno from dept_temp2 where dname = 'OPERATIONS');

create table emp_temp2 as select * from emp;

select * from emp_temp2;

delete from emp_temp2 where job = 'MANAGER';

delete from emp_temp2 where empno in (select e.empno from emp_temp2 e, salgrade s where e.sal between s.losal and s.hisal and s.grade = 3 and deptno = 30);

delete from emp_temp2;

create table emp_ddl(empno NUMBER(4), ename VARCHAR2(10), job VARCHAR2(9), mgr NUMBER(4), hiredate DATE, sal NUMBER(7,2), comm NUMBER(7,2), deptno NUMBER(2));

desc emp_ddl;

create table dept_ddl as select * from dept;

desc dept_ddl;

select * from dept_ddl;

create table emp_ddl_30 as select * from emp where deptno = 30;

create table empdept_ddl as select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, d.deptno, d.dname, d.loc from emp e, dept d where 1 <> 1;

select * from empdept_ddl;

create table emp_alter as select * from emp;

select * from emp_alter;

alter table emp_alter add hp VARCHAR2(20);

alter table emp_alter rename column hp to tel;

alter table emp_alter modify empno number(5);

desc emp_alter;

alter table emp_alter drop column tel;

rename emp_alter to emp_rename;

select * from emp_rename;

truncate table emp_rename;

drop table emp_rename;

desc emp_rename;

select * from dict;

select * from dictionary;

select table_name from user_tables;

select owner, table_name from all_tables;

select * from dba_tables;

select * from user_indexes;

select * from user_ind_columns;

create index idx_emp_sal on emp(sal);

drop index idx_emp_sal;

create view vw_emp20 as (select empno, ename, job, deptno from emp where deptno = 20);

select * from user_views;

select * from vw_emp20;

drop view vw_emp20;

select rownum, e.* from emp e;

select rownum, e.* from emp e order by sal desc;

select rownum, e.* from (select * from emp e order by sal desc) e;

create table table_notnull(login_id varchar2(20) not null, login_pw varchar2(20) not null, tel varchar2(20));

desc table_notnull;

-- insert into table_notnull (login_id, login_pw, tel) values('test_id_01', null, '010-1234-5678');

insert into table_notnull (login_id, login_pw) values ('test_id_01', '1234');

select * from table_notnull;

-- update table_notnull set login_pw = null where login_id = 'test_id_01';

select owner, constraint_name, constraint_type, table_name from user_constraints;

create table table_notnull2(login_id varchar2(20) constraint tblnn2_lgnid_nn not null, login_pwd varchar2(20) constraint tblnn2_lgpw_nn not null, tel varchar2(20));

select owner, constraint_name, constraint_type, table_name from user_constraints;

-- alter table table_notnull modify(tel not null);

update table_notnull set tel = '010-1234-5678' where login_id = 'test_id_01';

select * from table_notnull;

alter table table_notnull modify(tel not null);

select owner, constraint_name, constraint_type, table_name from user_constraints;

alter table table_notnull2 modify(tel constraint tblnn_tel_nn not null);

desc table_notnull2;

alter table table_notnull2 rename constraint tblnn_tel_nn to tblnn2_tel_nn;

alter table table_notnull2 drop constraint tblnn2_tel_nn;

create table table_unique(login_id varchar2(20) unique, login_pw varchar2(20) not null, tel varchar2(20));

desc table_unique;

select owner, constraint_name, constraint_type, table_name from user_constraints where table_name = 'table_unique';

insert into table_unique(login_id, login_pw, tel) values ('test_id_01', 'pwd01', '010-1234-5678');

select * from table_unique;

-- insert into table_unique(login_id, login_pw, tel) values ('test_id_01', 'pwd01', '010-1234-5678');

insert into table_unique(login_id, login_pw, tel) values ('test_id_02', 'pwd01', '010-1234-5678');

insert into table_unique(login_id, login_pw, tel) values (null, 'pwd01', '010-2345-6789');

-- update table_unique set login_id = 'test_id_01' where login_id is null;

create table table_unique2 (login_id varchar2(20) constraint tblunq2_lgnid_unq unique, login_pwd varchar2(20) constraint tblunq2_lgnpw_nn not null, tel varchar2(20));

select owner, constraint_name, constraint_type, table_name from USER_CONSTRAINTS where table_name like 'TABLE_UNIQUE%';

-- alter table table_unique modify (tel unique);

update table_unique set tel = null;

select * from table_unique;

alter table table_unique modify (tel unique);

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';

alter table table_unique2 modify (tel constraint tblunq_tel_unq unique); -- 14-26실습까지

-- 15-9부터

create table temp(col1 varchar(20), col2 varchar(20));

grant select on temp to orclstudy;

grant insert on temp to orclstudy;

grant select, insert on temp to orclstudy;

revoke select, insert on temp from orclstudy;