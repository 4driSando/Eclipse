package adrian_perez_sandoval_2Trimestre;

import java.util.TreeSet;

public class Ejercicio1 {
	// Quiero recuperar la parte de excepciones

	public static void main(String[] args) {

		// Instancio la colección con un TreeSet ya que los Set no permiten duplicados
		TreeSet<Producto> tienda = new TreeSet<Producto>();
		TreeSet<Producto> tienda2 = new TreeSet<Producto>(new ComparaPorPrecio());


		// Creo todos los productos con sus debidos tryCatch y los meto en el TreeSet
		// tienda
		try {
			Comic c1 = new Comic("LA007", "Súper Lobatoide y sus aventuras", 20, true);
			tienda.add(c1);
			tienda2.add(c1);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			Comic c2 = new Comic("MC023", "Mari Carmen y 1ºDAM", 34, false);
			tienda.add(c2);
			tienda2.add(c2);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			FiguraAccion f1 = new FiguraAccion("LP001", "Ant-Man", 112.99, 5);
			tienda.add(f1);
			tienda2.add(f1);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			FiguraAccion f2 = new FiguraAccion("XP542", "Mario Bros", 50, 3);
			tienda.add(f2);
			tienda2.add(f2);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			FiguraAccion f3 = new FiguraAccion("AX693", "David", 300, 2);
			tienda.add(f3);
			tienda2.add(f3);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		// Lo de eliminar los id con X no lo he sabido hacer por el Iterator		

		// TreeSet Ordenados por nombre
		System.out.println("PRODUCTOS ORDENADOS NATURALMENTE POR NOMBRE");
		for (Producto p : tienda) {
			System.out.println(p + "\n---");
		}

		// TreeSet Ordenados por precio descendente
		System.out.println("PRODUCTOS ORDENADOS DE CARO A BARATO");
		for (Producto p : tienda2) {
			System.out.println(p + "\n---");
		}

	}

}
