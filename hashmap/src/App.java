import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Colecao c = new Colecao();
        Scanner scanner = new Scanner(System.in);
        int menu, marca, ano;
        String nomeV;

        while (true) {

            System.out.println("---- SELECIONE UMA OPÇÃO ----");
            System.out.println("1. Adicionar veículo à lista");
            System.out.println("2. Buscar veículo na lista");
            System.out.println("3. Mostrar todos os veículos");
            System.out.println("4. Sair do programa");
            System.out.println("-----------------------------");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Selecione a marca do veículo (1 - VOLKSWAGEN, 2 - FORD, 3 - CHEVROLET, 4 - NISSAN)");
                    marca = scanner.nextInt();
                    System.out.println("Digite o nome do veículo: ");
                    scanner.nextLine();
                    nomeV = scanner.nextLine();
                    System.out.println("Digite o ano do veículo: ");
                    ano = scanner.nextInt();

                    switch (marca) {
                        case 1:
                            c.addVeiculoMarca(nomeV, ano, Marca.Volkswagen);
                            break;
                        case 2:
                            c.addVeiculoMarca(nomeV, ano, Marca.Ford);
                            break;
                        case 3:
                            c.addVeiculoMarca(nomeV, ano, Marca.Chevrolet);
                            break;
                        case 4:
                            c.addVeiculoMarca(nomeV, ano, Marca.Nissan);
                            break;
                        default:
                            System.out.println("Valor inválido");
                            break;
                    }
                    continue;
                case 2:
                    System.out.println("Selecione a marca do veículo (1 - VOLKSWAGEN, 2 - FORD, 3 - CHEVROLET, 4 - NISSAN)");
                    marca = scanner.nextInt();
                    System.out.println("Digite o nome do veículo que deseja encontrar: ");
                    scanner.nextLine();
                    nomeV = scanner.nextLine();

                    switch (marca) {
                        case 1:
                            c.filtro(Marca.Volkswagen, nomeV);
                            break;
                        case 2:
                            c.filtro(Marca.Ford, nomeV);
                            break;
                        case 3:
                            c.filtro(Marca.Chevrolet, nomeV);
                            break;
                        case 4:
                            c.filtro(Marca.Nissan, nomeV);
                            break;
                        default:
                            System.out.println("Valor inválido");
                            break;
                    }
                    continue;
                case 3:
                    c.mostrarTodos();
                    continue;
                case 4:
                    break;
                default:
                    System.out.println("Valor inválido, tente novamente");
                    continue;
            }
            break;
        }
        scanner.close();
    }
}