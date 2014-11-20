package bowlinggame;

import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class BowlingGame {

    Integer calcularPontuacao = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModeloBowling b = new ModeloBowling();
        Integer pontuacao = 0;
        Scanner in = new Scanner(System.in);
        BowlingGame bg = new BowlingGame();

        for (int rodada = 1; rodada <= 10; rodada++) {
            pontuacao = 10;
            for (int jogada = 1; jogada <= 2; jogada++) {
                System.out.println("Informe a Pontuação da Jogada: " + jogada + " da rodada " + rodada);
                b.pontuacao = in.nextInt();

                while (b.pontuacao > 10) {
                    System.out.println("Jogada Inválida");
                    System.out.println("Informe a Pontuação da Jogada: " + jogada + " da rodada " + rodada);
                    b.pontuacao = in.nextInt();
                }
                
                bg.calcularPontos(b.pontuacao);
                
                System.out.println("Deseja consultar o Score?");
                b.consultarPOntos = in.next().toUpperCase();
                
                if (b.consultarPOntos.equals("S")){ // Mostra Pontuação Geral
                    System.out.println("Pontuação Atual: " + bg.calcularPontuacao);
                }
            }
        }
        
        

    }

    public void jogadaExtra() {

    }

    public Integer calcularPontos(Integer pontuacao) {
        calcularPontuacao = calcularPontuacao + pontuacao;
        return calcularPontuacao;
    }

}
