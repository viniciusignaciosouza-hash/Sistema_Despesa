import java.util.Scanner;

import model.Conta;
import model.Despesa;
import model.Meta;
import model.Receita;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Conta conta = new Conta("001-1", "Ana Silva", 500.0, 200.0);
        Conta conta2 = new Conta("002-2", "Carlos Souza", 1200.0, 500.0);
        
        Receita receita1 = new Receita("Salário Ana", 3000.0);
        Receita receita2 = new Receita("Salário Carlos", 4000.0);
        
        Despesa despesa1 = new Despesa("Aluguel", 1000.0, "Pendente");
        Despesa despesa2 = new Despesa("Computador", 1250.0, "Pendente");
        Meta meta1 = new Meta("Viagem", 5000.0);

        int opcao = 0;

        do {
            System.out.println("\n========================================");
            System.out.println("       MENU - CONTROLE FINANCEIRO       ");
            System.out.println("========================================");
            System.out.println("1 - Ver Informações da Conta 1 (Ana)");
            System.out.println("2 - Ver Informações da Conta 2 (Carlos)");
            System.out.println("3 - Depositar na Conta 1");
            System.out.println("4 - Depositar na Conta 2");           
            System.out.println("5 - Pagar Despesa (Aluguel) com Conta 1");
            System.out.println("6 - Pagar Despesa (Computador) com Conta 2");
            System.out.println("7 - Exibir Relatório Financeiro Completo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Informações da Conta 1 ---");
                    System.out.println("Titular: " + conta.getTitular());
                    System.out.println("Número: " + conta.getNumeroConta());
                    System.out.println("Saldo: R$ " + conta.getSaldo());
                    System.out.println("Limite: R$ " + conta.getLimite());
                    break;

                case 2:
                    System.out.println("\n--- Informações da Conta 2 ---");
                    System.out.println("Titular: " + conta2.getTitular());
                    System.out.println("Número: " + conta2.getNumeroConta());
                    System.out.println("Saldo: R$ " + conta2.getSaldo());
                    System.out.println("Limite: R$ " + conta2.getLimite());
                    break;

                case 3:
                    conta.depositar(receita1.getValor());
                    break;

                case 4:
                    conta2.depositar(receita2.getValor());
                    break;

                case 5:
                    conta.pagarDespesa(despesa1);
                    break;

                case 6:
                    conta2.pagarDespesa(despesa2);
                    break;

                case 7:
                    System.out.println("\n===========================================");
                    System.out.println("            RELATÓRIO FINANCEIRO          ");
                    System.out.println("==========================================");
                    System.out.println("Conta 1 (" + conta.getTitular() + ") -> Saldo: R$ " + conta.getSaldo());
                    System.out.println("Conta 2 (" + conta2.getTitular() + ") -> Saldo: R$ " + conta2.getSaldo());
                    System.out.println("Despesa 'Aluguel' Status: " + despesa1.getStatus());
                    System.out.println("Despesa 'Computador' Status: " + despesa2.getStatus());
                    System.out.println("Meta (" + meta1.getNome() + ") Poupado: R$ " + meta1.getValorPoupado());
                    System.out.println("========================================");
                    break;

                case 0:
                    System.out.println("\nA sair do sistema. Até logo!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
