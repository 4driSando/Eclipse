package principal;

public class Ejercicio59_U02 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego
		 * introducirá en el primer array todos los valores del 1 al 100. Por último,
		 * deberá copiar todos los valores del primer array al segundo array en orden
		 * inverso, y mostrar ambos por pantalla.
		 * 
		 * Crear dos arrays de int[100] array1 valores del 1 al 100 array2 copiar array1
		 * y mostrarlo a la inversa
		 */

		int[] array1 = new int[100];
		int[] array2 = new int[100];
		int contador = 1;

		for (int i = 0; i < array1.length; i++) {
			array1[i] = contador++;
		}

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " | ");
		}

		for (int i = array2.length - 1; i >= 0; i--) {
			array2[i] = array1[i];
		}

		System.out.println("");
		for (int i = array2.length - 1; i >= 0; i--) {
			System.out.print(array2[i] + " | ");
		}

	}

}
