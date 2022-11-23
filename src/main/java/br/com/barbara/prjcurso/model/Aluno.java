package br.com.barbara.prjcurso.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String nomealuno;

}
