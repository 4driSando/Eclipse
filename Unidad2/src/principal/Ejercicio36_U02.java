package principal;

public class Ejercicio36_U02 {

	public static void main(String[] args) {

		int num;

		for (num = 0; num <= 10; num++) {
			if (num % 2 != 0) {
				continue;
			}
			System.out.println("- " + num);
		}
	}
}