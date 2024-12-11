import java.sql.SQLOutput;

public class C3 extends C1 implements I1, I2 {
    protected double atributoC3;

    public C3(String atributoC1, double atributoC3){
        super(atributoC1);
        this.atributoC3 = atributoC3;
    }

    @Override
    public void metodoI1(){
        System.out.println("Implementação de I1 na classe C3");
    }

    @Override
    public void metodoI2a(){
        System.out.println("Implementação de I2a na classe C3");
    }

    @Override
    public void metodoI2b(){
        System.out.println("Implementação de I2b na classe C3");
    }

    @Override
    public void metodoC1(){
        System.out.println("Método sobreposto da classe C3");
    }

    public void metodoSobrecarga(String mensagem){
        System.out.println("Sobrecarga de método em C3: " + mensagem);
    }

    public void metodoSobrecarga(String mensagem, int valor){
        System.out.println("Sobrecarga de método em C3 com dois parâmetros: " + mensagem + ", " + valor);
    }
}
