package aula02.main;
import java.util.ArrayList;

public class Exercicio01 {
    public static void main (String[] args) {
        ArrayList<String> pessoa01 = new ArrayList();

        pessoa01.add("Chiyo");
        pessoa01.add("87290-014");
        pessoa01.add("Av. Colombo");
        pessoa01.add("890");
        pessoa01.add("Casa");
        pessoa01.add("Jardim Europa");
        pessoa01.add("Maringá");
        pessoa01.add("Paraná");
        pessoa01.add("44999999999");

        System.out.println(pessoa01);

        pessoa01.set(0, "Chiyo Okamoto");
        pessoa01.remove(8);

        System.out.println(pessoa01);
    }
}
