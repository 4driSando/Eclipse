package ejercicios;

public class Helicotero extends Aereo {

	private int helices;

	public Helicotero(String matricula, String modelo, int asientos, int helices) {
		super(matricula, modelo, asientos);
		this.helices = helices;
		if (!validarMatricula()) {
			throw new IllegalArgumentException("Matrícula no válida");
		}
	}

	@Override
	public String toString() {
		return "\nHELICOTERO\nMatrícula: " + matricula + "\nModelo: " + modelo + "\nNº Asientos: " + asientos
				+ "\nNº de helices: " + helices;
	}

	@Override
	public String tipoVehiculo() {
		return "Helicotero";
	}

	// Getters & Setters
	public int getHelices() {
		return helices;
	}

	public void setHelices(int helices) {
        if (helices <= 0) {
            throw new IllegalArgumentException("El nº de hélices no puede ser negativo ni cero");
        }
		this.helices = helices;
	}

}
