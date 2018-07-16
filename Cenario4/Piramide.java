
public class Piramide extends SolidoGeometrico {
	public double calcularVolume () {
		setVolume((getAreaDaBase()* getAltura())/3);
		return getVolume();
	}

}
