package utils;

public class Tarifa {

	/**
	 * Constantes públicas para poder utilizarlas desde la clase de prueba
	 */

	public static final int TARIFA_MENSUAL_JOVEN = 10;
	public static final int TARIFA_MENSUAL_JUBILADO = 15;
	public static final int TARIFA_MENSUAL_ESTANDAR = 25;

	/**
	 * 
	 * Calcula el precio mensual según la edad. 
	 * @param edad Edad del usuario.
	 * @return Precio en euros.
	 * 
	 */

	public static int calcularPrecioMensual(int edad) {

		if (edad < 0) // 1
			return -1; // Caso de error
		int precioMensual;
		if (edad < 18) { // 2
			precioMensual = TARIFA_MENSUAL_JOVEN; // Tarifa joven
		} else if (edad >= 65) { // 3
			precioMensual = TARIFA_MENSUAL_JUBILADO; // Tarifa jubilados
		} else { // 4
			precioMensual = TARIFA_MENSUAL_ESTANDAR; // Tarifa estándar
		}
		return precioMensual;
	}

	/**
	 * Calcula el coste de un año completo.
	 * Si el precio mensual es el estándar (25€), se regala un mes (se cobran 11).
	 * @param edad Edad del usuario.
	 * @return Coste total anual.
	 * 
	 */

	public static int calcularPrecioAnual(int edad) {

		int precioMensual = calcularPrecioMensual(edad);
		if (precioMensual == -1) // 5
			return -1; // Caso de error
		if (precioMensual == TARIFA_MENSUAL_ESTANDAR) { // 6
			return precioMensual * 11; // Promoción estándar
		} else { // 7
			return precioMensual * 12; // En tarifas reducidas no aplica la promoción
		}
	}
}