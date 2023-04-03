import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Banco b = new Banco();
        int escolha, numConta, numConta1, numConta2;
        double valorTransf;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 2; i++){
            if (b.contas.size() == 0) {
                System.out.println("Nenhuma conta encontrada, adicione uma nova conta");
                b.criarConta();
            } else {
                while (true) {
                    try {
                        System.out.println("");
                        System.out.println("Qual ação deseja realizar?");
                        System.out.println("1- Criar nova conta ");// Criar nova conta
                        System.out.println("2- Fazer depósito ");// Realizar depósito
                        System.out.println("3- Realizar saque ");// Realizar saque
                        System.out.println("4- Realizar transferencia ");// Realizar transferência
                        System.out.println("5- Valor total de saldos de todas as contas ");// Ver o total de todos os saldos
                        System.out.println("6- Verificar extrato da conta");
                        System.out.println("7- Encerrar");
                        System.out.println("");
                        escolha = scanner.nextInt();
    
                        switch (escolha) {
                            case 1:
                                b.criarConta();
                                continue;
                            case 2:
                                System.out.println("Informe o número da conta que deseja fazer o depósito");
                                numConta = scanner.nextInt();
                                System.out.println("Quanto deseja depositar?");
                                double valorDeposito = scanner.nextDouble();
                                b.deposito(valorDeposito, numConta);
                                continue;
                            case 3:
                                System.out.println("Informe o número da conta que deseja fazer o saque");
                                numConta = scanner.nextInt();
                                System.out.println("Quanto deseja sacar?");
                                double valorSaque = scanner.nextDouble();
                                b.saque(valorSaque, numConta);
                                continue;
                            case 4:
                                System.out.println("Insira o numero da conta que fará a transferência: ");
                                numConta1 = scanner.nextInt();
                                System.out.println("Insira o número da conta que receberá o depósito: ");
                                numConta2 = scanner.nextInt();
                                System.out.println("Qual será o valor da transferência?");
                                valorTransf = scanner.nextDouble();
                                b.transferencia(numConta1, numConta2, valorTransf);
                                continue;
                            case 5:
                                b.totalSaldos();
                                continue;
                            case 6:
                                System.out.println("Informe o número da conta que deseja ver o extrato: ");
                                numConta = scanner.nextInt();
                                b.contas.get(numConta - 1).verExtrato();
                                continue;
                            case 7:
                                break;
                            default:
                                System.out.println("Entrada inválida, tente novamente");
                                continue;
                        }
                    } catch (Exception e) {
                        System.out.println("ERRO - Faça sua escolha novamente");
                        continue;
                    }
                    break;
                }
            }
        }scanner.close();
    }
}