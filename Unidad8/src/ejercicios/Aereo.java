package ejercicios;

public abstract class Aereo extends Vehiculo {

	protected int asientos;

	public Aereo(String matricula, String modelo, int asientos) {
		super(matricula, modelo);
		this.asientos = asientos;
	}

	/**
	 * Método que devuelve el tipo de vehículo que es
	 * 
	 * @return String con el tipo de vehículo
	 */
	public abstract String tipoVehiculo();

	@Override
	public boolean validarMatricula() {
		return matricula.matches("[A-Z]{4}[0-9]{6}");
	}

	// Getters & Setters
	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

}
