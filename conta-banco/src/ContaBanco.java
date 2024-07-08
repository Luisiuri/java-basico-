

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de criação de conta bancária!");

        // Solicitação e leitura das informações
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Mensagem de saída formatada com as informações inseridas
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco,\n", nomeCliente);
        System.out.printf("sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.\n",
                numeroAgencia, numeroConta, saldo);

        // Fechamento do scanner
        scanner.close();
    }
}
