package entities;

public class Conta {
    
    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }

    public Conta(int numero, String nome, double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= (valor + 5.0);
    }

    public String print(){
        return "NUMERO DA CONTA: " + numero + ". NOME DO TITULAR: " + nome + ". SALDO ATUAL: " + saldo;
    }
}
