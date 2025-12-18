package ejercicios;

enum Rol {
	GUERRERO, MAGO, ARQUERO;
}

public class Personaje {

	private int id, nivel, vida;
	private String nombre;
	private Rol rol;

	/**
	 * Constructor para crear personajes 
	 * @param id, entero referencial
	 * @param nombre, nombre del personaje
	 * @param rol, rol de lo que hace el personaje
	 * @param nivel, nivel en el que está (min 1, máx 100)
	 * @param vida, vida que tiene (min 1, máx 100)
	 */
	public Personaje(int id, String nombre, Rol rol, int nivel, int vida) {
		this.nombre = nombre;
		this.id = id;
		this.rol = rol;
		this.nivel = nivel;
		this.vida = vida;
	}

	/**
	 * Contructor con valores rol, nivel y vida ya definidos
	 * @param id
	 * @param nombre
	 */
	public Personaje(int id, String nombre) {
		this.nombre = nombre;
		this.id = id;
		this.rol = Rol.GUERRERO;
		this.nivel = 1;
		this.vida = 100;
	}

	/**
	 * toString para mostrar la información del personaje
	 */
	@Override
	public String toString() {
		return "Personaje [id=" + id + ", nombre=" + nombre + ", rol=" + rol + ", nivel=" + nivel + ", vida=" + vida
				+ "]";
	}

	/**
	 * Método para subir de nivel
	 * @param sube, cantidad de niveles que sube
	 * @return niveles totales que tiene
	 */
	public String subirNivel(int sube) {
		int suma;
			suma = nivel + sube;
			setNivel(suma);
			if(nivel > 100) {
			System.err.println("Has alcanzado el nivel máximo");
			setNivel(100);
			}				
		return "Has subido " + sube + " niveles. El personaje " + nombre + " es nivel " + suma;
				
	}
	
	/**
	 * Método para recibir daño
	 * @param daño, cantidad de daño que recibe
	 * @return cantidad de vida restante
	 */
	public String recibirDanio(int daño) {
		int resta;
		resta = vida - daño;
		setVida(resta);
		if(vida < 1) {
			System.err.println(nombre + " la ha palmado XP");
			setVida(0);
		}		
		return "El personaje " + nombre + " ha recibido " + daño + " de daño [" + resta + "]";  
	}
	
	/**
	 * Método para curar a un personaje
	 * @param cura, cantidad que se cura el personaje
	 * @return cantidad de vida con la que se queda
	 */
	public String curar(int cura) {
		int suma;
		suma = vida + cura;
		setVida(suma);
		if(vida > 100) {
			System.err.println(nombre + " ha alcanzado el máximo de salud");
			setVida(100);
		}		
		return nombre + " ha recibido salud! Su vida aumenta hasta " + suma;
	}
	
	/**
	 * Método para saber si un personaje está vivob
	 * @return true o false en caso que esté vivo o no
	 */
	public String estaVivob() {
		boolean vivob;
		String nomuerto = nombre + " está vivo";
		String muerto = nombre + " está muerto";
		String devolver;
		
		if(vida > 0) {
			vivob = true;
			devolver = nomuerto;
		} else {
			vivob = false;
			devolver = muerto;
		}
		return devolver;
	}
	
	/**
	 * Método para cambiar de rol
	 * @param cambiar, entero referencial para saber a queé rol cambiar
	 * @return String indicando a qué rol ha cambiado
	 */
	public String cambiarRol(int cambiar) {		
		switch (cambiar) {
		case 1:
			setRol(Rol.ARQUERO);
			break;
			
		case 2:
			setRol(Rol.GUERRERO);
			break;
		
		case 3:
			setRol(Rol.MAGO);
			break;
			
		default:
			System.err.println("Esa opción no es válida compañerete");
			break;
		}
		return nombre + " ha pasado a ser un " + getRol();
	}

	public int getId() {
		return id;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}
