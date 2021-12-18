package cadenas;

import java.util.Scanner;

public class cadenas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useDelimiter("\n");
		// Ejercicio 11.1
		String nombre;
		System.out.print("Escriba su nombre: ");
		nombre = in.next();
		System.out.println(new StringBuilder(nombre).reverse());
		
		// Ejercicio 11.2
		System.out.print("\nEscriba su nombre: ");
		nombre = in.next();
		String may = nombre.toUpperCase();
		String min = nombre.toLowerCase();
		for(int cont=0; cont<nombre.length(); cont++) {
			if (nombre.charAt(cont) == may.charAt(cont)) {
				System.out.print(min.charAt(cont));
			} else {
				System.out.print(may.charAt(cont));
			}
		}
		
		// Ejercicio 11.3
		int vocales=0;
		System.out.print("\n\nEscriba su nombre (sin tildes): ");
		nombre = in.next();
		nombre=nombre.toLowerCase();
		for(int cont=0; cont<nombre.length(); cont++) {
			if (nombre.charAt(cont) == 'a' || nombre.charAt(cont) == 'e' || nombre.charAt(cont) == 'i' || nombre.charAt(cont) == 'o' || nombre.charAt(cont) == 'u') {
				vocales=vocales+1;
			}
		}
		System.out.println(nombre+" tiene "+vocales+" vocales.");
		
		// Ejercicio 11.4
		int conta=0;
		int conte=0;
		int conti=0;
		int conto=0;
		int contu=0;
		System.out.print("\nEscriba su nombre (sin tildes): ");
		nombre = in.next();
		for(int cont=0; cont<nombre.length(); cont++) {
			if (nombre.charAt(cont) == 'a' && conta==0) {
				conta=1;
			}
			if (nombre.charAt(cont) == 'e' && conte==0) {
				conte=1;
			}
			if (nombre.charAt(cont) == 'i' && conti==0) {
				conti=1;
			}
			if (nombre.charAt(cont) == 'o' && conto==0) {
				conto=1;
			}
			if (nombre.charAt(cont) == 'u' && contu==0) {
				contu=1;
			}
		}
		if (conta==1) {
			System.out.print("a");
		}
		if (conte==1) {
			System.out.print("e");
		}
		if (conti==1) {
			System.out.print("i");
		}
		if (conto==1) {
			System.out.print("o");
		}
		if (contu==1) {
			System.out.print("u");
		}
		
		// Ejercicio 11.5
		int pals=0;
		System.out.print("\n\nEscriba una frase: ");
		nombre = in.next();
		for(int cont=0; cont<nombre.length(); cont++) {
			if ((nombre.charAt(cont) == ' ') && (nombre.charAt(cont-1) != ' ')) {
				pals=pals+2;
			}
		}
		System.out.println("Tu frase tiene "+(pals+1)+" palabras.");
		
		// Ejercicio 11.6
		System.out.print("\nEscriba su nombre: ");
		nombre = in.next();
		may = nombre.toUpperCase();
		min = nombre.toLowerCase();
		for(int cont=0; cont<nombre.length(); cont++) {
			if ((cont==0) || (nombre.charAt(cont-1) == ' ')) {
				System.out.print(may.charAt(cont));
			} else {
				System.out.print(min.charAt(cont));
			}
		}
	}
}