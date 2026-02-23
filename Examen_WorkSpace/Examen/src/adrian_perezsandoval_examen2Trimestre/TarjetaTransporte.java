package adrian_perezsandoval_examen2Trimestre;

import java.util.ArrayList;

public class TarjetaTransporte {

	// Atributos de la clase
	private String nombre;
	private int saldo;
	private ArrayList<Integer> historial;

	// Constructor
	public TarjetaTransporte(String nombre, int saldo, ArrayList<Integer> historial) {
		this.nombre = nombre;
		this.saldo = saldo;
		this.historial = historial;
	}

	// Métodos
	/**
	 * Método que suma dinero al saldo
	 * 
	 * @param dinero
	 */
	public void recargarTarjeta(int dinero) {
		setSaldo(this.saldo + dinero);
	}

	/**
	 * Método que resta dinero al saldo ya que se pedirá un negativo
	 * 
	 * @param dinero
	 */
	public void registrarViaje(int dinero) {
		setSaldo(this.saldo + dinero);
	}

	// Getters y Setters
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Integer> getHistorial() {
		return historial;
	}

	public void setHistorial(ArrayList<Integer> historial) {
		this.historial = historial;
	}

	public String getNombre() {
		return nombre;
	}

	// toString
	@Override
	public String toString() {
		return "La tarjeta de " + nombre + " tiene un saldo de " + saldo + " euros y su historial es: " + historial;
	}

}
