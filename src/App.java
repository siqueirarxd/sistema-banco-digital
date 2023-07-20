import contas.ContaCorrente;
import contas.ContaPoupanca;
import models.Cliente;
import models.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente jorge = new Cliente("Jorge Masselo", "14698755223");
        Conta cc = new ContaCorrente(jorge);
        Conta cp = new ContaPoupanca(jorge);

        
        
        cc.depositar(100.0);
        cc.transferir(50.0, cp);
        cp.imprimirExtrato();
        
    }
}
