create table curso (
    id          int             not null    auto_increment,
    nomecurso   varchar(200)    not null,
    primary key(id),
    serie       varchar(30)             not null,
    qnta        int             not null,
    professor   varchar(30)     not null
);

insert into curso(nomecurso, serie, qnta, professor) values ('Desenvolvimento de Sistemas', '2DS', 20, 'MARCO' );