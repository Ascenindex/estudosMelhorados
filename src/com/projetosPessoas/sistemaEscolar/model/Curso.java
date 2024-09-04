package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private Professor professor;
    private List<Aluno> alunos;

    public Curso(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("Curso: " + nome + " - Professor: " + professor.getNome());
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
