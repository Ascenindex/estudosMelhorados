package service;

import model.Aluno;
import model.Curso;
import model.Professor;

import java.util.ArrayList;
import java.util.List;

public class Escola implements Gerenciador {
    private List<Professor> professores;
    private List<Curso> cursos;

    public Escola() {
        this.professores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    @Override
    public void adicionarAluno(Aluno aluno, Curso curso) {
        curso.adicionarAluno(aluno);
    }

    @Override
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public void listarAlunos(Curso curso) {
        curso.listarAlunos();
    }

    @Override
    public void listarProfessores() {
        System.out.println("Professores na Escola:");
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }
}
