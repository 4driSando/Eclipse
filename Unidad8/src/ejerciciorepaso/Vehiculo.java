package ejerciciorepaso;

import java.util.Objects;

public abstract class Vehiculo {

	// Atributos
	private String matricula;
	private String modelo;
	private double costeReparacion;

	// Constructor
	public Vehiculo(String matricula, String modelo, double costeReparacion) throws Exception {
		setMatricula(matricula);
		setModelo(modelo);
		setCosteReparacion(costeReparacion);
	}

	// hashCode
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}

	// toString
	@Override
	public String toString() {
		return Vehiculo.class + modelo + "\nMatrícula: " + matricula + "\nCoste de reparacion: " + costeReparacion;
	}

	// Getters
	public String getMatricula() {
		return matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public double getCosteReparacion() {
		return costeReparacion;
	}

	// Setters
	public void setMatricula(String matricula) throws Exception {
		if (matricula.equals("[0-9]{4}[A-Z]{3}")) {
			this.matricula = matricula;
		} else {
			throw new Exception("El formato de la matrícula no es válido");
		}
	}

	public void setModelo(String modelo) throws Exception {
		if (modelo.equals(null) || modelo.equals("")) {
			throw new Exception("Modelo no puede ser null ni estar vacío");
		} else {
			this.modelo = modelo;
		}
	}

	public void setCosteReparacion(double costeReparacion) throws Exception {
		if (costeReparacion <= 0) {
			throw new Exception("El coste de reparación no puede ser menor a 0");
		} else {
			this.costeReparacion = costeReparacion;
		}
	}

	// Método abstracto
	abstract String obtenerInformeMantenimiento();

	public int compareTo(Vehiculo v1, Vehiculo v2) {
		int variable;
		
		if (v1.getMatricula().equals(v2.getMatricula())) {
			variable = 0;
		} else {
			variable = v1.getModelo().compareTo(v2.getModelo());
		}
		
		return variable;
		
	}
}
