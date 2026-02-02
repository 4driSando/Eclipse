package ejercicios;

import java.util.Arrays;

enum horario {
	MAÑANA,
	TARDE;
}

public class Profesor extends Persona {

	private String departamento;
	private horario horario;
	private String[] asignaturas = new String[5];
	
	public Profesor(String nombre, String direccion, int edad, String dni, int telefono, String departamento,
			ejercicios.horario horario, String[] asignaturas) {
		super(nombre, direccion, edad, dni, telefono);
		this.departamento = departamento;
		this.horario = horario;
		this.asignaturas = asignaturas;
	}

	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", horario=" + horario + ", asignaturas="
				+ Arrays.toString(asignaturas) + "]";
	}

	public String getDepartamento() {
		return departamento;
	}

	public horario getHorario() {
		return horario;
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setHorario(horario horario) {
		this.horario = horario;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
		
}
