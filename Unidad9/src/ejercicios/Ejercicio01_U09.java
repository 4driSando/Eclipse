package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio01_U09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ruta;

        do {
            System.out.println("Introduce una ruta:");
            ruta = sc.nextLine();

            if (!ruta.isEmpty()) {
                File f = new File(ruta);

                try {
                    muestraInfoRuta(f);
                } catch (FileNotFoundException e) {
                    System.err.println(e.getMessage());
                }
            }

        } while (!ruta.isEmpty());

        sc.close();
    }

    public static void muestraInfoRuta(File ruta) throws FileNotFoundException {

        if (!ruta.exists()) {
            throw new FileNotFoundException("La ruta no existe");
        }

        // Si es archivo
        if (ruta.isFile()) {
            System.out.println("[A] " + ruta.getName());
        }

        // Si es directorio
        else if (ruta.isDirectory()) {

            File[] lista = ruta.listFiles();
            Arrays.sort(lista);

            // Primero directorios
            for (File f : lista) {
                if (f.isDirectory()) {
                    System.out.println("[*] " + f.getName());
                }
            }

            // Luego archivos
            for (File f : lista) {
                if (f.isFile()) {
                    System.out.println("[A] " + f.getName());
                }
            }
        }
    }
}