package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio12_U06 {

	public static void main(String[] args) {

		HashMap<String, String> miniDic = new HashMap<>();
		miniDic.put("blanco", "white");
		miniDic.put("rojo", "red");
		miniDic.put("negro", "black");
		miniDic.put("azul", "blue");
		miniDic.put("verde", "green");
		miniDic.put("naranja", "orange");
		miniDic.put("amarillo", "yellow");
		miniDic.put("morado", "purple");
		miniDic.put("rosa", "pink");
		miniDic.put("gris", "grey");
		miniDic.put("marrón", "brown");

		Scanner sc = new Scanner(System.in);
		String respuesta;

		System.out.println("Repasemos los colores (escribe 'salir' para terminar)");

		do {
			System.out.print("Introduce un color: ");
			respuesta = sc.next().toLowerCase();

			if (miniDic.containsKey(respuesta)) {
				System.out.println("Traducción: " + miniDic.get(respuesta));
			} else if (!respuesta.equals("salir")) {
				System.err.println("Ese color no está en el diccionario");
			}

		} while (!respuesta.equals("salir"));

		sc.close();
	}
}
