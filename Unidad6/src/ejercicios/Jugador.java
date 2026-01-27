package ejercicios;

enum posicion {
	PORTERO,
	ALA,
	CIERRE,
	PIVOT;
}

public class Jugador {

	private String nombre;
	private posicion posicion;
	
	public Jugador(String nombre, posicion posicion) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
	}
	public String getNombre() {
		return nombre;
	}
	public posicion getPosicion() {
		return posicion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPosicion(posicion posicion) {
		this.posicion = posicion;
	}
	
}
