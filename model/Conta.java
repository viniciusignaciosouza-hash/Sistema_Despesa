package model;

public class Conta {
    private String numeroConta;
    private String titular;
    private double saldo;
    private double limite;

    // Construtor padrão (vazio)
    public Conta() {
    }

    // Construtor com parâmetros
    public Conta(String numeroConta, String titular, double saldo, double limite) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    // Getters e Setters (ATENÇÃO: sem o setSaldo(), conforme a Fase 2)
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Comportamentos da Fase 2
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso na conta de " + titular);
        }
    }

    public boolean sacar(double valor) {
        // Uso do IF para verificar a disponibilidade financeira (Saldo + Limite)
        if (this.saldo + this.limite >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Erro: Saldo e limite insuficientes para o saque de R$ " + valor);
            return false;
        }
    }

    public boolean pagarDespesa(Despesa despesa) {
        if (despesa.getStatus().equals("Paga")) {
            System.out.println("A despesa '" + despesa.getDescricao() + "' já está paga.");
            return false;
        }

        // Tenta efetuar o saque para pagar a despesa
        if (this.sacar(despesa.getValor())) {
            despesa.setStatus("Paga");
            System.out.println("Despesa '" + despesa.getDescricao() + "' paga com sucesso!");
            return true;
        } else {
            System.out.println("Não foi possível pagar a despesa '" + despesa.getDescricao() + "' por falta de saldo/limite.");
            return false;
        }
    }

    public boolean poupar(Meta meta, double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            meta.adicionarValor(valor);
            System.out.println("Guardado R$ " + valor + " para a meta: " + meta.getNome());
            return true;
        } else {
            System.out.println("Erro: Saldo insuficiente para poupar R$ " + valor);
            return false;
        }
    }
}