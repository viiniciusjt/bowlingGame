package bowlinggame;

import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class BowlingGame {
    Integer aux = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModeloBowling b = new ModeloBowling();
       Integer pontuacao = 0; 
        Scanner in = new Scanner(System.in);
        
        for (int rodada = 1; rodada <= 10; rodada++) {
            pontuacao = 10;
            for (int jogada =1 ; jogada <= 2; jogada++) {
                System.out.println("Informe a Pontuação da Jogada: " + jogada + " da rodada " + rodada);
                b.pontuacao = in.nextInt();
            }
        }
        
       
    }
    
     public void jogadaExtra(){
            
        }
     public Integer calcularPontos(Integer pontuacao) {
         return aux;
     }
     
     
    
}
