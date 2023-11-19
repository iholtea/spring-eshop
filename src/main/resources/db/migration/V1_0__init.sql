create schema if not exists ecomm;

create TABLE IF NOT EXISTS ecomm."user" (
	user_id IDENTITY NOT NULL PRIMARY KEY,
	username varchar(16) NOT NULL,
	password varchar(40) NOT NULL,
	first_name varchar(16) NOT NULL,
	last_name varchar(16) NOT NULL,
	email varchar(24) NOT NULL,
	phone varchar(24) NOT NULL,
	status varchar(16)
);

insert into ecomm."user"(username, password, first_name, last_name, email, phone, status) 
	values('ppopescu', 'pwd', 'Pop', 'Popescu', 'ppopescu@yahoo.com', '234234234', 'ACTIVE');
insert into ecomm."user"(username, password, first_name, last_name, email, phone, status) 
	values('ggigescu', 'pwd', 'Gigi', 'Gigescu', 'ggicescu@gmail.com', '657887654', 'ACTIVE');

