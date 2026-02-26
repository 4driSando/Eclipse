package ejercicios;

import java.time.LocalDate;

public class ProductoCongelado extends Producto {

	// Atributos
	private String paisOrigen;
	private int tiempoReco;

	// Constructor
	public ProductoCongelado(String nombre, LocalDate fechaCad, int numLote, LocalDate fechaEnvasado, String paisOrigen,
			int tiempoReco) throws Exception {
		super(nombre, fechaCad, numLote, fechaEnvasado);
		setPaisOrigen(paisOrigen);
		setTiempoReco(tiempoReco);
	}
	
	public ProductoCongelado(String nombre, LocalDate fechaCad, int numLote, LocalDate fechaEnvasado) throws Exception {
		super(nombre, fechaCad, numLote, fechaEnvasado);
	}

	// toString
	@Override
	public String toString() {
		return "\nPRODUCTO CONGELADO\nNombre: " + nombre + "\nPais de origen " + paisOrigen + "\nFecha de Caducidad: "
				+ fechaCad + "\nNº de lote: " + numLote + "\nFecha de envasado: " + fechaEnvasado
				+ "\nTiempo de mantenimiento recomendado: " + tiempoReco;
	}
	
	// Getters & Setters
	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) throws Exception {
		if (paisOrigen.equals("") || paisOrigen.equals(null)) {
			throw new Exception("País de Origen no puede ser null");
		} else {
			this.paisOrigen = paisOrigen;
		}
	}

	public int getTiempoReco() {
		return tiempoReco;
	}

	public void setTiempoReco(int tiempoReco) throws Exception {
		if (numLote <= 0) {
			throw new Exception("Tiempo de mantenimiento recomendado tiene que ser mayor que 0");
		} else {
			this.tiempoReco = tiempoReco;
		}
	}

}
