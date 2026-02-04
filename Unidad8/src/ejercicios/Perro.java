package ejercicios;

import java.time.LocalDate;

public class Perro extends Mascota {

	private String raza;
	private boolean pulgas;

	public Perro(String nombre, LocalDate fechaNac, String raza, boolean pulgas) {
		super(nombre, fechaNac);
		this.setRaza(raza);
		this.setPulgas(pulgas);
	}

	@Override
	public String toString() {
		return super.toString() + "Perro [raza=" + raza + ", pulgas=" + pulgas + "]";
	}

	@Override
	public String sonidoCaracteristico() {
		return super.getNombre() + " ha dicho \"Guau!!\"";
	}

	public void desparasitar() {
		this.pulgas = false;
	}

	public String getRaza() {
		return raza;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

}
