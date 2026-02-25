package ejercicios;

public class Barco extends Acuatico {

	private boolean motor;

	public Barco(String matricula, String modelo, int eslora, boolean motor) {
		super(matricula, modelo, eslora);
		this.motor = motor;
		if (!validarMatricula()) {
			throw new IllegalArgumentException("Matrícula no válida");
		}
	}

	@Override
	public String toString() {
		return "\nBARCO\nMatrícula: " + matricula + "\nModelo: " + modelo + "\nEslora: " + eslora + "\nMotor: " + motor;
	}

	@Override
	public String tipoVehiculo() {
		return "Barco";
	}

	// Getters & Setters
	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

}
