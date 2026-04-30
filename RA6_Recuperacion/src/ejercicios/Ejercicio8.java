package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		ArrayList<Producto> array = new ArrayList<Producto>();
		
		try {
			array.add(new Producto("PC", 10));
			array.add(new Producto("Teclado", 25));
			array.add(new Producto("Ratón", 40));
			array.add(new Producto("Móvil", 5));
			array.add(new Producto("Monitor", 12));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		Iterator<Producto> it = array.iterator();
		
		System.out.println("ArrayList:");
		// Muestro todo el arrayList
		while (it.hasNext()) {
			Producto producto = (Producto) it.next();
			System.out.println(producto);
			
			// Elimino dos productos
			if(producto.getCantidad() <= 10) {
				it.remove();
			}
		}
		
		System.out.println("\nArrayList sin pc ni móvil pero con tv en la pos 2:");
		// Añado un nuevo producto
		try {
			array.add(2, new Producto("TV", 3));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		for (Producto producto : array) {
			System.out.println(producto);
		}
		
		array.removeAll(array);
		
		System.out.println("\nTamaño del array:");
		System.out.println(array.size());
		
	}

}
