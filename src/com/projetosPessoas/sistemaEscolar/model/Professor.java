package model;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String cpf, String disciplina) {
        super(nome, cpf);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return super.toString() + ", Disciplina: " + disciplina;
    }
}
