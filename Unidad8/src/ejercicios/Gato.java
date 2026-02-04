package ejercicios;

import java.time.LocalDate;

public class Gato extends Mascota {

	private boolean peloLargo;
	private String color;

	public Gato(String nombre, LocalDate fechaNac, boolean peloLargo, String color) {
		super(nombre, fechaNac);
		this.setPeloLargo(peloLargo);
		this.setColor(color);
	}

	@Override
	public String toString() {
		return super.toString() + "Gato [peloLargo=" + peloLargo + ", color=" + color + "]";
	}

	public String sonidoCaracteristico() {
		return super.getNombre() + " ha dicho \"Miau\"";
	}

	public boolean isPeloLargo() {
		return peloLargo;
	}

	public String getColor() {
		return color;
	}

	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}

	public void setColor(String color) throws ArithmeticException {
		if (color == null) {
			throw new ArithmeticException("Color no puede ser null");
		} else {
			this.color = color;
		}
	}

}
