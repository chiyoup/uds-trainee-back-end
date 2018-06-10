public class Exercicio02 {
    public static void main(String[] args) {
        Integer dia = 5;

        switch (dia) {
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número Inválido!");
                break;
            }
    }
}
