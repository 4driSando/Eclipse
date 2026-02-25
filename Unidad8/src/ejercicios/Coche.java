package ejercicios;

public class Coche extends Terrestre {

	private boolean ac;

	public Coche(String matricula, String modelo, int ruedas, boolean ac) {
		super(matricula, modelo, ruedas);
		this.ac = ac;
		if (!validarMatricula()) {
			throw new IllegalArgumentException("Matrícula no válida");
		}
	}

	@Override
	public String tipoVehiculo() {
		return "Coche";
	}

	@Override
	public String toString() {
		return "\nCOCHE\nMatrícula: " + matricula + "\nModelo: " + modelo + "\nRuedas: " + ruedas + "\nAC: " + ac;
	}

	// Getters & Setters
	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

}
