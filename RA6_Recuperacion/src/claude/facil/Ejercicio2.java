package claude.facil;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Calcular suma y media

		int[] array = claude.facil.Ejercicio1.generaArray(4, 1, 5);

		for (int i : array) {
			System.out.print(i + " ");
		}

		sumayMedia(array);

	}

	public static void sumayMedia(int[] array) {
		int sumaTotal = 0;

		for (int i = 0; i < array.length; i++) {
			sumaTotal = array[i] + sumaTotal;
		}

		Double media = (double) (sumaTotal / array.length);

		System.out.println("\nSuma: " + sumaTotal + " | Media: " + media);
	}

}
