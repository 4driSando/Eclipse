package ejercicios;

public abstract class Vehiculo {

	protected String matricula;
	protected String modelo;

	public Vehiculo(String matricula, String modelo) {
		this.matricula = matricula;
		this.modelo = modelo;
	}

	/**
	 * Método para validar la matrícula dependiendo del vehículo
	 * 
	 * @return True o False dependiendo de si es válida o no
	 */
	public abstract boolean validarMatricula();
	protected abstract String tipoVehiculo();

	// Getters & Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


}
