import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Pedido {
    private static int contador = 1; // Vai gerar um código único
    private int codigo; // será o código do pedido
    public String status; // status do pedido
    private int qtdBotijoes; // quantidade de botijões pedidos
    private String endEntrega; // endereçço da entrega
    private LocalTime horaCompra;
    private String numCartao;


    public Pedido(LocalTime horaCompra, String endEntrega, int qtdBotijoes, String numCartao) {
        this.codigo = contador++;
        this.status = "pendente";
        this.endEntrega = endEntrega;
        this.horaCompra = horaCompra;
        this.qtdBotijoes = qtdBotijoes;
        this.numCartao = numCartao;
    }

    public void alterarEndereco(String novoEndereco){
        this.endEntrega = novoEndereco;
        System.out.println("Endereço alterado com sucesso para: " + novoEndereco);
    }

    public void exibirPedido(){
        System.out.println("O codigo do pedido é: " + codigo);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora da compra: " + horaCompra.format(formatter));
        System.out.println("Endereço de entrega: " + endEntrega);
        System.out.println("Quantidade de botijões de gás: " + qtdBotijoes);
        System.out.println("O status do pedido é: " + status);
        System.out.println();
        LocalTime horaEntrega = horaCompra.plusHours(6);
        System.out.println("Estimativa para entrega é de " + horaEntrega.format(formatter));
    }


    public int getQtdBotijoes() {
        return qtdBotijoes;
    }
    public void setQtdBotijoes(int qtdBotijoes){
        this.qtdBotijoes = qtdBotijoes;
    }

    public LocalTime getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(LocalTime horaCompra) {
        this.horaCompra = horaCompra;
    }

    public String getEndEntrega(){
        return endEntrega;
    }
    public void setEndEntrega(String endEntrega){
        this.endEntrega = endEntrega;
    }
    public String getNumCartao(){
        return numCartao;
    }
    public void setNumCartao(String numCartao){
        this.numCartao = numCartao;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

}

