
import java.util.ArrayList;
import java.util.Scanner;


public class GerenciarPedido {
    private Scanner sc;
    private ArrayList<Pedido> pedidos;

    public GerenciarPedido() {
        pedidos = new ArrayList<Pedido>();
        sc = new Scanner(System.in);
    }

    public void confirmarEntrega() {
        System.out.println("Digite o código do pedido para confirmar a entrega: ");
        int codigo = sc.nextInt();
        sc.nextLine();


        boolean encontrado = false;
        for (Pedido p : pedidos) {
            if (p.getCodigo() == codigo) {
                if (!p.getStatus().equals("Confirmado")) {
                    p.setStatus("Confirmado");
                    System.out.println("Pedido #" + codigo + " foi confirmado");
                } else {
                    System.out.println("Pedido #" + codigo + " já confirmado");
                }
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("Pedido não localizado");
        }
    }

    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
        System.out.println("Pedido adicionado com sucesso!");

        double soma = pedido.getQtdBotijoes() * 105;

        System.out.println("Total da sua compra é de: " + soma);
    }

    public void listarPedidos(){
        if(pedidos.isEmpty()){
            System.out.println("Nenhum pedido realizado ainda!");
        } else {
            for ( int i = 0; i < pedidos.size(); i++){
                System.out.println("Pedido #" + (i+1));
                pedidos.get(i).exibirPedido();
                System.out.println("----------------------------");
            }
        }
    }

    public void alterarPedido(){
        listarPedidos();
        if (!pedidos.isEmpty()){
            System.out.println("Digite o numero do pedido que deseja alterar: ");
            int indice = sc.nextInt() - 1;
            sc.nextLine();
            if (indice >= 0 && indice < pedidos.size()){
                System.out.println("Digite o novo endereço de entrega: ");
                String novoEnd = sc.nextLine();
                pedidos.get(indice).alterarEndereco(novoEnd);
            } else {
                System.out.println("Numero de pedido inválido");
            }
        }
    }

    public void marcarEntregues() {
        System.out.println("Digite o código do pedido para marcar como entregue: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        boolean encontrado2 = false;
        for (Pedido p : pedidos) {
            if (p.getCodigo() == codigo) {
                if (p.getStatus().equals("Confirmado")) {
                    p.setStatus("Entregue");
                    System.out.println("Pedido com o código #" + codigo + " foi marcado como entregue!");
                } else {
                    System.out.println("O pedido não está marcado como entregue!");
                }
                encontrado2 = true;
                break;
            }
        }
        if (!encontrado2) {
            System.out.println("PEDIDO NÃO LOCALIZADO!");
        }
    }


}

