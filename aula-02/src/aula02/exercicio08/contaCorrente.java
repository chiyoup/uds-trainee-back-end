package aula02.exercicio04;
import java.util.Random;

public class ContaCorrente implements Conta {
    protected Integer agencia;
    protected Integer numeroConta;
    protected Double saldo = 0.0;

    protected ContaCorrente() {

    }

    public ContaCorrente(Integer agencia) {
        Random random = new Random();
        this.numeroConta = random.nextInt(9999);
        this.agencia = agencia;
    }

    @Override
    public void consultarSaldo(Cliente cliente) {
        System.out.println(cliente.getContaC().saldo);
    }

    @Override
    public void transferencia(Double valor, Cliente cliente) {
        this.saldo -= valor;
        cliente.getContaC().saldo += valor;
        System.out.println("Transferencia no valor de " + valor + " para " + cliente.getNome() + " efetuada com sucesso!");

    }

    @Override
    public void deposito(Cliente cliente, Double valor) {
        cliente.getContaC().saldo += valor;
        System.out.println("Deposito no valor de " + valor + " efetuado com sucesso!");
    }

    @Override
    public void sacar(Cliente cliente, Double valor) {
        if (cliente.getContaC().saldo <= 0) {
            System.out.println("Saldo insuficiente");
        } else {
            cliente.getContaC().saldo -= valor;
            System.out.println("Saque no valor de " + valor + " efetuado com sucesso!");
        }
    }
}
