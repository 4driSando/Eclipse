package ejercicios;

import java.util.Arrays;

public class Contenedor<T> {

	private T[] objeto;

	public Contenedor() {
		objeto = (T[]) new Object[30];
	}

	@Override
	public String toString() {
		return "Contenedor [objeto=" + Arrays.toString(objeto) + "]";
	}

	public void insertarAlPrincipio(T nuevo) {
		T[] arrayAntiguo = Arrays.copyOf(objeto, objeto.length + 1);

		objeto = (T[]) new Object[objeto.length + 1];

		for (int i = 0; i < arrayAntiguo.length; i++) {
			objeto[i] = objeto[objeto.length - 1];
		}

		objeto[0] = nuevo;
	}

	public void insertarAlFinal(T nuevo) {

		objeto[objeto.length - 1] = nuevo;
	}

	public T extraerDelPrincipio() {

		return objeto[0];
	}

	public T extraerDelFinal() {
		return objeto[objeto.length - 1];
	}

	public void ordenar() {
		Arrays.sort(objeto);
	}

}
