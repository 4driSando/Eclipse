package ejerciciorepaso2;

public class Cuidador {

	// Atributos
	private String nombre;
	private String especialidad;

	// Constructor
	public Cuidador(String nombre, String especialidad) throws Exception {
		setNombre(nombre);
		setEspecialidad(especialidad);
	}

	// Getters
	public String getNombre() {
		return nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}

	// Setters
	public void setNombre(String nombre) throws Exception {
		if (nombre == null || nombre.isEmpty()) {
			throw new Exception("Nombre no puede ser null ni vacío");
		} else {
			this.nombre = nombre;
		}
	}
	public void setEspecialidad(String especialidad) throws Exception {
		if (especialidad == null || especialidad.isEmpty()) {
			throw new Exception("Especialidad no puede ser null ni vacío");
		} else {
			this.especialidad = especialidad;
		}
	}

}
