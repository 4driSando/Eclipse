package ejerciciorepaso;

import java.util.Comparator;
import java.util.Objects;

public abstract class Vehiculo implements Comparable<Vehiculo>{

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
		if (matricula.matches("[A-Z]{3}[0-9]{4}")) {
			this.matricula = matricula;
		} else {
			throw new Exception("El formato de la matrícula no es válido");
		}
	}

	public void setModelo(String modelo) throws Exception {
		if (modelo == null || modelo.isEmpty()) {
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

	@Override
    public int compareTo(Vehiculo otro) {
        return this.matricula.compareTo(otro.matricula);
    }
}

// Clase para comparar por coste de reparación
class comparaPrecio implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo uno, Vehiculo otro) {
		int resultado = Double.compare(otro.getCosteReparacion(), uno.getCosteReparacion());
		return resultado;
	}

}
