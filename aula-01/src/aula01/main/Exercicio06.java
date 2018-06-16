package aula01.main;

import java.util.Scanner;

public class Exercicio06 {
    public static double saldo = 1500.00;
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        String nome = "Chiyo";
        System.out.println("Ola " + nome + "! voce tem " + String.format("%.2f", (double)saldo) + " disponiveis."
            + "\n[1] AK47 RIFLES"
            + "\n[2] SHOTGUNS"
            + "\n[3] SCOUT RIFLE"
            + "\n[4] HANDGUNS"
            + "\n[5] SMALL CARRY GUNS");
        menu2();
    }

    public static void menu2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opcao: ");
        Integer numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("[1] Arsenal AK47 - R$ 1.484,09"
                    + "\n[2] CMMG MK47 Mutant T - R$ 1.230,89"
                    + "\n[3] Arsenal SLR-106UR AK Pistol - R$ 905,99"
                    + "\n[4] GSG AK-47 22 Tribute Rebel Furniture - R$ 410,79"
                    + "\n[5] Century Arms Romanian GP WASR AK-47 - R$ 679,99"
                    + "\n[6] Voltar para o menu principal");
                menu3();
                break;
            case 2:
                System.out.println("[7] Mossberg 590 Shockwave 410 Ga - R$ 349,99"
                    + "\n[8] Kel-Tec KSG Tactical Pump Shotgun 12 Ga - R$ 915,19"
                    + "\n[9] Standard Manufacturing DP-12 Pump 12 Ga - R$ 1.060,99"
                    + "\n[10] Remington Model 870 Tac-14 20g - R$ 341,99"
                    + "\n[11] Stoeger Double Defense - R$ 409,99"
                    + "\n[12] Voltar para o menu principal");
                menu3();
                break;
            case 3:
                System.out.println("[13] Savage Model 11 Scout - R$ 665,89"
                    + "\n[14] Ruger Gunsite Scout Rifle, 308, W/Detachable Magazine - R$ 868,99"
                    + "\n[15] Springfield Armory M1A Scout Squad SA 308 Win 18 10+1 Syn Stk Black - R$ 1.562,39"
                    + "\n[16] Ruger Gunsite Scout Rifle, 308, Matte SS, 10 Round Mag 18 - R$ 916,49"
                    + "\n[17] Springfield Armory M1A Scout Squad SA 308 Win 18 10+1 Walnut Stk Blue - R$ 1.668,09"
                    + "\n[18] Voltar para o menu principal");
                menu3();
                break;
            case 4:
                System.out.println("[19] PTR 9C Pistol, 9MM, 8.86 Barrel, Steel Frame, Black Finish - R$ 1.599,99"
                    + "\n[20] IMG PPS43-C POLISH PISTOL - R$ 649,99"
                    + "\n[21] PTR PTR-9CT PISTOL 9MM 8.86 THREADED BARREL 30RD MAG M-LOK BLACK - R$ 1.630,69"
                    + "\n[22] Diamondback DB15 Pistol AR Pistol Semi-Automatic 223 Remington/5.56 NA - R$ 675,09"
                    + "\n[23] Ed Brown Special Forces SR Single 45 Automatic Colt Pistol - R$ 4.328,19"
                    + "\n[24] Voltar para o menu principal");
                menu3();
                break;
            case 5:
                System.out.println("[25] Kel-Tec P3ATBBlack DAO 380 ACP 2.75 6+1 Black Poly Grip Blued - R$ 233,39"
                        + "\n[26] Armscor Model 206 38 Revolver, 2, Blue Finish - R$ 229,99"
                        + "\n[27] KelTec PF-9 9mm, 3\" Barrel, Green Grip, 7 Rd Mag - R$ 266,09"
                        + "\n[28] Taurus Model 738BSS TCP, 380 Compact Pistol/3.3\", Black SS, Extended Mag - R$ 274,39"
                        + "\n[29] Diamondback DB380, 380 ACP, W/Crimson Trace LaserGrips Installed - R$ 358,89"
                        + "\n[30] Voltar para o menu principal");
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
                verificaSaldo(x);
                break;
            case 2:
                x = 1230.89;
                verificaSaldo(x);
                break;
            case 3:
                x = 905.99;
                verificaSaldo(x);
                break;
            case 4:
                x = 410.79;
                verificaSaldo(x);
                break;
            case 5:
                x = 679.99;
                verificaSaldo(x);
                break;
            case 6:
            case 12:
            case 18:
            case 24:
            case 30:
                menu();
                break;
            case 7:
                x = 349.99;
                verificaSaldo(x);
                break;
            case 8:
                x = 915.19;
                verificaSaldo(x);
                break;
            case 9:
                x = 1060.99;
                verificaSaldo(x);
                break;
            case 10:
                x = 341.99;
                verificaSaldo(x);
                break;
            case 11:
                x = 409.99;
                verificaSaldo(x);
                break;
            case 13:
                x = 665.89;
                verificaSaldo(x);
                break;
            case 14:
                x = 868.99;
                verificaSaldo(x);
                break;
            case 15:
                x = 1562.39;
                verificaSaldo(x);
                break;
            case 16:
                x = 916.49;
                verificaSaldo(x);
                break;
            case 17:
                x = 1668.09;
                verificaSaldo(x);
                break;
            case 19:
                x = 1599.99;
                verificaSaldo(x);
                break;
            case 20:
                x = 649.99;
                verificaSaldo(x);
                break;
            case 21:
                x = 1630.69;
                verificaSaldo(x);
                break;
            case 22:
                x = 675.09;
                verificaSaldo(x);
                break;
            case 23:
                x = 4328.19;
                verificaSaldo(x);
                break;
            case 25:
                x = 233.39;
                verificaSaldo(x);
                break;
            case 26:
                x = 229.99;
                verificaSaldo(x);
                break;
            case 27:
                x = 266.09;
                verificaSaldo(x);
                break;
            case 28:
                x = 274.39;
                verificaSaldo(x);
                break;
            case 29:
                x = 358.89;
                verificaSaldo(x);
                break;
        }
    }

    public static void verificaSaldo(double valor){
        double x = valor;
        if (saldo < x ) {
            System.out.println("Saldo insuficiente");
            menu();
        } else {
            saldo -= x;
            System.out.println("Obrigado pela compra! Seu novo saldo e " + String.format("%.2f", (double)saldo));
            menu();
        }
    }
}
