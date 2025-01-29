package trabalhosPOO.ATT1.A03.listaPOO1;

public class ContaBancaria {
    private int numConta;
    private String nome;
    private double saldo;

    public ContaBancaria(int numConta, String nome, double saldo) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}
