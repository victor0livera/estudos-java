package Alunos;


import java.util.Comparator;

public class ComparaNotaAluno implements Comparator<Aluno> {
    public int compare(Aluno o1, Aluno  o2) {
        return Double.compare(o1.getNota(), o2.getNota());
    }
}
