import java.util.Scanner;

import model.Conta;
import model.Despesa;
import model.Meta;
import model.Receita;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // --- CONFIGURAÇÃO DA CONTA 1 ---
        System.out.println("=== CONFIGURAÇÃO INICIAL DA CONTA 1 ===");
        System.out.print("Informe o nome do cliente 1: ");
        String nome1 = scanner.nextLine();

        System.out.print("Informe o número da conta 1: ");
        String numeroConta1 = scanner.nextLine();

        System.out.print("Informe o saldo inicial da conta 1 (R$): ");
        double saldoInicial1 = scanner.nextDouble();

        System.out.print("Informe o limite de crédito da conta 1 (R$): ");
        double limite1 = scanner.nextDouble();
        
        // Consome a quebra de linha pendente após nextDouble()
        scanner.nextLine();

        // --- LEITURA DAS 3 DESPESAS DA CONTA 1 ---
        System.out.println("\n--- Inserção de Despesas da Conta 1 ---");

        // Despesa 1 - Conta 1
        System.out.print("Descrição da Despesa 1: ");
        String desc1_c1 = scanner.nextLine();
        System.out.print("Valor da Despesa 1 (R$): ");
        double val1_c1 = scanner.nextDouble();
        scanner.nextLine(); // Limpa buffer
        System.out.print("Status da Despesa 1 (ex: Pendente, Atrasado): ");
        String status1_c1 = scanner.nextLine();
        Despesa despesa1_conta1 = new Despesa(desc1_c1, val1_c1, status1_c1);

        // Despesa 2 - Conta 1
        System.out.println();
        System.out.print("Descrição da Despesa 2: ");
        String desc2_c1 = scanner.nextLine();
        System.out.print("Valor da Despesa 2 (R$): ");
        double val2_c1 = scanner.nextDouble();
        scanner.nextLine(); // Limpa buffer
        System.out.print("Status da Despesa 2: ");
        String status2_c1 = scanner.nextLine();
        Despesa despesa2_conta1 = new Despesa(desc2_c1, val2_c1, status2_c1);

        // Despesa 3 - Conta 1
        System.out.println();
        System.out.print("Descrição da Despesa 3: ");
        String desc3_c1 = scanner.nextLine();
        System.out.print("Valor da Despesa 3 (R$): ");
        double val3_c1 = scanner.nextDouble();
        scanner.nextLine(); // Limpa buffer
        System.out.print("Status da Despesa 3: ");
        String status3_c1 = scanner.nextLine();
        Despesa despesa3_conta1 = new Despesa(desc3_c1, val3_c1, status3_c1);

        // Instancia a Conta 1
        Conta conta = new Conta(numeroConta1, nome1, saldoInicial1, limite1);

        // --- CONFIGURAÇÃO DA CONTA 2 ---
        System.out.println("\n=== CONFIGURAÇÃO INICIAL DA CONTA 2 ===");
        System.out.print("Informe o nome do cliente 2: ");
        String nome2 = scanner.nextLine();

        System.out.print("Informe o número da conta 2: ");
        String numeroConta2 = scanner.nextLine();

        System.out.print("Informe o saldo inicial da conta 2 (R$): ");
        double saldoInicial2 = scanner.nextDouble();

        System.out.print("Informe o limite de crédito da conta 2 (R$): ");
        double limite2 = scanner.nextDouble();
        scanner.nextLine(); // Limpa buffer

        // --- LEITURA DAS 3 DESPESAS DA CONTA 2 ---
        System.out.println("\n--- Inserção de Despesas da Conta 2 ---");

        // Despesa 1 - Conta 2
        System.out.print("Descrição da Despesa 1: ");
        String desc1_c2 = scanner.nextLine();
        System.out.print("Valor da Despesa 1 (R$): ");
        double val1_c2 = scanner.nextDouble();
        scanner.nextLine(); // Limpa buffer
        System.out.print("Status da Despesa 1: ");
        String status1_c2 = scanner.nextLine();
        Despesa despesa1_conta2 = new Despesa(desc1_c2, val1_c2, status1_c2);

        // Despesa 2 - Conta 2
        System.out.println();
        System.out.print("Descrição da Despesa 2: ");
        String desc2_c2 = scanner.nextLine();
        System.out.print("Valor da Despesa 2 (R$): ");
        double val2_c2 = scanner.nextDouble();
        scanner.nextLine(); // Limpa buffer
        System.out.print("Status da Despesa 2: ");
        String status2_c2 = scanner.nextLine();
        Despesa despesa2_conta2 = new Despesa(desc2_c2, val2_c2, status2_c2);

        // Despesa 3 - Conta 2
        System.out.println();
        System.out.print("Descrição da Despesa 3: ");
        String desc3_c2 = scanner.nextLine();
        System.out.print("Valor da Despesa 3 (R$): ");
        double val3_c2 = scanner.nextDouble();
        scanner.nextLine(); // Limpa buffer
        System.out.print("Status da Despesa 3: ");
        String status3_c2 = scanner.nextLine();
        Despesa despesa3_conta2 = new Despesa(desc3_c2, val3_c2, status3_c2);

        // Instancia a Conta 2
        Conta conta2 = new Conta(numeroConta2, nome2, saldoInicial2, limite2);

        // Receitas e Meta
        Receita receita1 = new Receita("Salário 1", 3000.0);
        Receita receita2 = new Receita("Salário 2", 4000.0);
        Meta meta1 = new Meta("Viagem", 5000.0);

        int opcao = 0;

        do {
            System.out.println("\n========================================");
            System.out.println("       MENU - CONTROLE FINANCEIRO       ");
            System.out.println("========================================");
            System.out.println("1 - Ver Informações da Conta 1 (" + conta.getTitular() + ")");
            System.out.println("2 - Ver Informações da Conta 2 (" + conta2.getTitular() + ")");
            System.out.println("3 - Depositar na Conta 1");
            System.out.println("4 - Depositar na Conta 2");           
            System.out.println("5 - Pagar Despesas da Conta 1 (" + conta.getTitular() + ")");
            System.out.println("6 - Pagar Despesas da Conta 2 (" + conta2.getTitular() + ")");
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
                    System.out.println("\n--- Pagamento de Despesas - Conta 1 (" + conta.getTitular() + ") ---");
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
                    System.out.println("\n--- Pagamento de Despesas - Conta 2 (" + conta2.getTitular() + ") ---");
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