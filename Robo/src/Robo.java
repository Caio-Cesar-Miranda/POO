
public class Robo {
    private int linha;
    private int coluna;
    private int passo;

    public Robo(int linha, int coluna, int passo) {
        this.linha = linha;
        this.coluna = coluna;
        this.passo = passo;
    }

    public void mostrarPosicaoAtual() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 40; j++) {
                if(i == getLinha() && j == getColuna()) {
                    System.out.print("1");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Coordenada atual: " + getLinha() + ", " + getColuna());
    }

    public void andarFrente(){
        if (this.linha-this.passo < 0){
            this.linha = 0;
        } else {
            this.linha = this.linha - this.passo;
        }
    }

    public void andarTras(){
        if (this.linha + this.passo > 19){
            this.linha = 19;
        } else {
            this.linha = this.linha + this.passo;
        }
    }

    public void andarDireita(){
        if(this.coluna + this.passo > 39){
            this.coluna = 39;
        } else {
            this.coluna = this.coluna + this.passo;
        }
    }

    public void andarEsquerda(){
        if(this.coluna - this.passo < 0 ){
            this.coluna = 0;
        } else {
            this.coluna = this.coluna - this.passo;
        }
    }

    public void mudarPasso(int newPasso){
        setPasso(newPasso);
        System.out.println("Passo foi alterado com sucesso!");
    }


    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getPasso() {
        return passo;
    }

    public void setPasso(int passo) {
        this.passo = passo;
    }

}
