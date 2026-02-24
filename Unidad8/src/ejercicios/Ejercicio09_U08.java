package ejercicios;

import java.util.Scanner;

public class Ejercicio09_U08 {

	public static void main(String[] args) {

		Empleado inaki = new Empleado("Iñaki", "02733712R", 1100);
		Empleado adri = new Empleado("Adrián", "93462348T", 1750);
		Empleado lhanz = new Empleado("Lhanz", "68439487P", 975);
		Empleado cespedes = new Empleado("Céspedes", "99645358R", 2050);
		Empleado hector = new Empleado("Héctor", "27794635L", 1200);
		Empleado estephano = new Empleado("Estephano", "22395587K", 1880);

		Empresa mSL = new Empresa("Los Morrocotudos", "APS25092006");

		mSL.anadirEmpleado(adri);
		mSL.anadirEmpleado(inaki);
		mSL.anadirEmpleado(lhanz);
		mSL.anadirEmpleado(cespedes);
		mSL.anadirEmpleado(hector);
		mSL.anadirEmpleado(estephano);
		
		int respuesta;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\nLOS MORROCOTUDOS S.L.");
			System.out.println("1. Listar nombres de los empleados");
			System.out.println("2. Listar empleados (nombre, dni, sueldo bruto y sueldo neto)");
			System.out.println("3. Listar empleados e información completa");
			System.out.println("4. Mostrar total de sueldos brutos al mes");
			System.out.println("5. Mostrar total de sueldos netos al mes");
			System.out.println("6. Salir");
			respuesta = sc.nextInt();

			switch (respuesta) {
			case 1:
				mSL.mostrarNombresEmpleados();
				break;
				
			case 2:
				mSL.mostrarDNISbSnEmpleados();
				break;
				
			case 3:
				mSL.mostrarTodaInfoEmpleados();
				break;
				
			case 4:
				System.out.println("Sueldo total bruto al mes: " + mSL.calcularTotalMensualBruto());
				break;
				
			case 5:
				System.out.println("Sueldo total neto al mes: " + mSL.calcularTotalMensualNeto());
				break;
				
			case 6:
				System.out.println("Saliendo de la empresa más morrocotuda :)");
				break;


			default:
				break;
			}

		} while (respuesta != 6);
		sc.close();

	}

}
