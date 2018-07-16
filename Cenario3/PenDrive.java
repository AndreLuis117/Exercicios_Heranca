
public class PenDrive extends Produto{
	public String capacidade;
	public String fabricante;
	
	public void setCapacidade(String capacidade){
        this.capacidade = capacidade;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String getCapacidade(){
      return capacidade;
    }
    public String getFabricante(){
      return fabricante;
    }
    public String toString(){
    	return "tipo do produto: " + tipoDoProduto + "\nnome do produto: " + nomeDoProduto + "\ncapacidade: " + capacidade +  "\nfabricante: " + fabricante;
    }

}
