create table curso (
    id          int             not null    auto_increment,
    nomecurso   varchar(200)    not null,
    primary key(id)
);

insert into curso(nomecurso) values ('Desenvolvimento de Sistemas');