import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da sua Conta!");
            int numero = sc.nextInt();
            System.out.println("Por favor, digite o número da Agência!");
            String agencia = sc.next();
            System.out.println("Por favor, digite o seu Nome!");
            String nomeCliente = sc.next();
            System.out.println("Por favor, digite o Saldo da Conta!");
            Double saldo = sc.nextDouble();

            ContaTerminal contaTerminal = new ContaTerminal(numero,agencia,nomeCliente,saldo);

            System.out.println("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque".formatted(contaTerminal.getNomeCliente(),contaTerminal.getAgencia(),contaTerminal.getNumero(),contaTerminal.getSaldo()));
        }


    }
}