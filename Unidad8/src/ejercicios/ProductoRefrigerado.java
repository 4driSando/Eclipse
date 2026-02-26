package ejercicios;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {

	// Atributos
	private String codOrg;
	private int tiempoReco;

	// Constructor
	public ProductoRefrigerado(String nombre, LocalDate fechaCad, int numLote, LocalDate fechaEnvasado, String codOrg,
			int tiempoReco) throws Exception {
		super(nombre, fechaCad, numLote, fechaEnvasado);
		setCodOrg(codOrg);
		setTiempoReco(tiempoReco);
	}

	// toString
	@Override
	public String toString() {
		return "\nPRODUCTO REFRIGERADO\nNombre: " + nombre + "\nCódigo de organización alimentaria: " + codOrg
				+ "\nFecha de Caducidad: " + fechaCad + "\nNº de lote: " + numLote + "\nFecha de envasado: "
				+ fechaEnvasado + "\nTiempo de mantenimiento recomendado: " + tiempoReco;
	}
	
	// Getters & Setters
	public String getCodOrg() {
		return codOrg;
	}

	public void setCodOrg(String codOrg) throws Exception {
		if (codOrg.equals("") || codOrg.equals(null)) {
			throw new Exception("El código de organización no puede ser null");
		} else {
			this.codOrg = codOrg;
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
