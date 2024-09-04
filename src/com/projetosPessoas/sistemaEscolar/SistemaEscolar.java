package service;

import model.Aluno;
import model.Curso;
import model.Professor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Escola {
    private List<Professor> professores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private Map<Curso, List<Aluno>> matriculas = new HashMap<>();

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
        matriculas.put(curso, new ArrayList<>());
    }

    public void adicionarAluno(Aluno aluno, Curso curso) {
        if (matriculas.containsKey(curso)) {
            matriculas.get(curso).add(aluno);
        }
    }

    public void listarProfessores() {
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }

    public void listarAlunos(Curso curso) {
        System.out.println("Alunos do curso " + curso);
        List<Aluno> alunos = matriculas.get(curso);
        if (alunos != null) {
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }
}
