package funciones;

import java.util.Scanner;

public class funciones {
	public static void EscribirCentrado1(String text) {
		for(int cont=0; cont<40-(text.length()/2); cont++) {
			System.out.print(" ");
		}
		System.out.println(text);
	}

	public static void EsMultiplo3(int num1, int num2) {
		int cuenta;
		boolean yes;
		yes=false;
		for(int cont=0; cont<=num1; cont++) {
			cuenta=num2*cont; // multiplicar números naturales por num1
			if (num1==cuenta) { // si es verdadero, significa que es múltiplo
				yes=true;
				cont=num1; // finalizar para
			}
		}
		if (yes) {
			System.out.println(num1+" es múltiplo de "+num2);
		} else {
			for(int cont=0; cont<=num2; cont++) {
				cuenta=num1*cont; // multiplicar números naturales por num2
				if (num2==cuenta) {
					yes=true;
					cont=num2;
				}
			}
			if (yes) {
				System.out.println(num2+" es múltiplo de "+num1);
			} else {
				System.out.println(num1+" y "+num2+" no son múltiplos");
			}
		}
	}

	public static void EsPar6 (int num3) {
		boolean par=false; // falso hasta que se diga lo contrario
		if (num3%2 == 0) {
			par=true;
		}
		System.out.println(par);
	}

	public static void Cubo7 (double num4) {
		num4=Math.pow(num4, 3);
		System.out.println("Su cubo es "+num4);
	}

	public static void Iniciales8 (String text2) {
		for(int cont=0; cont<=text2.length(); cont++) {
			if (cont==0 || text2.charAt(cont-1)==' ') { // escribir la inicial si en la posición anterior hubo un espacio
				System.out.print(text2.charAt(cont));
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Ejercicio 12.1
		String text; // cadena donde guardaremos el texto del usuario a centrar.
		System.out.println("Introduzca un texto:");
		text = in.next();
		EscribirCentrado1(text); // llamada al subproceso

		// Ejercicio 12.3
		int num1, num2; // variables para guardar los dos números del usuario
		System.out.println("\nIntroduzca dos números:");
		num1 = in.nextInt();
		num2 = in.nextInt();
		EsMultiplo3(num1,num2); // llamada al subproceso

		// Ejercicio 12.6
		int num3; // variable para almacenar el número del usuario
		System.out.print("\nIntroduzca un número a determinar si es par o no: ");
		num3 = in.nextInt();
		EsPar6(num3); // llamada al subproceso

		// Ejercicio 12.7
		int num4; // variable para almacenar el número del usuario
		System.out.print("\nIntroduzca un número: " );
		num4 = in.nextInt();
		Cubo7(num4); // llamada al subproceso

		// Ejercicio 12.8
		in.useDelimiter("\n");
		String text2; // variable para almacenar el nombre del usuario
		System.out.print("\nEscriba su nombre: ");
		text2 = in.next();
		Iniciales8(text2); // llamada al subproceso
	}
}