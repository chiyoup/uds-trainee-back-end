import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("4. Escreva uma função que receba um parâmetro e informe se o mesmo é ou não um número inteiro.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();
        System.out.println(eInteiro(numero));
    }

    public static String eInteiro(double numero) {
        if (numero % 1 == 0) {
            return "Inteiro";
        } else {
            return "Não é inteiro";
        }
    }
}
