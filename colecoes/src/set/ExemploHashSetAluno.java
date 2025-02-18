package set;

import Alunos.Aluno;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSetAluno {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploConsultando();
        exemploRemover();
    }

    private static void exemploRemover() {
        System.out.println("****** exemplo remover **********");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("Joao da silva", "Linux Basico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice",0);
        Aluno c = new Aluno("Lucia ferreira", "Internet",0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice",10);
        Aluno e = new Aluno("teste", "OpenOffice",10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);

        conjunto.remove(a);
        System.out.println(conjunto);

        for(Aluno aluno : conjunto) {
            System.out.println(conjunto);
        }
    }

    private static void exemploConsultando() {
        System.out.println("******** exemplo consultar **********");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("Joao da silva", "Linux Basico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice",0);
        Aluno c = new Aluno("Lucia ferreira", "Internet",0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice",10);
        Aluno e = new Aluno("teste", "OpenOffice",10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto.contains(e));
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemplos *********");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("Joao da silva", "Linux Basico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice",0);
        Aluno c = new Aluno("Lucia ferreira", "Internet",0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice",10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
    }
}
