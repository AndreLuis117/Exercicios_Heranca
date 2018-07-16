
public class CdMusica extends Produto{
	public int numeroFaixas;
	public String produtora;

    public void setNumeroFaixas(int numeroFaixas){
        this.numeroFaixas = numeroFaixas;
    }
    public void setProdutora(String produtora){
        this.produtora = produtora;
    }
    public int getNumeroFaixas(){
      return numeroFaixas;
    }
    public String getProdutora(){
      return produtora;
    }
    public String toString(){
    	return "tipo do produto: " + tipoDoProduto + "\nnome do produto: " + nomeDoProduto + "\ncd: " + numeroFaixas +  "\nprodutora: " + produtora;
    }
}
