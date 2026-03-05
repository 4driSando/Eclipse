package figuras;

/**
 * Clase que representa un circulo
 * 
 * @author Sandoval
 * @version 1.0
 */
public class Circulo {

	// Atributos
	/**
	 * rad representa el radio del círculo
	 */
	private double rad;

	/**
	 * Contructor por defecto
	 * @param radio radio del círculo
	 */
	public Circulo(double radio) {
		this.rad = radio;
	}

	/**
	 * Getter del atributo radio
	 * 
	 * @return radio del círculo
	 */
	public double getRad() {
		return rad;
	}

	/**
	 * Setter del atributo radio donde se le puede cambiar el valor
	 * 
	 * @param rad radio del círculo
	 */
	public void setRad(double rad) {
		this.rad = rad;
	}

	/**
	 * Método para imprimir las características del círculo
	 */
	public void imprimir() {
		String color = "rojo";
		System.out.println("Diámetro: " + 2 * rad);
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * rad * rad;
		System.out.println(area);
	}

	/**
	 * Método que compara dos círculos
	 * 
	 * @param otro recoge el círculo 2
	 * @param conDecimales indica si los radios de los círculos tienen decimales
	 * @return true si conDecimales es true y sus radios son iguales o si
	 *         conDecimales es false y la resta de los radios es menor que 1, false
	 *         si conDecimales es true y sus radios no son iguales o si conDecimales 
	 *         es false y la resta de los radios es mayor que 1
	 */
	public boolean esIgual(Circulo otro, boolean conDecimales) {
		double radio1 = this.rad;
		double radio2 = otro.getRad();
		if (conDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
