package aula02.exercicio04;

public interface Conta {
    void consultarSaldo(Cliente cliente);
    void transferencia(Double valor, Cliente contaDestinatario);
    void deposito(Cliente contaDestinatario, Double valor);
    void sacar(Cliente cliente, Double valor);
}
