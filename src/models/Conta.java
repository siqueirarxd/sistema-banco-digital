package models;

public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;
    protected String tipoConta;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getConta() {
        return conta;
    }

    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado.");
            System.out.println(String.format("Saldo: R$ %.2f", saldo));
        }
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito realizado.");
        System.out.println(String.format("Saldo: R$ %.2f", saldo));
    }

    public void transferir(double valor, Conta contaDestino){
        if(valor > saldo){
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência realizada.");
            System.out.println(String.format("Saldo: R$ %.2f", saldo));
        }
    }


    public void imprimirExtrato(){
        
    }


    








}