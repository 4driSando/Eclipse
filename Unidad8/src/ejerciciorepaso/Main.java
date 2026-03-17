package ejerciciorepaso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Vehiculo> vehiculos = new HashMap<String, Vehiculo>();
		try {
			Moto m1 = new Moto("APS3623", "Yamaha Aerox", 20);
			vehiculos.put(m1.getMatricula(), m1);
			Moto m2 = new Moto("JLP9864", "Kawachaki", 250.67);
			vehiculos.put(m2.getMatricula(), m2);
			Moto m3 = new Moto("ALM9963", "Michubichi Lhanz", 98);
			vehiculos.put(m3.getMatricula(), m3);
			Moto m4 = new Moto("JKM6637", "Lobatocleta", 5000.6);
			vehiculos.put(m4.getMatricula(), m4);
			Coche c1 = new Coche("MLN7854", "BMW M3", 560.75, true);
			vehiculos.put(c1.getMatricula(), c1);
			Coche c2 = new Coche("LZP6341", "Porsche GT3 RS", 2630.50);
			vehiculos.put(c2.getMatricula(), c2);
			Coche c3 = new Coche("PMQ3198", "Lamborghini Urus", 21000);
			vehiculos.put(c3.getMatricula(), c3);
			Coche c4 = new Coche("ASL6597", "Citröen C3", 9.99, true);
			vehiculos.put(c4.getMatricula(), c4);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		ArrayList<Vehiculo> vehiculosList = new ArrayList<Vehiculo>(vehiculos.values());

		System.out.println("VEHICULOS SORT POR MATRÍCULA");
		Collections.sort(vehiculosList);
		for (Vehiculo v : vehiculosList) {
			System.out.println("-");
			System.out.println(v);
		}

		System.out.println("------------------------------------------------------------------------------");
		System.out.println("VEHICULOS SORT POR MATRÍCULA y con Informe de mantenimiento y recargar batería");
		for (Vehiculo v : vehiculosList) {
			System.out.println("-");
			System.out.println(v);
			System.out.println(v.obtenerInformeMantenimiento());
			if (v instanceof Coche) {
				System.out.println(((Coche) v).recargarBateria());
			}
		}

		Iterator<Vehiculo> it = vehiculosList.iterator();
		while (it.hasNext()) {
			Vehiculo v = it.next();
			if (v.getMatricula().startsWith("A")) {
				it.remove();
			}
		}

		System.out.println("---------------------------------------------");
		System.out.println("VEHICULOS SORT POR MATRÍCULA SIN MATRÍCULAS A");
		for (Vehiculo v : vehiculosList) {
			System.out.println("-");
			System.out.println(v);
		}

		System.out.println("------------------------------");
		System.out.println("VEHICULOS SORT POR PRECIO desc");
		Collections.sort(vehiculosList, new comparaPrecio());
		for (Vehiculo v : vehiculosList) {
			System.out.println("-");
			System.out.println(v);
		}

	}

}
