
public class Retangulo extends SolidoGeometrico {
	public double calcularVolume() {
		setVolume(getAreaDaBase()* getAltura());
		return getVolume();
		
	}

}
