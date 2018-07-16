public class Cubo extends SolidoGeometrico {
	private double aresta;
	
	public double calcularVolume() {
		setVolume(getAresta() * getAresta() * getAresta());
		return getVolume();
		
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	
}
