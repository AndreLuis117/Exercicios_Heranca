
public class Main {
	public static void main(String[] args) {
		Produto p = new Produto();
		CdMusica cd = new CdMusica();
	    cd.setTipoDoProduto("CD");
	    cd.setNomeDoProduto("Festival Summer");
	    cd.setNumeroFaixas(10);
	    cd.setProdutora("Sony Music");
	    
	    JogosEletronicos j = new JogosEletronicos();
	    j.setTipoDoProduto("Jogos Eletronicos");
	    j.setDesenvolvedora("Microsoft");
	    j.setNomeDoProduto("Black ops 2");
	    j.setTempoEstimado("10 horas");
	    
	    PenDrive pd = new PenDrive();
	    pd.setTipoDoProduto("Pen-Drive");
	    pd.setNomeDoProduto("Pen-Drive Supremo");
	    pd.setCapacidade("16 gb");
	    pd.setFabricante("Mercur");

	    Produto[] lista = new Produto[4];
	    lista[0] = p;
	    lista[1] = cd;
	    System.out.println(lista[1]);
	    lista[2] = j;
	    System.out.println(lista[2]);
	    lista[3] = pd;
	    System.out.println(lista[3]);
	}
}
