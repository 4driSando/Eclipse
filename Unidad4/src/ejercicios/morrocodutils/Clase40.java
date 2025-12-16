package ejercicios.morrocodutils;

public class Clase40 {

	// Función que recoge un parámetro he imprime todos los pares hasta él
	public static int imprimePares(int num) {
	    if (num % 2 != 0) {
	        num--;
	    }
	    return num - 2;
	}

	// Función que recoge un parámetro y te muestra la tabla de multiplicar
	public static int tablaMultiplicar(int num, int num2) {
		return num * num2;
	}

	// Función que de muestra fibonacci hasta X veces
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

	// Función que calcula el área de un rectángulo
	public static double areaRectangulo(double ancho, double alto) {
		return ancho * alto;
	}

	public static double areaRectangulo(double ancho) {
		return ancho * 2;
	}

	// Función que comprueba si la fecha introducida es correcta
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