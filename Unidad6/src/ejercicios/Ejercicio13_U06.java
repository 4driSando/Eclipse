package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio13_U06 {

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
        Random r = new Random();

        ArrayList<String> palabras = new ArrayList<>();

        // Sacar 5 palabras distintas al azar
        while (palabras.size() < 5) {
            Object[] claves = miniDic.keySet().toArray();
            String palabra = (String) claves[r.nextInt(claves.length)];

            if (!palabras.contains(palabra)) {
                palabras.add(palabra);
            }
        }

        int aciertos = 0;
        int errores = 0;

        System.out.println("CONCURSO MORROCOTUDO");
        System.out.println("Escribe las siguientes palabras en inglés");

        for (String esp : palabras) {
            System.out.print(esp + ": ");
            String respuesta = sc.next().toLowerCase();

            if (respuesta.equals(miniDic.get(esp))) {
                aciertos++;
            } else {
                errores++;
            }
        }

        System.out.println("Aciertos: " + aciertos);
        System.out.println("Errores: " + errores);

        sc.close();
    }
}
