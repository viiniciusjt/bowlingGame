import bowlinggame.BowlingGame;
import bowlinggame.ModeloBowling;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vinicius
 */
public class Testes {
    
    
@Test
public void testaPontuacao() {
    BowlingGame bg = new BowlingGame();
    
    assertEquals(11, bg.calcularPontos(11), 0.0001);
           
}


@Test
public void testaPontuacaoFinalPorcentagem() {
    BowlingGame bg = new BowlingGame();
    ModeloBowling b = new ModeloBowling();
    b.setPontosGeral(150);
    
    assertEquals(15, bg.calcularPorcentagemdaPontuacao(b), 0.001);
}
      
    
}
