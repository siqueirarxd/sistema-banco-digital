package contas;

import models.Cliente;
import models.Conta;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("---------- EXTRATO CONTA CORRENTE ----------");
        System.out.println(String.format("Nome: %s ", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println(String.format("Agência: %s", this.getAgencia()));
        System.out.println(String.format("Conta: %s", this.getConta()));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo ));
        
    }
    
}
