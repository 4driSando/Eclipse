package ejercicios;

public class Ejercicio01_U08 {

	public static void main(String[] args) {

		Punto p1 = new Punto(10, 5);
		Punto p2 = new Punto(-2, 0);

		Rectangulo r1 = new Rectangulo(p1, p2);
		Linea linea1 = new Linea(p1, p2);

		System.out.println(r1);
		System.out.println("El área del rectángulo es " + r1.calculaArea(p1, p2));
		System.out.println("El perímetro del rectángulo es " + r1.calculaPerimetro(p1, p2));
		System.out.println(linea1);
		System.out.println("La distancia de la linea es" + linea1.calculaDistancia(p1.getX(), p2.getX()));
	}

}
