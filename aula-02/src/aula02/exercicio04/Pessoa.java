package aula02.exercicio04;

public class Pessoa {
    private String nome;
    private String cep;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;

    public Pessoa(String nome, String cep, String endereco, String numero, String complemento,
                       String bairro, String cidade, String estado, String telefone) {
        this.nome = nome;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
    }

    public void informacaoPessoa() {
        System.out.println("Nome: " + nome +
                            "\nEndereço: " + endereco + ", " + numero + ", " + complemento + ", " +
                            bairro + ", " + cep + ", " + cidade + ", " + estado + "." +
                            "\nTelefone: " + telefone);
    }
}