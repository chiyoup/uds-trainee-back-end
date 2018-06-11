import java.util.Scanner;

public class Exercicio05 {
    public static int numero = 0;
    public static void main(String[] args) {
        System.out.println("5. Escreva uma função para ler um valor, via Scanner, e alertar se é positivo ou negativo. Considere o valor zero como positivo.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        System.out.println(positivoNegativo());
    }

    public static String positivoNegativo() {
        if (numero < 0)
            return "Negativo";
        else
            return "Positivo";
    }
}
