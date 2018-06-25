package aula02.exercicio04;

public class Cliente extends ContaCorrente {
    private String nome;
    private String cpf;
    private String endereco;
    private ContaCorrente contaC;

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void informacoesCliente() {
        System.out.println("\nCliente: " + nome + "\nCPF: " + cpf + "\nEndereço: " + endereco + ".");
    }

    public void abrirContaCorrente(Integer agencia){
        this.contaC = new ContaCorrente(agencia);
        System.out.println("Parabens, sua conta foi criada!!!\nNome: " + nome
                            + "\nAgencia: " + agencia + "\nConta: " + contaC.numeroConta);
    }

    public ContaCorrente getContaC() {
        return contaC;
    }

    public String getNome() {
        return nome;
    }
}
