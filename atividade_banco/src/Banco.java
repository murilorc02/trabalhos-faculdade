import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    Scanner scan = new Scanner(System.in);
    public ArrayList <Conta> contas = new ArrayList<Conta>();
    Conta c;
    int idade;
    Pessoa p;
    String nome, cpf, rg;
    double totalSaldos;

    public void criarConta(){
        System.out.println("Nome do proprietário: ");
        nome = scan.nextLine();
        System.out.println("Idade do proprietário: ");
        idade = scan.nextInt();
        System.out.println("CPF do proprietário (apenas números): ");
        cpf = scan.nextLine();
        scan.nextLine();
        System.out.println("RG do proprietário (apenas números): ");
        rg = scan.nextLine();
        p = new Pessoa(nome, idade, cpf, rg);
        c = new Conta(contas.size() + 1, 0, p);
        contas.add(c);
        System.out.println("Conta criada com sucesso");
    }

    public void totalSaldos(){
        totalSaldos = 0;
        for(int i = 0; i < contas.size(); i++){
            totalSaldos = totalSaldos + contas.get(i).getSaldo();
        }
        System.out.println("Total saldos: R$ " + totalSaldos);
    }

    public void transferencia(int conta1, int conta2, double valorTransf){
        try {
            if(contas.get(conta1 - 1).getSaldo() > valorTransf){
                contas.get(conta2 - 1).transferenciaRecebida(conta1 - 1, valorTransf);
                contas.get(conta1 - 1).setSaldo(contas.get(conta1 - 1).getSaldo() - valorTransf);
                contas.get(conta1 - 1).transferencia(conta2 - 1, valorTransf);
                System.out.println("Transferência concluída");
            } else {
                System.out.println("Saldo insuficiente para transferência");
            }
        } catch (Exception e) {
            System.out.println("ERRO - Conta não encontrada, tente novamente");
        }
    }

    public void deposito(double valorDeposito, int numConta){
        try {
            contas.get(numConta - 1).deposito(valorDeposito);
            System.out.println("Depósito realizado com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO - Conta não encontrada, tente novamente");
        }
    }

    public void saque(double valorSaque, int numConta){
        try {
            if(valorSaque <= contas.get(numConta-1).getSaldo()){
                contas.get(numConta - 1).saque(valorSaque);
                System.out.println("Saque realizado com sucesso");  
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } catch (Exception e) {
            System.out.println("ERRO - Conta não encontrada, tente novamente");
        }

    }
}