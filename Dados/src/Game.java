import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game {
    private ArrayList<Player> jogadores;
    private Dados dado1;
    private Dados dado2;
    private HashMap<String, Player> ranking; //Usado para o ranking de vitórias
    private static final String RANKING_FILE = "C:\\Users\\user\\Desktop\\ADS (UFRN)\\2º PERIODO\\POO\\Projetos\\ranking.txt";

    public Game(){
        this.jogadores = new ArrayList<>();
        this.dado1 = new Dados();
        this.dado2 = new Dados();
        this.ranking = new HashMap<>();
        carregarRanking();
    }

    //Exibir o TOP 5
    public void exibirRanking(){
        if (ranking.size() < 5){
            System.out.println("Top 5 ainda incompleto!! ");
            return;
        }
        System.out.println("---------------TOP 5------------------");
        ranking.values().stream()
                .sorted((p1, p2) -> Integer.compare(p2.getVitorias(), p1.getVitorias()))
                .limit(5)
                .forEach(player -> System.out.println(player.getNome() + " - vitórias: " + player.getVitorias()));
        System.out.println("-------------------------");
    }

    //Adicionando jogadores e garantindo as regras
    public boolean adicionarJogador(Player jogador){
        if (jogadores.size() >= 11) {
            System.out.println("Máximo de jogadores atingido. ");
            return false;
        }
        for( Player j : jogadores){
            if(j.getValorAposta() == jogador.getValorAposta()){
                System.out.println("Numero já apostado por outro jogador. Escolha outro número para apostar.");
                return false;
            }
        }
        jogadores.add(jogador);
        return true;
    }

    public void startGame(){
        int result = dado1.roll() + dado2.roll();
        System.out.println("Resultado do lançamento dos dados: " + result);

        Player winner = null;
        for( Player jogador : jogadores){
            if(jogador.getValorAposta() == result){
                winner = jogador;
                break;
            }
        }
        if (winner != null){
            System.out.println("Vencedor " + winner.getNome());
            winner.incrementarVitorias();
            ranking.put(winner.getCpf(), winner);
            atualizarTop5();
            salvarRanking();
        } else {
            System.out.println("Máquina venceu!");
        }
        jogadores.clear();
    }

    private void atualizarTop5(){
        List<Player> topPlayers = new ArrayList<>(ranking.values());
        topPlayers.sort((p1, p2) -> Integer.compare(p2.getVitorias(), p1.getVitorias()));

        ranking.clear();
        for(int i = 0; i < Math.min(5, topPlayers.size()); i++){
            Player jogador = topPlayers.get(i);
            ranking.put(jogador.getCpf(), jogador);
        }
    }

    //Carregando ranking de um arquivo .txt
    private void carregarRanking(){
        File file = new File(RANKING_FILE);
        if(!file.exists()){
            return; //Arquivo não existe ainda
        }

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                String[] partes = line.split("-");
                String nome = partes[0];
                String cpf = partes [1];
                int vitorias = Integer.parseInt(partes[2]);
                Player jogador = new Player(nome, 0, cpf);
                jogador.setVitorias(vitorias);
                ranking.put(cpf, jogador);
            }
        } catch (IOException e){
            System.out.println("Erro ao carregar o ranking: " + e.getMessage());
        }
    }

    //Salvando o ranking em um arquivo .txt
    private void salvarRanking(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(RANKING_FILE))){
            for (Player jogador : ranking.values()){
                bw.write(jogador.getNome() + "-" + jogador.getCpf() + "-" + jogador.getVitorias());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(" Erro ao salvar o ranking: " + e.getMessage());
        }
    }




}

