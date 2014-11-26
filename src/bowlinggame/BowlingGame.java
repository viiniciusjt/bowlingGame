package bowlinggame;

import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class BowlingGame {

    Integer calcularPontuacao = 0;
    double porcentagem;
    ModeloBowling b = new ModeloBowling();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModeloBowling b = new ModeloBowling();
        Integer pontuacao = 0;
        Scanner in = new Scanner(System.in);
        BowlingGame bg = new BowlingGame();

        for (int rodada = 1; rodada <= 10; rodada++) {
           // pontuacao = 10;
            for (int jogada = 1; jogada <= 2; jogada++) {
                System.out.println("Informe a Pontuação da Jogada: " + jogada + " da rodada " + rodada);
                b.pontuacao = in.nextInt();

                while (b.pontuacao > 10) {
                    System.out.println("Jogada Inválida");
                    System.out.println("Informe a Pontuação da Jogada: " + jogada + " da rodada " + rodada);
                    b.pontuacao = in.nextInt();
                }

                if ((jogada == 1) && (b.pontuacao == 10)) {
                    System.out.println("Strike!");
                    bg.dobrarPontosStrike(b);
                    jogada = jogada + 1;

                    

                }
                
                if ((rodada == 10) && (b.pontuacao == 20)) {

                        System.out.println("Strike na Rodada 10, Jogadas Bônus");
                        bg.jogadaExtra();

                    }
                

                bg.calcularPontos(b.pontuacao);
                System.out.println("Deseja consultar o Score?");
                b.consultarPOntos = in.next().toUpperCase();

                if (b.consultarPOntos.equals("S")) { // Mostra Pontuação Geral
                    System.out.println("Pontuação Atual: " + bg.calcularPontuacao);
                }

            }
        }

    }

    public void jogadaExtra() {
        ModeloBowling b = new ModeloBowling();
        BowlingGame bg = new BowlingGame();
        Scanner in = new Scanner(System.in);
        Integer r = 0;
        for (int jogadaExtra = 1; jogadaExtra <= 2; jogadaExtra++) {
            System.out.println("Informe a Pontuação da Jogada: " + jogadaExtra);
            b.pontuacao = in.nextInt();
            
            
            while (b.pontuacao > 10) {
                System.out.println("Jogada Inválida");
                System.out.println("Informe a Pontuação da Jogada: " + jogadaExtra);
                b.pontuacao = in.nextInt();
            }            

            if (b.pontuacao == 10) {
                r = r + 1;
                System.out.println(" Strike Jogada Extra: " + jogadaExtra);
                bg.dobrarPontosStrike(b);
            }



            
        }

        if (r == 2) {
            System.out.println("Parabens Você fez dois Strikes na jogada Extra ganhou outra jogada: ");
            b.pontuacao = in.nextInt();
            bg.calcularPontos(b.pontuacao);
        }
        
        bg.calcularPontos(b.pontuacao);

    }

    public Integer calcularPontos(Integer pontuacao) {

        calcularPontuacao = calcularPontuacao + pontuacao;
        b.setPontosGeral(calcularPontuacao);;
        return calcularPontuacao;
    }

    public Double calcularPorcentagemdaPontuacao(ModeloBowling b) {
        double porcentagem = 0;
        if (b.getPontosGeral() >= 50) {
            porcentagem = (b.getPontosGeral() * 0.25);
        } else if (b.getPontosGeral() >= 150);
        porcentagem = (b.getPontosGeral() * 0.10);
        return porcentagem;

    }

    public Integer dobrarPontosStrike(ModeloBowling b) {
        b.pontuacao = b.pontuacao + 10;
        return b.pontuacao;
    }

}
