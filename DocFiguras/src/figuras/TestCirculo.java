package figuras;

/**
 * Clase main prueba de la clase Circulo
 * @author Sandoval
 * @version 1.0
 */
public class TestCirculo {
	
	/**
	 * Contructor por defecto obligatorio
	 */
	public TestCirculo() {
		
	}
	
	/**
	 * Main
	 * @param args args
	 */
	public static void main(String[] args) {
		
		// Declaración de círculos
		Circulo c1 = new Circulo(5.5);
		Circulo c2 = new Circulo(10.1);
		Circulo c3 = new Circulo(10.9);

		// if que comprueba círculo1 con círculo2
		if (c1.esIgual(c2, false)) {
			System.out.println("c1 y c2: iguales sin considerar decimales");
		} else {
			System.out.println("c1 y c2: distintos sin considerar decimales");
		}
		
		// if que comprueba círculo2 con círculo3
		if (c2.esIgual(c3, true)) {
			System.out.println("c2 y c3: iguales considerando decimales");
		} else {
			System.out.println("c2 y c3: distintos considerando decimales");
		}
		
		// if que comprueba círculo1 con círculo3
		if (c1.esIgual(c3, false)) {
			System.out.println("c1 y c3: iguales sin considerar decimales");
		} else {
			System.out.println("c1 y c3: distintos sin considerar decimales");
		}
	}
}

