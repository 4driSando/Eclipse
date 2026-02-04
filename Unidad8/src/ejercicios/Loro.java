package ejercicios;

import java.time.LocalDate;
import java.util.Random;

public class Loro extends Mascota {

	private String origen;
	private String raza;
	private boolean puedeVolar;

	public Loro(String nombre, LocalDate fechaNac, String origen, String raza) {
		super(nombre, fechaNac);
		this.setOrigen(origen);
		this.setRaza(raza);
		setPuedeVolarRandom();
	}

	@Override
	public String toString() {
		return super.toString() + "Loro [origen=" + origen + ", raza=" + raza + ", puedeVolar=" + puedeVolar + "]";
	}

	public String sonidoCaracteristico() {
		return super.getNombre() + " ha dicho \"Pio Pio\"";
	}
	
	public String volar() {
		String volar;
		if (isPuedeVolar()) {
			volar = super.getNombre() + " ha echado a volar";
		} else {
			volar = super.getNombre() + " es incapaz de volar";
		}
		return volar;
	}

	public String getOrigen() {
		return origen;
	}

	public String getRaza() {
		return raza;
	}

	public boolean isPuedeVolar() {
		return puedeVolar;
	}

	public void setPuedeVolarRandom() {
		Random r = new Random();
		this.puedeVolar = r.nextBoolean();
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

}
