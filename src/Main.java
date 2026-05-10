import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Meu primeiro projeto Java!");

         int opcao = 0;
         double saldo = 1000;
         while (opcao != 4) {
            System.out.println("=== BANCO JAVA ===");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();
        System.out.println("Você escolheu: " + opcao);
        if (opcao == 1) {
            System.out.println("Seu saldo é: " + saldo);
        }
        if (opcao == 2) {
            System.out.println("Digite o valor de depósito");
            double deposito = sc.nextDouble();
            saldo += deposito;
            System.out.println("Saldo atualizado: " + saldo);
        }
        if (opcao == 3) {
            System.out.println("Digite o valor de saque");
            double saque = sc.nextDouble();
            saldo -= saque;
            System.out.println("Saldo atualizado: " + saldo);
        }
        if (opcao == 4) {
            System.out.println("Sessão encerrada");
        }


        }
    }
}
