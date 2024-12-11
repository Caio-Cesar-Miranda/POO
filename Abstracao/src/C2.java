import java.sql.SQLOutput;

public class C2 extends C1{
    protected int atributoC2;

    public C2(String atributoC1, int atributoC2){
        super(atributoC1);
        this.atributoC2 = atributoC2;
    }

    public void metodoC2(){
        System.out.println("Método ca classe C2 ");
    }

    @Override
    public void metodoC1(){
        System.out.println("Método sobreposto da classe C2");
    }
}
