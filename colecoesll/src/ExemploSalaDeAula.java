import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploSalaDeAula {
    public static void main(String[] args) {
        Map<Integer, List<Alunos>> listaSala = new HashMap<>();

        List<Alunos> alunosSala1 = criarTurma("sala 1", 10);
        listaSala.put(1, alunosSala1);

        List<Alunos> alunosSala2 = criarTurma("sala 2", 30);
        listaSala.put(2, alunosSala2);

        imprimirAlunosSala(listaSala.get(1));
    }

    private static void imprimirAlunosSala(List<Alunos> alunos) {
        // for java 8 api stram
        System.out.println("for java 8 api stream");
        alunos.forEach();
    }

    private static List<Alunos> criarTurma(String sala, int count) {
        List<Alunos> alunos = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Alunos aluno = new Alunos("nome aluno" + i, "curso" + i, i, sala);
            alunos.add(aluno);
        }
        return alunos;
    }
}
