package principal;

public class Ejercicio20_U02 {

	public static void main(String[] args) {

		int num1 = 570;
		System.out.println("Retrocediendo de 550 hasta 330");

		while (num1 > 330) {
			num1 -= 20;
			System.out.println("- " + num1);
		}
	}
}