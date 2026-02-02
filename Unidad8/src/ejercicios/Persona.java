package ejercicios;

public class Persona {

	private String nombre;
	private String direccion;
	private int edad;
	private String dni;
	private int telefono;
		
	public Persona(String nombre, String direccion, int edad, String dni, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.dni = dni;
		this.telefono = telefono;
	}
		
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + " años, dni=" + dni
				+  ", telefono=" + telefono + "]";
	}

	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getEdad() {
		return edad;
	}
	public String getDni() {
		return dni;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
