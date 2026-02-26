package ejercicios;

import java.time.LocalDate;

public class ProductoFresco extends Producto {

	// Atributos
	private String paisOrigen;

	// Constructor
	public ProductoFresco(String nombre, LocalDate fechaCad, int numLote, LocalDate fechaEnvasado, String paisOrigen)
			throws Exception {
		super(nombre, fechaCad, numLote, fechaEnvasado);
		setPaisOrigen(paisOrigen);
	}
	
	public ProductoFresco(String nombre, LocalDate fechaCad, int numLote, LocalDate fechaEnvasado)
			throws Exception {
		super(nombre, fechaCad, numLote, fechaEnvasado);
	}

	// toString
	@Override
	public String toString() {
		return "\nPRODUCTO FRESCO\nNombre: " + nombre + "\nPais de Origen: " + paisOrigen + "\nFecha de Caducidad: "
				+ fechaCad + "\nNº de lote: " + numLote + "\nFecha de envasado: " + fechaEnvasado;
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

}
