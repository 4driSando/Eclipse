package ejercicios;

public abstract class Acuatico extends Vehiculo {

	protected int eslora;

	public Acuatico(String matricula, String modelo, int eslora) {
		super(matricula, modelo);
		this.eslora = eslora;
	}

	/**
	 * Método que devuelve el tipo de vehículo que es
	 * 
	 * @return String con el tipo de vehículo
	 */
	public abstract String tipoVehiculo();

	@Override
	public boolean validarMatricula() {
		return matricula.matches("[A-Z]{3,10}");
	}

	// Getters & Setters
	public int getEslora() {
		return eslora;
	}

	public void setEslora(int eslora) {
		this.eslora = eslora;
	}

}
