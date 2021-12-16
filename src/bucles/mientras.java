package bucles;

import java.util.Scanner;

public class mientras {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Ejercicio 6.1
		int contrasena;
		System.out.println("Introduzca la contraseña:");
		contrasena = in.nextInt();
		while (contrasena!=1234) {
			System.out.println("Contraseña incorrecta. Inténtelo de nuevo:");
			contrasena = in.nextInt();
		}
		System.out.println("¡Bienvenido!");
		
		// Ejercicio 6.2
		int a,b;
		System.out.println("\nIntroduzca dos números:");
		a = in.nextInt();
		b = in.nextInt();
		while (a!=0 && b!=0) {
			System.out.println("La suma de "+a+" y "+b+" es "+(a+b));
			System.out.println("A continuación, introduzca otros dos números para sumar (si desea finalizar, introduzca dos ceros):");
			a = in.nextInt();
			b = in.nextInt();
		}
		
		// Ejercicio 6.3
		int solu, user;
		a=(int)(100*Math.random());
		b=(int)(100*Math.random());
		solu=a+b;
		System.out.println("\nIntroduce la suma de "+a+" y "+b);
		user = in.nextInt();
		while (solu!=user) {
			System.out.println("Incorrecto. Vuelve a intentarlo...");
			user = in.nextInt();
		}
		System.out.println("¡Correcto!");
		
		// Ejercicio 6.4 (voluntario)
		int dia, mes;
		System.out.println("\nIntroduzca un día del mes:");
		dia = in.nextInt();
		System.out.println("Introduzca un mes:");
		mes = in.nextInt();
		while ((dia<1 || dia>31) || (mes<1 || mes>12)) {
			System.out.println("Datos introducidos no válidos...");
			System.out.println("\nIntroduzca un día del mes:");
			dia = in.nextInt();
			System.out.println("Introduzca un mes:");
			mes = in.nextInt();
		}
		switch (mes) {
		case 1:
			System.out.println("El día del año es "+dia);
			break;
		case 2:
			System.out.println("El día del año es "+(dia+31));
			break;
		case 3:
			System.out.println("El día del año es "+(dia+59));
			break;
		case 4:
			System.out.println("El día del año es "+(dia+90));
			break;
		case 5:
			System.out.println("El día del año es "+(dia+120));
			break;
		case 6:
			System.out.println("El día del año es "+(dia+151));
			break;
		case 7:
			System.out.println("El día del año es "+(dia+181));
			break;
		case 8:
			System.out.println("El día del año es "+(dia+212));
			break;
		case 9:
			System.out.println("El día del año es "+(dia+243));
			break;
		case 10:
			System.out.println("El día del año es "+(dia+273));
			break;
		case 11:
			System.out.println("El día del año es "+(dia+304));
			break;
		case 12:
			System.out.println("El día del año es "+(dia+334));
			break;
		}
		
		// Ejercicio 6.5 (voluntario)
		int cantidad, cantidadback, cantidadback2;
		System.out.print("Introduzca la cantidad de = que desee (lo ideal es 6 o superior y par): ");
		cantidad = in.nextInt();
		cantidadback=(cantidad/2)-1;
		cantidadback2=cantidad;
			// Primera fila
		while (cantidad>1) {
			System.out.print("=");
			cantidad=cantidad-1;
		}
		System.out.println("=");
			// MENU centrado
		while (cantidadback>1) {
			System.out.print(" ");
			cantidadback=cantidadback-1;
		}
		System.out.println("MENU");
			// Segunda fila
		while (cantidadback2>1) {
			System.out.print("=");
			cantidadback2=cantidadback2-1;
		}
		System.out.println("=");
	}
}