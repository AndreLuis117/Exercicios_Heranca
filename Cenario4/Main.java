import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);

		SolidoGeometrico s = new SolidoGeometrico();			
		Impressora print = new Impressora();
		print.perguntarNome();
		s.nome = s1.next();
		switch (s.nome) {
		case "Cubo":
			Cubo c = new Cubo();
			print.perguntarAresta();
			c.setAresta(s1.nextDouble());
			System.out.println(c.calcularVolume());
			break;
		case "Retangulo":
			Retangulo r = new Retangulo();
			print.perguntarAreaDaBase();
			r.setAreaDaBase(s1.nextDouble());
			print.perguntarAltura();
			r.setAltura(s1.nextDouble());
			System.out.println(r.calcularVolume());
			break;
		case "Piramide":
			Piramide p = new Piramide();
			print.perguntarAreaDaBase();
			p.setAreaDaBase(s1.nextDouble());
			print.perguntarAltura();
			p.setAltura(s1.nextDouble());
			System.out.println(p.calcularVolume());
			break;
		case "Cilindro":
			Cilindro ci = new Cilindro();
			print.perguntarAreaDoCirculo();
			ci.setAreaDoCirculo(s1.nextDouble());
			print.perguntarAltura();
			ci.setAltura(s1.nextDouble());
			System.out.println(ci.calcularVolume());
			break;
		default:
			System.out.println("Digite um sólido válido ");
			break;
		}
	}

}
