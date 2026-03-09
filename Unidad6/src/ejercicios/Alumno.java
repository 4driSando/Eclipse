package ejercicios;


public class Alumno extends Persona2 {

	// Atributo
	private int curso;
		
	// Constructor
	public Alumno(String nombre, int edad, int curso) {
		super(nombre, edad);
		setCurso(curso);
	}

	// Getters & Setters
	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	// toString
	@Override
	public String toString() {
		return  "Curso: " + this.getCurso() + " | " + this.getNombre() + ", " + this.getEdad();
	}
				
}
