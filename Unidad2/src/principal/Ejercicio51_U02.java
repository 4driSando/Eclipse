package principal;

public class Ejercicio51_U02 {

	public static void main(String[] args) {

		int[] num = new int[20];
		int[] resultado = new int[20];
		int indice = 0;

		System.out.println("20 números aleatorios:");
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				resultado[indice++] = num[i];
			}
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				resultado[indice++] = num[i];
			}
		}

		System.out.println("Array con pares primero y luego impares:");
		System.out.print(" | ");
		for (int n : resultado) {
			System.out.print(n + " | ");
		}
	}
}
