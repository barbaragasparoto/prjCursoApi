package br.com.barbara.prjcurso.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String nomecurso;

    @Column
    private String serie;

    @Column
    private int qnta;

    @Column
    private String professor;

    @JsonIgnore
    @OneToMany(mappedBy = "curso")
    private List<Aluno> alunos = new ArrayList<>();

}
