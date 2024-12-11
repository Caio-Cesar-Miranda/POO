public class Main {
    public static void main(String[] args) {
        C2 objetoC2 = new C2 ("Atributo de C1 em C2", 10);
        objetoC2.metodoC1();
        objetoC2.metodoC2();

        C3 objetoC3 = new C3 ("Atributo C1 em C3", 5.5);
        objetoC3.metodoC1();
        objetoC3.metodoI1();
        objetoC3.metodoI2a();
        objetoC3.metodoI2b();
        objetoC3.metodoSobrecarga("Teste de sobrecarga");
        objetoC3.metodoSobrecarga("Teste com dois parâmetros", 100);

        C4 objetoC4 = new C4 ("Atributo de C1 em C4", 20, "Atributo de C4");
        objetoC4.metodoC1();
        objetoC4.metodoC4();

        C5 objetoC5 = new C5 ("Atributo de C1 em C5", 30, true);
        objetoC5.metodoC1();
        objetoC5.metodoI1();
        objetoC5.metodoC5();
    }
}