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
        
        Despesa despesa1_conta1 = new Despesa("Aluguel", 1000.0, "Pendente");
        Despesa despesa2_conta1 = new Despesa("Computador", 1250.0, "Pendente");
        Despesa despesa3_conta1 = new Despesa("Empréstimo", 500.0, "Pendente");
        
        Despesa despesa1_conta2 = new Despesa("Plano de Internet", 100.00, "Pendente");
        Despesa despesa2_conta2 = new Despesa("Curso", 199.90, "Atrasado");        
        Despesa despesa3_conta2 = new Despesa("Água", 99.90, "Pendente");
        
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
            System.out.println("5 - Pagar Despesas da Conta 1 (Ana)");
            System.out.println("6 - Pagar Despesas da Conta 2 (Carlos)");
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
              
                    System.out.println("\n--- Pagamento de Despesas - Conta 1 (Ana) ---");
                    System.out.println("1 - " + despesa1_conta1.getDescricao() + " (R$ " + despesa1_conta1.getValor() + ") - Status: " + despesa1_conta1.getStatus());
                    System.out.println("2 - " + despesa2_conta1.getDescricao() + " (R$ " + despesa2_conta1.getValor() + ") - Status: " + despesa2_conta1.getStatus());
                    System.out.println("3 - " + despesa3_conta1.getDescricao() + " (R$ " + despesa3_conta1.getValor() + ") - Status: " + despesa3_conta1.getStatus());
                    System.out.print("Escolha qual despesa pagar: ");
                    int opcaoSub1 = scanner.nextInt();
                    
                    if (opcaoSub1 == 1) conta.pagarDespesa(despesa1_conta1);
                    else if (opcaoSub1 == 2) conta.pagarDespesa(despesa2_conta1);
                    else if (opcaoSub1 == 3) conta.pagarDespesa(despesa3_conta1);
                    else System.out.println("Opção inválida!");
                    break;

                case 6:
                 
                    System.out.println("\n--- Pagamento de Despesas - Conta 2 (Carlos) ---");
                    System.out.println("1 - " + despesa1_conta2.getDescricao() + " (R$ " + despesa1_conta2.getValor() + ") - Status: " + despesa1_conta2.getStatus());
                    System.out.println("2 - " + despesa2_conta2.getDescricao() + " (R$ " + despesa2_conta2.getValor() + ") - Status: " + despesa2_conta2.getStatus());
                    System.out.println("3 - " + despesa3_conta2.getDescricao() + " (R$ " + despesa3_conta2.getValor() + ") - Status: " + despesa3_conta2.getStatus());
                    System.out.print("Escolha qual despesa pagar: ");
                    int opcaoSub2 = scanner.nextInt();
                    
                    if (opcaoSub2 == 1) conta2.pagarDespesa(despesa1_conta2);
                    else if (opcaoSub2 == 2) conta2.pagarDespesa(despesa2_conta2);
                    else if (opcaoSub2 == 3) conta2.pagarDespesa(despesa3_conta2);
                    else System.out.println("Opção inválida!");
                    break;

                case 7:
                    System.out.println("\n===========================================");
                    System.out.println("            RELATÓRIO FINANCEIRO          ");
                    System.out.println("===========================================");
                    System.out.println("Conta 1 (" + conta.getTitular() + ") -> Saldo: R$ " + conta.getSaldo());
                    System.out.println("  - " + despesa1_conta1.getDescricao() + ": " + despesa1_conta1.getStatus());
                    System.out.println("  - " + despesa2_conta1.getDescricao() + ": " + despesa2_conta1.getStatus());
                    System.out.println("  - " + despesa3_conta1.getDescricao() + ": " + despesa3_conta1.getStatus());
                    
                    System.out.println("\nConta 2 (" + conta2.getTitular() + ") -> Saldo: R$ " + conta2.getSaldo());
                    System.out.println("  - " + despesa1_conta2.getDescricao() + ": " + despesa1_conta2.getStatus());
                    System.out.println("  - " + despesa2_conta2.getDescricao() + ": " + despesa2_conta2.getStatus());
                    System.out.println("  - " + despesa3_conta2.getDescricao() + ": " + despesa3_conta2.getStatus());
                    
                    System.out.println("\nMeta (" + meta1.getNome() + ") Poupado: R$ " + meta1.getValorPoupado());
                    System.out.println("==========================================");
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