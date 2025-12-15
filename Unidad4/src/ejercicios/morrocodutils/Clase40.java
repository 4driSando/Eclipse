package ejercicios.morrocodutils;

public class Clase40 {

	int num;

	public static void imprimePares(int num) {
		if (num % 2 == 0) {
			do {
				num -= 2;
				System.out.println("- " + num);
			} while (num >= 2);

		} else if (num == 2 || num == 3) {
			System.out.println("- 1");

		} else {
			num -= 1;
			System.out.println("- " + num);
			do {
				num -= 2;
				System.out.println("- " + num);
			} while (num >= 2);
		}
	}
	
	public static void tablaMultiplicar(int num) {
		for(int i = 1; i < 11; i++) {
			System.out.println(i + " x " + num + " = " + (num*i));
		}
	}
}