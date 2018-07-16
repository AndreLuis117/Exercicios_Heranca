
public class Cilindro extends SolidoGeometrico {
	private double areaDoCirculo;

	public double getAreaDoCirculo() {
		return areaDoCirculo;
	}

	public void setAreaDoCirculo(double areaDoCirculo) {
		this.areaDoCirculo = areaDoCirculo;
	}
	
	public double calcularVolume() {
		setVolume(getAreaDoCirculo() * getAltura());
		return getVolume();
	}
	

}
