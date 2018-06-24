package aula02.exercicio04;
import java.util.Calendar;
import java.util.Random;

public class ContaPoupanca implements Conta {
    protected Integer agencia;
    protected Integer numeroConta;
    private Double saldo;

    public ContaPoupanca(Integer agencia) {
        Random random = new Random();
        this.numeroConta = random.nextInt(9999);
        this.agencia = agencia;
    }

    public void rendimento() {
        Calendar c = Calendar.getInstance();
        int dia = c.get(Calendar.DAY_OF_MONTH);
        if (dia == 5) {
            this.saldo += (this.saldo*0.5)/100;
        }
    }

    @Override
    public void consultarSaldo(Cliente cliente) {

    }

    @Override
    public void transferencia(Double valor, Cliente contaDestinatario) {

    }

    @Override
    public void deposito(Cliente contaDestinatario, Double valor) {

    }

    @Override
    public void sacar(Cliente cliente, Double valor) {

    }
}
