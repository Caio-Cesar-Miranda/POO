import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Robo r1 = new Robo(0,0, 1);
        Scanner sc = new Scanner(System.in);
        int op = 0;

        r1.mostrarPosicaoAtual();

        do {
            System.out.println();
            System.out.println("1- Andar PARA FRENTE ");
            System.out.println("2- ANDAR PARA TRÁS ");
            System.out.println("3- ANDAR PARA DIREITA ");
            System.out.println("4- ANDAR PARA ESQUERDA ");
            System.out.println("5- MUDAR PASSO ");
            System.out.println("6- SAIR DO SISTEMA");
            System.out.print("Digite para onde quer mover o robo: ");
            op = sc.nextInt();
            System.out.println();
            switch (op){
                case 1:
                    r1.andarFrente();
                    r1.mostrarPosicaoAtual();
                    break;
                case 2:
                    r1.andarTras();
                    r1.mostrarPosicaoAtual();
                    break;
                case 3:
                    r1.andarDireita();
                    r1.mostrarPosicaoAtual();
                    break;
                case 4:
                    r1.andarEsquerda();
                    r1.mostrarPosicaoAtual();
                    break;
                case 5:
                    System.out.println("Digite um numero para mudar o passo do robo: ");
                    int newPasso = sc.nextInt();
                    r1.mudarPasso(newPasso);
                case 6:
                    System.out.println("FIM DO PROGRAMA");
                    break;
                default:
                    System.out.println("Numero digitado é invalido!!");
            }



        } while (op != 6);











        sc.close();
    }
}