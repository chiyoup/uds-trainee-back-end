package aula02.exercicio01;

public class Macaco extends Animal {

    private Integer banana;

    @Override
    public void andar() {
        this.movimento++;
        System.out.println("Andando...\n");
    }

    public Macaco() {
        this.banana = 15;
        System.out.println("\nMacaco tem " + banana + " bananas!!!");
    }

    public void comerBanana() {
        if (this.banana > 0) {
            this.banana--;
            System.out.println("Macaco quer banana!!!\nComendo banana HMMMMMMMMM!!!");
        }
    }

    public void qtdBananas() {
        System.out.println("Macaco ainda tem " + banana + " bananas.");
    }
}
