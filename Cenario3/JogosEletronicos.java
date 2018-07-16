
public class JogosEletronicos extends Produto {
	public String desenvolvedora;
	public String tempoEstimado;
	
	public void setDesenvolvedora(String desenvolvedora){
        this.desenvolvedora = desenvolvedora;
    }
    public void setTempoEstimado(String tempoEstimado){
        this.tempoEstimado = tempoEstimado;
    }
    public String getDesenvolvedora(){
      return desenvolvedora;
    }
    public String getTempoEstimado(){
      return tempoEstimado;
    }
    public String toString(){
      return "tipo do produto " + tipoDoProduto + "\nnome do produto: " + nomeDoProduto +  "\ntempo estimado: " + tempoEstimado + "\ndesenvolvedora: " + desenvolvedora;
    }
}