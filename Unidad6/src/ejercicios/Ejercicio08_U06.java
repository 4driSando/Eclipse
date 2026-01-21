package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio08_U06 {

	public static void main(String[] args) {
		
		// Crea un ArrayList.
		ArrayList<Producto> lista = new ArrayList<>();

		// Crea 5 instancias de la Clase Producto.
		// Añade las 5 instancias de Producto al ArrayList.
		Producto cartera = new Producto("Cartera", 20);
		lista.add(cartera);
		Producto preservativos = new Producto("Preservativos", 5);
		lista.add(preservativos);
		Producto teclado = new Producto("Teclado", 15);
		lista.add(teclado);
		Producto gafas = new Producto("Gafas", 10);
		lista.add(gafas);
		Producto aceitunas = new Producto("Aceitunas", 200);
		lista.add(aceitunas);

		// Visualiza el contenido de ArrayList utilizando Iterator. 
		Iterator<Producto> iter = lista.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Elimina dos elementos del ArrayList.
		lista.remove(teclado);
		lista.remove(gafas);
		
		// Inserta un nuevo objeto producto en la posición 2 de la lista.
		Producto anillo = new Producto("Anillo", 2);
		lista.add(2, anillo);
		
		// Visualiza de nuevo el contenido de ArrayList utilizando for-each. 
		for(Producto obj : lista) {
		    System.out.println(obj);
		}
		
		// Elimina todos los valores del ArrayList y muestra el tamaño. 
		lista.removeAll(lista);	
		System.out.println(lista.size());

	}

}
