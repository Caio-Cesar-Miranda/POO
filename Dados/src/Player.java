public class Player {
    private String nome;
    private int valorAposta;
    private int vitorias;
    private String cpf;

    public Player(String nome, int valorAposta, String cpf){
        this.nome = nome;
        this.valorAposta = valorAposta;
        this.cpf = cpf;
        this.vitorias = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorAposta() {
        return valorAposta;
    }

    public void setValorAposta(int valorAposta) {
        this.valorAposta = valorAposta;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public void incrementarVitorias(){
        this.vitorias++;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



}
