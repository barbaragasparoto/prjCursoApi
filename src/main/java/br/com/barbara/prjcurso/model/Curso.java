package br.com.barbara.prjcurso.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String nome;





}
