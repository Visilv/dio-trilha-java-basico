public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }
}