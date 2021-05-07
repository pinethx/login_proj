
drop table if exists users;

create table users(
	userNo	int 		not null auto_increment,
	id		varchar(12)	not null	unique	COMMENT 'ID',
	passwd	char(41) 	not null	COMMENT	'PASSWORD',
	email	varchar(60)				COMMENT	'E-MAIL',
	primary key (userNo)
) COMMENT 'USER';

insert into users
values (1, 'idone', '1234', 'dlatl@ruu.kr'),
       (2, 'idtwo', '1234', 'dddll@ruu.kr'),
       (3, 'idthree', '1234', 'atttl@ruu.kr'),
       (4, 'idfour', '1234', 'ldald@ruu.kr');
