package br.com.barbara.prjcurso.controller;

import br.com.barbara.prjcurso.model.Aluno;
import br.com.barbara.prjcurso.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")

public class AlunoController {

  @Autowired
    private AlunoRepository alunoRepository;

  @GetMapping("/todos")
    public List<Aluno> ListarAlunos() { return alunoRepository.findAll(Sort.by("nomealuno")); }

}
