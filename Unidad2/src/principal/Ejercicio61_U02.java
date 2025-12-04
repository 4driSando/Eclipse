package principal;

public class Ejercicio61_U02 {

	/*
	 * Realiza una función que elimine los decimales de un número decimal. Pruébalo
	 * generando un número aleatorio con decimales y mostrando por pantalla el
	 * número sin decimales.
	 */

	/**
	 * Esta función recoge un número decimal y elimina los decimales pasándolo a un
	 * número entero
	 * @param deciMal
	 * @return deciMal sin decimales
	 */

	public static int eliminaDecimal(double deciMal) {
		int sinDecimal = (int) deciMal;
		return sinDecimal;
	}

	public static void main(String[] args) {
		double deciMal = (double) (Math.random() * 10 + 1);

		System.out.println("Número decimal aleatorio: " + deciMal);
		System.out.println("Número decimal aleatorio sin la parte decimal:" + eliminaDecimal(deciMal));
	}

}
