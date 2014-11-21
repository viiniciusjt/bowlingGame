package bowlinggame;

/**
 *
 * @author Vinicius
 */
public class ModeloBowling {

    public Integer pontuacao;
    public String consultarPOntos;
    public Integer pontosGeral;
    public Integer calcularPontuacao = 0;
    

    public ModeloBowling() {
    }

    public ModeloBowling(Integer pontuacao, String consultarPOntos, Integer pontosGeral) {
        this.pontuacao = pontuacao;
        this.consultarPOntos = consultarPOntos;
        this.pontosGeral = pontosGeral;
    }
    
    

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getConsultarPOntos() {
        return consultarPOntos;
    }

    public void setConsultarPOntos(String consultarPOntos) {
        this.consultarPOntos = consultarPOntos;
    }

    public Integer getPontosGeral() {
        return pontosGeral;
    }

    public void setPontosGeral(Integer pontosGeral) {
        this.pontosGeral = pontosGeral;
    }

   
    
    
    
    

}
