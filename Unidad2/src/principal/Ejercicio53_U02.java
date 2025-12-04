package principal;

public class Ejercicio53_U02 {

	public static void main(String[] args) {

		int[] numeros = new int[50];
		int numMax = 0;
		int numMin = 1000;

		System.out.println("Aquí van 50 números aleatorios del 1 al 1000");

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 1000 - 1);
		}
		System.out.print("| ");

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " | ");
			
			if (numeros[i] < numMin) {
				numMin = numeros[i];
			} else if (numeros[i] > numMax) {
				numMax = numeros[i];
			}
		}

		for (int j = 0; j < numeros.length; j++) {
			System.out.println("\nEl número menor es " + numMin);
			System.out.println("El número mayor es " + numMax);
			break;
		}
	}
}