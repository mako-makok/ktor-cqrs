create table hello(
    type text not null,
    message text not null
);

insert into hello
values ('MODULEA', 'hello module a'),
       ('MODULEB', 'hello module b')
;
