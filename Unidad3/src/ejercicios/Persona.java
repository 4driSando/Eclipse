package ejercicios;

public class Persona {

	private String nombre, apellidos, dni;
	private int edad;

	public Persona(String n, String a, String d, int e) {
		setNombre(n);
		setApellidos(a);
		setDni(d);
		setEdad(e);
	}

	void setNombre(String n) {
		if (n != null && n.length() > 0) {
			this.nombre = n;
		} else {
			System.err.println("NOMBRE no válido");
		}
	}
	
	String getNombre() {
		return nombre;
	}

	void setApellidos(String a) {
		if (a != null && a.length() > 0) {
			this.apellidos = a;
		} else {
			System.err.println("APELLIDOS no válidos");
		}
	}

	String getApellidos() {
		return apellidos;
	}

	void setDni(String d) {
		if (d != null && d.length() > 0) {
			this.dni = d;
		} else {
			System.err.println("DNI no válido");
		}
	}

	String getDni() {
		return dni;
	}

	void setEdad(int e) {
		if (e >= 0) {
			this.edad = e;
		} else {
			System.err.println("EDAD no válida");
		}
	}

	int getEdad() {
		return edad;
	}

	String obtenerDatos() {
		return "Nombre: " + nombre + " " + apellidos +
		       " || DNI: " + dni +
		       " || Edad: " + edad + " años || ";
	}
}
