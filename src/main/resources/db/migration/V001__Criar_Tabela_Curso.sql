create table curso (
    id          int             not null    auto_increment,
    nomecurso   varchar(200)    not null,
    serie       varchar(30)     not null,
    qnta        int             not null,
    professor   varchar(30)     not null,
    primary key(id)
);

insert into curso(nomecurso, serie, qnta, professor) values ('Desenvolvimento de Sistemas', '2DS', 20, 'Marco' );
insert into curso(nomecurso, serie, qnta, professor) values ('Quimica', '1Q', 15, 'Hud' );
insert into curso(nomecurso, serie, qnta, professor) values ('Administração', '3ADM', 19, 'Fernanda' );
