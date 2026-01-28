package ejercicios;

public class Ejercicio06_U07 {

	public static void main(String[] args) {

		try {
			Gato inaki = new Gato("Iñaki", -2);
			System.out.println(inaki);
		} catch (ArithmeticException e) {
			System.err.println("Error: " + e.getMessage());
		}

		try {
			Gato lhanz = new Gato("Lhanzz", 8);
			System.out.println(lhanz);
		} catch (ArithmeticException e) {
			System.err.println("Error: " + e.getMessage());
		}

		try {
			Gato sando = new Gato("Sandoval", 19);
			System.out.println(sando);
		} catch (ArithmeticException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
