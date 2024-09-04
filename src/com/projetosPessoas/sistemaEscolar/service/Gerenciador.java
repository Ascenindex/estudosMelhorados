package service;

import model.Aluno;
import model.Curso;
import model.Professor;

public interface Gerenciador {
    void adicionarAluno(Aluno aluno, Curso curso);
    void adicionarProfessor(Professor professor);
    void listarAlunos(Curso curso);
    void listarProfessores();
}
