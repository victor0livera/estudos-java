import java.util.ArrayList;
import java.util.List;

public class DoReMiFaSo {
    public static void main(String[] args) {
        System.out.println("aqui vamos exibir as notas musicais!!!!");
        List<String> ntMusic = new ArrayList<>();
        ntMusic.add("Dó");
        ntMusic.add("Ré");
        ntMusic.add("Mi");
        ntMusic.add("Fa");
        ntMusic.add("Sol");
        ntMusic.add("Lá");
        ntMusic.add("Si");

        for (int i = 0; i < ntMusic.size() ; i++) {
            System.out.println(ntMusic.get(i));
        }
    }
}
