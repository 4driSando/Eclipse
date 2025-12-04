package principal;

public class Ejercicio21_U02 {

	public static void main(String[] args) {

		int num1 = 570;
		System.out.println("Retrocediendo desde 550 hasta 330:");

		do {
			num1 -= 20;
			System.out.println("- " + num1);
		} while (num1 > 330);
	}
}