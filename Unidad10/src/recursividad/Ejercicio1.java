package recursividad;

public class Ejercicio1 {

	public static void main(String[] args) {

		resta(20);

	}

	static void resta(int i) {
		System.out.println(i);

		if (i == 0) {
			System.out.println("Terminado");
		} else {
			resta(i - 1);
		}
	}

}
