package ejercicios;

public class Submarino extends Acuatico {

	private int profMax;

	public Submarino(String matricula, String modelo, int eslora, int profMax) {
		super(matricula, modelo, eslora);
		this.profMax = profMax;
		if (!validarMatricula()) {
			throw new IllegalArgumentException("Matrícula no válida");
		}
	}

	@Override
	public String toString() {
		return "\nSUBMARINO\nMatrícula: " + matricula + "\nModelo: " + modelo + "\nEslora: " + eslora
				+ "\nProfundidad Máxima: " + profMax;
	}

	@Override
	public String tipoVehiculo() {
		return "Submarino";
	}

	// Getters & Setters
	public int getProfMax() {
		return profMax;
	}

	public void setProfMax(int profMax) {
		this.profMax = profMax;
	}

}
