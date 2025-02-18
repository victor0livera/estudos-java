package Alunos;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    public double nota;
    public String nome;
    public String curso;
    public String sala;

    public Aluno(String nome, String curso, double nota){
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public Aluno(String nome, String curso, double nota, String sala) {
        this(nome, curso, nota);
        this.sala = sala;
    }

    public double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getSala() {
        return sala;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nota=" + nota +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", sala='" + sala + '\'' +
                '}';
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(nota, aluno.nota) == 0 && Objects.equals(nome, aluno.nome) && Objects.equals(curso, aluno.curso) && Objects.equals(sala, aluno.sala);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota, nome, curso, sala);
    }
}
