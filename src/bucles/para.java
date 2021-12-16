package bucles;

import java.util.Scanner;

public class para {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Ejercicio 8.1
		for(int a=5; a<=15; a++) {
			System.out.println(a);
		}
		System.out.print("\n");
		
		// Ejercicio 8.2
		for(int a=3; a<=30; a+=3) {
			System.out.println(a);
		}
		System.out.print("\n");
		
		// Ejercicio 8.3
		for(int a=1; a<=10; a++) {
			System.out.println(a*3);
		}
		System.out.print("\n");
		
		// Ejercicio 8.4
		for(int a=20; a>=10; a-=1) {
			System.out.println(a);
		}
		System.out.print("\n");
		
		// Ejercicio 8.5
		int b;
		b=0;
		for(int a=0; a<=50; a+=5) {
			System.out.println("5x"+b+" = "+a);
			b=b+1;
		}
		System.out.print("\n");
		
		// Ejercicio 8.6
		int a;
		a=1;
		while (a<16) {
			System.out.println(a);
			a=a+1;
		}
		
		// Ejercicio 8.7 (voluntario)
		int c,cont;
		System.out.print("\nIndica el lado del cuadrado: ");
		a = in.nextInt();
		c=a-2;
		for(b=1; b<=a; b++) {
			if (b==1 || b==a) {
				cont=0;
				do {
					System.out.print("*");
					cont=cont+1;
				} while (cont!=a-1);
				System.out.println("*");
			} else {
				System.out.print("*");
				cont=0;
				do {
					System.out.print(" ");
					cont=cont+1;
				} while (cont!=c);
				System.out.println("*");
			}
		}
		
		// Ejercicio 8.8 (voluntario)
		System.out.print("\nIndica el número de filas de * que deseas: ");
		a = in.nextInt();
		for(b=1; b<=a; b++) {
			if (b>1) {
				cont=1;
				do {
					cont=cont+1;
					System.out.print("*");
				} while (cont!=b);
			}
			System.out.println("*");
		}
	}
}