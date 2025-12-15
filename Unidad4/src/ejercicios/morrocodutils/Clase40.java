package ejercicios.morrocodutils;

public class Clase40 {

	int num;

	public static void imprimePares(int num1) {
		if (num1 % 2 == 0) {
			do {
				num1 -= 2;
				System.out.println("- " + num1);
			} while (num1 >= 2);

		} else if (num1 == 2 || num1 == 3) {
			System.out.println("- 1");

		} else {
			num1 -= 1;
			System.out.println("- " + num1);
			do {
				num1 -= 2;
				System.out.println("- " + num1);
			} while (num1 >= 2);
		}
	}

	public static void tablaMultiplicar(int num2) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " x " + num2 + " = " + (num2 * i));
		}
	}

	public static void mostrarFibonacci(int num3) {
		int pnum = 0, snum = 1, numveces = 0;

		do {
			System.out.println(pnum);
			int suma = pnum + snum;
			pnum = snum;
			snum = suma;
			numveces++;
		} while (numveces < num3);
	}

	public static double areaRectangulo(double ancho, double alto) {
		return ancho * alto;
	}

	public static boolean esFechaCorrecta(int dia, int mes, int anio) {
		boolean correcto = false;
		int maxDias;

		if (anio > 0 && mes >= 1 && mes <= 12 && dia >= 1) {
			if (mes == 2) {
				if ((anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0))) {
					maxDias = 29;
				} else {
					maxDias = 28;
				}
			} else {
				maxDias = 30;
			}

			if (dia <= maxDias) {
				correcto = true;
			}
		}
		return correcto;
	}

}