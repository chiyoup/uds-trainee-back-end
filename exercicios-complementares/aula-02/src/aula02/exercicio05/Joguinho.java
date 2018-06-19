package aula02.exercicio05;
import java.util.Random;
import java.util.Scanner;

public class Joguinho {
    static Integer aposta = null;
    static Integer usuario = 100;
    public static void main(String[] args) {
    menu();
    }

    public static void menu() {
        System.out.println("Você tem " + usuario + " pontos!" + "\n[1] IMPAR     [2] PAR\nEscolha uma opção: ");
        Scanner scanner = new Scanner(System.in);
        aposta = scanner.nextInt();
        verificaAposta();
    }

    public static void verificaAposta() {
        Random random = new Random();
        int numero = random.nextInt(99);
        if (numero % 2 == 0 && aposta % 2 == 0) {
            System.out.println("Você acertooou!!! a resposta é PAR!\n");
            usuario += 10;
            menu();
        } else if (numero % 2 != 0 && aposta % 2 != 0){
            System.out.println("Você acertooou!!! a resposta é IMPAR!\n");
            usuario += 10;
            menu();
        } else {
            System.out.println("Nãao foi dessa vez... Tente novamente!\n");
            usuario -= 10;
            menu();
        }
    }
}
