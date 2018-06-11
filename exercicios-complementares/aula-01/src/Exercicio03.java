import java.util.Scanner;

public class Exercicio03 {
    public static int numero = 0;
    public static void main(String[] args) {
        System.out.println("3. Escreva uma função que receba um número, via Scanner, e imprima se o número é par ou impar.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        System.out.println(imparOuPar());
    }

    public static String imparOuPar() {
        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }
}
