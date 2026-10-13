package model;

public class Meta {
    private String nome;
    private double valorObjetivo;
    private double valorPoupado;

    public Meta() {
    }

    public Meta(String nome, double valorObjetivo) {
        this.nome = nome;
        this.valorObjetivo = valorObjetivo;
        this.valorPoupado = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorObjetivo() {
        return valorObjetivo;
    }

    public void setValorObjetivo(double valorObjetivo) {
        this.valorObjetivo = valorObjetivo;
    }

    public double getValorPoupado() {
        return valorPoupado;
    }

    public void adicionarValor(double valor) {
        this.valorPoupado += valor;
    }
}