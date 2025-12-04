package principal;

public class Ejercicio33_U02 {

	public static void main(String[] args) {

		int pares = 2;
		int impares = 1;
		int sumapares = 0;
		int sumaimpares = 0;

		System.out.println("Suma de todos los pares hasta 40:");
		do {
			System.out.println("-" + sumapares);
			sumapares += pares;
			pares += 2;
		} while (pares < 40);

		System.out.println("Suma de todos los impares hasta 40:");
		do {
			System.out.println("-" + sumaimpares);
			sumaimpares += impares;
			impares += 2;
		} while (impares < 40);
	}
}