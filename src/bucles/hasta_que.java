package bucles;

import java.util.Scanner;

public class hasta_que {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Ejercicio 7.1
		int codigo,contrasena;
		do {
			System.out.print("Introduzca su c�digo de usuario: ");
			codigo = in.nextInt();
			if (codigo!=1) {
				System.out.println("C�digo de usuario incorrecto...");
			}
		} while(codigo!=1);
		do {
			System.out.print("Introduzca su contrase�a: ");
			contrasena = in.nextInt();
			if (contrasena!=1234) {
				System.out.println("Contrase�a incorrecta...");
			}
		} while(contrasena!=1234);
		System.out.println("�Bienvenido!");
		
		// Ejercicio 7.2
		int a,b;
		System.out.println("\nIntroduzca dos n�meros: ");
		a = in.nextInt();
		b = in.nextInt();
		do {
			System.out.println("La suma de "+a+" y "+b+" es "+(a+b));
			System.out.println("A continuaci�n, introduzca otros dos n�meros (para finalizar, introduzca dos ceros)");
			a = in.nextInt();
			b = in.nextInt();
		} while((a!=0) || (b!=0));
		
		// Ejercicio 7.3
		System.out.println("\nIntroduzca dos n�meros: ");
		a = in.nextInt();
		b = in.nextInt();
		do {
			if (b==0) {
				do {
					System.out.print(b+" no es un n�mero v�lido para dividir. Introduce otro n�mero...");
					b = in.nextInt();
				} while(b==0);
			}
			System.out.println("La divisi�n de "+a+" y "+b+" es "+(a/b));
			System.out.println("A continuaci�n, introduzca otros dos n�meros (para finalizar, introduzca dos ceros)");
			a = in.nextInt();
			b = in.nextInt();
		} while((a!=0) || (b!=0));
	}
}