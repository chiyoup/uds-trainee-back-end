import java.util.Scanner;

public class Exercicio06 {
    public static int codigo = 0;
    public static void main(String[] args) {
        System.out.println("6. Escreva uma função que leia o código de origem de um produto, via Scanner, " +
                "e imprima na tela a região de sua procedência conforme a tabela abaixo:\n" +
                "\n" +
                "Código 1: Sul\n" +
                "Código 2: Norte\n" +
                "Código 3: Leste\n" +
                "Código 4: Oeste\n" +
                "Código 5 ou 6: Nordeste\n" +
                "Código 7, 8 ou 9: Sudeste\n" +
                "Código 10: Centro-Oeste\n" +
                "Código 11: Noroeste\n" +
                "Observação: Caso o código não seja nenhum dos especificados o produto deve ser encarado como Importado.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código de origem do produto: ");
        codigo = scanner.nextInt();
        System.out.println(lerCodigo());
    }

    public static String lerCodigo() {
        switch (codigo) {
            case 1:
                return "Sul";
            case 2:
                return "Norte";
            case 3:
                return "Leste";
            case 4:
                return "Oeste";
            case 5:
            case 6:
                return "Nordeste";
            case 7:
            case 8:
            case 9:
                return "Sudeste";
            case 10:
                return "Centro-Oeste";
            case 11:
                return "Noroeste";
            default:
                return "Importado";
        }
    }
}
