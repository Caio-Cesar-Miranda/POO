import java.util.Random;

public class Dados {
    private static final Random random = new Random();

    //Lança os dados e retorna um valor aleatorio de 1 a 6
    public int roll(){
        return random.nextInt(6) + 1; //valores de 1 a 6
    }
}
