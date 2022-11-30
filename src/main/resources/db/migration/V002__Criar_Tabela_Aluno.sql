create table aluno (
    id          int             not null    auto_increment  primary key,
    nomealuno   varchar(200)    not null,
    cursoid       int             not null
);

Alter Table aluno add CONSTRAINT FK_Aluno_Curso FOREIGN KEY(cursoid) REFERENCES curso(id);

insert into aluno(nomealuno, cursoid) values ('Bárbara', 1);
