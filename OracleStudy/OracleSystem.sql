select * from dba_tables;

select * from dba_users where username = 'SCOTT';

select * from user_indexes;

create user orclstudy identified by oracle;

grant create session to orclstudy;

select * from all_users;

select * from all_users where username = 'ORCLSTUDY';

select * from dba_users;

select * from dba_users where username = 'ORCLSTUDY';

select * from dba_objects;

select * from dba_objects where owner = 'ORCLSTUDY';

alter user orclstudy identified by orcl;

drop user orclstudy;

drop user orclstudy cascade;

create user orclstudy identified by oracle;

grant resource, create session, create table to orclstudy;

revoke resource, create table from orclstudy;

create role rolestudy;

select * from user_role_privs;

grant rolestudy to orclstudy;

select * from user_sys_privs;