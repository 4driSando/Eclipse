package ejercicios;

import java.util.Arrays;

public class Contenedor<T> {

	/**
	 * Atributo principal de la clase Contenedor<T>
	 */
	private T[] objeto;

	/**
	 * Constructor por defecto
	 * @param objeto objeto por defecto
	 */
	public Contenedor(T[] objeto) {
		this.objeto = objeto;
	}

	/**
	 * toString sobrescrito
	 */
	@Override
	public String toString() {
		return Arrays.toString(objeto);
	}

	/**
	 * Inserta T al principio del contenedor
	 * @param nuevo T a insertar al principio del contenedor
	 */
	public void insertarAlPrincipio(T nuevo) {
		
		// Crea array nuevo más grande copiando el antiguo y sumando 1
		T[] nuevoArray = Arrays.copyOf(objeto, objeto.length + 1);

		// Desplaza todas las posiciones a la derecha
		for (int i = nuevoArray.length - 1; i > 0; i--) {
			nuevoArray[i] = nuevoArray[i - 1];
		}
		
		// Le da valor a la posición 0 con el nuevo T
		nuevoArray[0] = nuevo;
		
		// Da valor a objeto con el nuevoArray
		objeto = nuevoArray;
	}

	/**
	 * Inserta T al final del contenedor
	 * @param nuevo T a insertar al final del contenedor
	 */
	public void insertarAlFinal(T nuevo) {
		
		// Crea array nuevo más grande copiando el antiguo y sumando 1
		objeto = Arrays.copyOf(objeto, objeto.length + 1);
		
		// Le da valor a la última posición
		objeto[objeto.length - 1] = nuevo;
	}

	/**
	 * Elimina de la primera posición del array
	 * @return el valor de la primera posición
	 */
	public T extraerDelPrincipio() {
		
		// Si la longitud del array es igual a 0 nos devuelve null
		if (objeto.length == 0)
			return null;

		// Coge la primera posición
		T primero = objeto[0];

		// Desplaza todo a la izquierda
		for (int i = 0; i < objeto.length - 1; i++) {
			objeto[i] = objeto[i + 1];
		}

		// Reduce el tamaño
		objeto = Arrays.copyOf(objeto, objeto.length - 1);
		
		// Devuelve la última posición
		return primero;
	}

	/**
	 * Elimina la última posición del array
	 * @return el valor de la última posición
	 */
	public T extraerDelFinal() {
		
		// Si la longitud del array es igual a 0 nos devuelve null
		if (objeto.length == 0)
			return null;

		// Coge el valor de la última posición
		T ultimo = objeto[objeto.length - 1];
		
		// Lo copia haciéndolo más pequeño
		objeto = Arrays.copyOf(objeto, objeto.length - 1);
		
		// Devuelve la última posición
		return ultimo;
	}

	/**
	 * Ordena el array
	 */
	public void ordenar() {
		
		// Método que ordena el array
		Arrays.sort(objeto);
	}
}