
import java.util.Scanner;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        GerenciarPedido gerenciarPedido = new GerenciarPedido();


        do {
            System.out.println();
            System.out.println("------MENU---------");
            System.out.println("1- FAZER PEDIDO");
            System.out.println("2- ALTERAR PEDIDO");
            System.out.println("3- CONFIRMAR PEDIDO");
            System.out.println("4- VER PEDIDOS ENTREGUES");
            System.out.println("5- VER PEDIDOS CONFIRMADOS");
            System.out.println("6- SAIR");
            System.out.print("Escolha uma das opções acima: ");
            op = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (op) {
                case 1:
                    System.out.println("Digite o endereço para a entrega do botijão de gás: ");
                    String endereco = sc.nextLine();
                    LocalTime horaAtual = LocalTime.now();
                    System.out.println("Qual a quantidade de botijoes de gás você deseja? ");
                    System.out.println("PREÇO: R$105");
                    int qtdGas = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Digite o numero do cartão de crédito: ");
                    String numCartao = sc.nextLine();



                    Pedido novoPedido = new Pedido(horaAtual, endereco, qtdGas, numCartao);
                    gerenciarPedido.addPedido(novoPedido);

                    break;
                case 2:
                    gerenciarPedido.alterarPedido();
                    break;
                case 3:
                    gerenciarPedido.confirmarEntrega();
                    break;
                case 4:
                    gerenciarPedido.marcarEntregues();
                    break;
                case 5:
                    gerenciarPedido.listarPedidos();
                    break;
                case 6:
                    System.out.println("FIM DO PROGRAMA");
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!");

            }
        } while (op != 6);



        sc.close();
    }
}