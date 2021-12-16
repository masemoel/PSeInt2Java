package bucles;

import java.util.Scanner;

public class segun {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Ejercicio 5.1
		int cifra;
		System.out.println("Introduzca un número del 1 al 7:");
		cifra = in.nextInt();
		switch (cifra) {
		case 1:
			System.out.println("El número introducido corresponde a lunes.");
			break;
		case 2:
			System.out.println("El número introducido corresponde a martes.");
			break;
		case 3:
			System.out.println("El número introducido corresponde a miércoles.");
			break;
		case 4:
			System.out.println("El número introducido corresponde a jueves.");
			break;
		case 5:
			System.out.println("El número introducido corresponde a viernes.");
			break;
		case 6:
			System.out.println("El número introducido corresponde a sábado.");
			break;
		case 7:
			System.out.println("El número introducido corresponde a domingo.");
			break;
		default:
			System.out.println("El número introducido no corresponde a ningún día; introduzca un número válido.");
			break;
		}
		
		// Ejercicio 5.2
		System.out.println("\nIntroduzca un número del 1 al 7:");
		cifra = in.nextInt();
		if (cifra==1) {
			System.out.println("El número introducido corresponde a lunes.");
		} else if (cifra==2) {
			System.out.println("El número introducido corresponde a martes.");
		} else if (cifra==3) {
			System.out.println("El número introducido corresponde a miércoles.");
		} else if (cifra==4) {
			System.out.println("El número introducido corresponde a jueves.");
		} else if (cifra==5) {
			System.out.println("El número introducido corresponde a viernes.");
		} else if (cifra==6) {
			System.out.println("El número introducido corresponde a sábado.");
		} else if (cifra==7) {
			System.out.println("El número introducido corresponde a domingo.");
		} else {
			System.out.println("El número introducido no corresponde a ningún día; introduzca un número válido.");
		}
		
		// Ejercicio 5.3
		System.out.println("\nIntroduzca un número del 1 al 12:");
		cifra = in.nextInt();
		switch (cifra) {
		case 1:
			System.out.println("El número introducido corresponde a enero.");
			break;
		case 2:
			System.out.println("El número introducido corresponde a febrero.");
			break;
		case 3:
			System.out.println("El número introducido corresponde a marzo.");
			break;
		case 4:
			System.out.println("El número introducido corresponde a abril.");
			break;
		case 5:
			System.out.println("El número introducido corresponde a mayo.");
			break;
		case 6:
			System.out.println("El número introducido corresponde a junio.");
			break;
		case 7:
			System.out.println("El número introducido corresponde a julio.");
			break;
		case 8:
			System.out.println("El número introducido corresponde a agosto.");
			break;
		case 9:
			System.out.println("El número introducido corresponde a septiembre.");
			break;
		case 10:
			System.out.println("El número introducido corresponde a octubre.");
			break;
		case 11:
			System.out.println("El número introducido corresponde a noviembre.");
			break;
		case 12:
			System.out.println("El número introducido corresponde a diciembre.");
			break;
		default:
			System.out.println("El número introducido no corresponde a ningún día; introduzca un número válido.");
			break;
		}
		
		// Ejercicio 5.4
		System.out.println("\nIntroduzca un número del 1 al 7:");
		cifra = in.nextInt();
		if (cifra==1) {
			System.out.println("El número introducido corresponde a enero.");
		} else if (cifra==2) {
			System.out.println("El número introducido corresponde a febrero.");
		} else if (cifra==3) {
			System.out.println("El número introducido corresponde a marzo.");
		} else if (cifra==4) {
			System.out.println("El número introducido corresponde a abril.");
		} else if (cifra==5) {
			System.out.println("El número introducido corresponde a mayo.");
		} else if (cifra==6) {
			System.out.println("El número introducido corresponde a junio.");
		} else if (cifra==7) {
			System.out.println("El número introducido corresponde a julio.");
		} else if (cifra==8) {
			System.out.println("El número introducido corresponde a agosto.");
		} else if (cifra==9) {
			System.out.println("El número introducido corresponde a septiembre.");
		} else if (cifra==10) {
			System.out.println("El número introducido corresponde a octubre.");
		} else if (cifra==11) {
			System.out.println("El número introducido corresponde a noviembre.");
		} else if (cifra==12) {
			System.out.println("El número introducido corresponde a diciembre.");
		} else {
			System.out.println("El número introducido no corresponde a ningún día; introduzca un número válido.");
		}
		
		// Ejercicio 5.5 (voluntario)
		int dia, mes;
		System.out.println("\nIntroduzca un día del mes:");
		dia = in.nextInt();
		System.out.println("Introduzca un mes:");
		mes = in.nextInt();
		if (dia>0 && dia<32) {
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
			default:
				System.out.println("El mes introducido no es válido.");
				break;
			}
		} else {
			System.out.println("El día introducido no es válido.");
		}
	}
}