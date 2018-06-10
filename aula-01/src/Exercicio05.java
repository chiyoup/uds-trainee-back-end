import java.util.Scanner;

public class Exercicio05 {
    static double saldo = 1500.00;
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        String nome = "Chiyo";
        System.out.println("Ola " + nome + "! voce tem " + saldo + " disponiveis.");
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
                System.out.println("[1] Arsenal AK47 - R$ 900,00");
                System.out.println("[2] CMMG MK47 Mutant T");
                System.out.println("[3] Arsenal SLR-106UR AK Pistol");
                System.out.println("[4] GSG AK-47 22 Tribute Rebel Furniture");
                System.out.println("[5] Century Arms Romanian GP WASR AK-47");
                System.out.println("[6] Voltar para o menu principal");
                menu3();
                break;
            case 2:
                System.out.println("[7] Mossberg 590 Shockwave 410 Ga");
                System.out.println("[8] Kel-Tec KSG Tactical Pump Shotgun 12 Ga");
                System.out.println("[9] Standard Manufacturing DP-12 Pump 12 Ga");
                System.out.println("[10] Remington Model 870 Tac-14 20g");
                System.out.println("[11] Stoeger Double Defense");
                System.out.println("[12] Voltar para o menu principal");
                menu3();
                break;
            case 3:
                System.out.println("[13] Savage Model 11 Scout");
                System.out.println("[14] Ruger Gunsite Scout Rifle, 308, W/Detachable Magazine");
                System.out.println("[15] Springfield Armory M1A Scout Squad SA 308 Win 18 10+1 Syn Stk Black");
                System.out.println("[16] Ruger Gunsite Scout Rifle, 308, Matte SS, 10 Round Mag 18");
                System.out.println("[17] Springfield Armory M1A Scout Squad SA 308 Win 18 10+1 Walnut Stk Blue");
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

        switch (numero){
            case 1:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                menu();
                break;
            case 2:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
            case 3:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
            case 4:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
            case 5:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
            case 6:
            case 12:
            case 18:
                menu();
                break;
            case 7:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
            case 8:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
            case 9:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
            case 10:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
            case 11:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
            case 13:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
            case 14:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
            case 15:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
            case 16:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
            case 17:
                saldo -= 900.00;
                System.out.println("Obrigado pela compra! Seu novo saldo e " + saldo);
                break;
        }
    }
}
