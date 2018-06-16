package aula01.main;

public abstract class Main {
    public static Boolean sexoFeminino = true;

    public static void main(String[] args) {
        String nome = "Aline Maria Vieira da Silva";
        Integer idade = 21;
        Double peso = 54.7;
        System.out.println("Hello World!");
        System.out.println("Olá, meu nome e " + nome + ", tenho " + idade + " anos" +
                ", sou do sexo " + eFeminino() + ", e peso " + peso + " kg.");

        if (idade <= 18) {
            System.out.println("Novinho(a)");
        } else if (idade > 18 && idade <= 30) {
            System.out.println("Tiozinho(a)");
        } else if (idade > 30) {
            System.out.println("Tiozão(ona)");
        }
    }

    public static String eFeminino() {
        if (sexoFeminino == false) {
            return "masculino";
        } else {
            return "feminino";
        }
    }
}
