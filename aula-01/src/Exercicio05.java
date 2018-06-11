public class Exercicio05 {
    public static void main(String[] args) {
        repeteRomano();
    }

    public static String converteRomano(Integer numero) {
        switch (numero) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            default:
                return "numero inválido!";
        }
    }

    public static void repeteRomano() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(converteRomano(i));
        }
    }

    /*public static void repeteRomano() {
        int i = 10;
        while (i >= 1) {
            System.out.println(converteRomano(i));
            i--;
        }
    }*/
}
