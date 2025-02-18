package Exercicio;

public class Pessoas {
    public String nome;
    public String genero;

    public Pessoas(String nome, String g) {
        this.nome = nome;
        this.genero = g;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
