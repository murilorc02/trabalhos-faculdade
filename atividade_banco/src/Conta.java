import java.util.ArrayList;

public class Conta {   
    Banco b = new Banco();
    int numero_conta;
    double saldo;
    ArrayList<String> extrato = new ArrayList<String>();
    Pessoa proprietario;

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
    
    public Conta (int numero_conta, double saldo, Pessoa proprietario){
        this.numero_conta = numero_conta;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }

    public void deposito(double valorDeposito){
        saldo = saldo + valorDeposito;
        extrato.add("Depósito de R$ " + valorDeposito);
    }

    public void saque(double valorSaque){
        saldo = saldo - valorSaque;
        extrato.add("Saque de R$ " + valorSaque);
    }

    public void transferencia(int numConta, double valorTransf){
        extrato.add("Transferência de R$ " + valorTransf + " para a conta de número " + (numConta+1));
    }

    public void transferenciaRecebida(int numConta, double valorTransf){
        this.setSaldo(this.saldo + valorTransf);
        extrato.add("Transferência de R$ " + valorTransf + " recebida da conta de número " + (numConta+1));
    }
    public void verExtrato(){
        for (int i = 0; i < extrato.size(); i++){
            System.out.println(extrato.get(i));
        }
        System.out.println("Saldo atual da conta: R$ " + this.getSaldo());
        System.out.println("");
    }
}