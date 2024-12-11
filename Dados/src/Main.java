
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();

        while(true){
            System.out.println("------------Jogo de dados ----------------");
            game.exibirRanking();
            System.out.println();
            System.out.println("1- Adicionar jogadores");
            System.out.println("2- Iniciar jogo");
            System.out.println("3- Sair");
            System.out.println("Escolha uma opção acima: ");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1){
                System.out.println("Nome do jogador: ");
                String nome = sc.nextLine();
                System.out.println("Digite o CPF do jogador: ");
                String cpf = sc.nextLine();
                System.out.println("Digite o valor da aposta (1-12): ");
                int valorAposta = sc.nextInt();
                sc.nextLine();

                if(valorAposta < 1 || valorAposta > 12) {
                    System.out.println("Aposta inválida. Escolha outro número");
                } else {
                    Player novoJogador = new Player(nome, valorAposta, cpf);
                    if (game.adicionarJogador(novoJogador)) {
                        System.out.println("Jogador adicionado com sucesso!");
                        System.out.println();
                    } else {
                        System.out.println("Erro ao adicionar o jogador!");
                    }
                }
                } else if (op == 2) {
                    game.startGame();
                } else if (op == 3) {
                    System.out.println("Encerrando programa...");
                    break;
                } else {
                    System.out.println("Opção inválida.");
                }
            }

            sc.close();
        }



    }
