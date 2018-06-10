import java.util.Scanner;

public class Exercicio05 {
    static double saldo = 1500.00;
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        String nome = "Chiyo";
        System.out.println("Ola " + nome + "! voce tem " + String.format("%.2f", (double)saldo) + " disponiveis.");
        System.out.println("[1] AK47 Rifles");
        System.out.println("[2] SHOTGUNS");
        System.out.println("[3] SCOUT RIFLE");
        menu2();
    }

    public static void menu2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opcao: ");
        Integer numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("[1] Arsenal AK47 - R$ 1.484,09");
                System.out.println("[2] CMMG MK47 Mutant T - R$ 1.230,89");
                System.out.println("[3] Arsenal SLR-106UR AK Pistol - R$ 905,99");
                System.out.println("[4] GSG AK-47 22 Tribute Rebel Furniture - R$ 410,79");
                System.out.println("[5] Century Arms Romanian GP WASR AK-47 - R$ 679,99");
                System.out.println("[6] Voltar para o menu principal");
                menu3();
                break;
            case 2:
                System.out.println("[7] Mossberg 590 Shockwave 410 Ga - R$ 349,99");
                System.out.println("[8] Kel-Tec KSG Tactical Pump Shotgun 12 Ga - R$ 915,19");
                System.out.println("[9] Standard Manufacturing DP-12 Pump 12 Ga - R$ 1.060,99");
                System.out.println("[10] Remington Model 870 Tac-14 20g - R$ 341,99");
                System.out.println("[11] Stoeger Double Defense - R$ 409,99");
                System.out.println("[12] Voltar para o menu principal");
                menu3();
                break;
            case 3:
                System.out.println("[13] Savage Model 11 Scout - R$ 665,89");
                System.out.println("[14] Ruger Gunsite Scout Rifle, 308, W/Detachable Magazine - R$ 868,99");
                System.out.println("[15] Springfield Armory M1A Scout Squad SA 308 Win 18 10+1 Syn Stk Black - R$ 1.562,39");
                System.out.println("[16] Ruger Gunsite Scout Rifle, 308, Matte SS, 10 Round Mag 18 - R$ 916,49");
                System.out.println("[17] Springfield Armory M1A Scout Squad SA 308 Win 18 10+1 Walnut Stk Blue - R$ 1.668,09");
                System.out.println("[18] Voltar para o menu principal");
                menu3();
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }

    public static void menu3(){
        System.out.println("Escolha uma opcao: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        double x = 0;

        switch (numero){
            case 1:
                x = 1484.00;
                verificaSaldo(saldo, x);
                break;
            case 2:
                x = 1230.89;
                verificaSaldo(saldo, x);
                break;
            case 3:
                x = 905.99;
                verificaSaldo(saldo, x);
                break;
            case 4:
                x = 410.79;
                verificaSaldo(saldo, x);
                break;
            case 5:
                x = 679.99;
                verificaSaldo(saldo, x);
                break;
            case 6:
            case 12:
            case 18:
                menu();
                break;
            case 7:
                x = 349.99;
                verificaSaldo(saldo, x);
                break;
            case 8:
                x = 915.19;
                verificaSaldo(saldo, x);
                break;
            case 9:
                x = 1060.99;
                verificaSaldo(saldo, x);
                break;
            case 10:
                x = 341.99;
                verificaSaldo(saldo, x);
                break;
            case 11:
                x = 409.99;
                verificaSaldo(saldo, x);
                break;
            case 13:
                x = 665.89;
                verificaSaldo(saldo, x);
                break;
            case 14:
                x = 868.99;
                verificaSaldo(saldo, x);
                break;
            case 15:
                x = 1562.39;
                verificaSaldo(saldo, x);
                break;
            case 16:
                x = 916.49;
                verificaSaldo(saldo, x);
                break;
            case 17:
                x = 1668.09;
                verificaSaldo(saldo, x);
                break;
        }
    }

    public static void verificaSaldo(double saldo, double valor){
        double x = valor;
        if (saldo < x ) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= x;
            System.out.println("Obrigado pela compra! Seu novo saldo e " + String.format("%.2f", (double)saldo));
        }
    }
}
