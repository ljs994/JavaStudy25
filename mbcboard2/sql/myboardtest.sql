-- 부모(member) 생성

create table member (
	mno number(5) not null,
	mname nvarchar2(10) not null,
	id nvarchar2(10) not null,
	pw nvarchar2(20) not null,
	email nvarchar2(20) primary key,
	regidate date default sysdate not null
);`

create sequence member_seq increment by 1 start with 1 nocycle nocache; -- 자동 번호 생성 

insert into member (mno, mname, id, pw, email, regidate)
	values (member_seq.nextval, '이재상', 'ljs', '1234', 'ljs1234@naver.com', sysdate)

insert into member (mno, mname, id, pw, email, regidate)
	values (member_seq.nextval, '김기원', 'kkw', '1234', 'kkw1234@gmail.com', sysdate)

insert into member (mno, mname, id, pw, email, regidate)
	values (member_seq.nextval, '짱구', 'jjg', '1234', 'jjg1234@naver.com', sysdate)
	
insert into member (mno, mname, id, pw, email, regidate)
	values (member_seq.nextval, '손오공', 'sog', '1234', 'sog1234@naver.com', sysdate)
	
insert into member (mno, mname, id, pw, email, regidate)
	values (member_seq.nextval, '마리오', 'mro', '1234', 'mro1234@naver.com', sysdate)

select *from member;

-- 자식(board) 생성
create table board (
    bno number(5) primary key,
    email nvarchar2(20), 
    title nvarchar2(20) not null,
    content nvarchar2(50) not null,
    writedate date default sysdate,
    constraint fk_board_member foreign key (email)
        references member(email)
        on delete cascade
)

