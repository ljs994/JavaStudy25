create user myboardtest identified by myboardtest

grant resource, connect to myboardtest

alter user myboardtest default tablespace users

alter user myboardtest temporary tablespace temp