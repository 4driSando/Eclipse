package ejercicios;

import java.util.Arrays;

public class Alumno extends Persona {

	private int expediente;
	private String nombreGrado;
	private int curso;
	private int[] notas = new int[5];
	
	public Alumno(String nombre, String direccion, int edad, String dni, int telefono, int expediente,
			String nombreGrado, int curso, int[] notas) {
		super(nombre, direccion, edad, dni, telefono);
		this.expediente = expediente;
		this.nombreGrado = nombreGrado;
		this.curso = curso;
		this.notas = notas;	
	} 
	
	@Override
	public String toString() {
		return "Alumno [expediente=" + expediente + ", nombreGrado=" + nombreGrado + ", curso=" + curso + ", notas="
				+ Arrays.toString(notas) + "]";
	}

	public int getExpediente() {
		return expediente;
	}

	public String getNombreGrado() {
		return nombreGrado;
	}

	public int getCurso() {
		return curso;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setExpediente(int expediente) {
		this.expediente = expediente;
	}

	public void setNombreGrado(String nombreGrado) {
		this.nombreGrado = nombreGrado;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}	

}
