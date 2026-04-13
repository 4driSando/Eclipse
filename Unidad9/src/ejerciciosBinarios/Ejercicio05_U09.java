package ejerciciosBinarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejercicio05_U09 {

    public static void main(String[] args) {

        try (
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("numeros.dat"));
            ObjectOutputStream salidaPares = new ObjectOutputStream(new FileOutputStream("pares.dat"));
            ObjectOutputStream salidaImpares = new ObjectOutputStream(new FileOutputStream("impares.dat"))
        ) {

            while (true) {
                int numero = entrada.readInt();

                if (numero % 2 == 0) {
                    salidaPares.writeInt(numero);
                } else {
                    salidaImpares.writeInt(numero);
                }

                System.out.println(numero);
            }

        } catch (EOFException ex) {
            System.out.println("Fin de fichero");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}