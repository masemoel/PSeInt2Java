package condicionales;

import java.util.Scanner;

public class condicionales {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Ejercicio 4.1
		int a,b;
		System.out.println("\nIntroduzca dos números");
		a = in.nextInt();
		b = in.nextInt();
		if (a==b) {
			System.out.println(a+" y "+b+" son iguales.");
		} else {
				System.out.println(a+" y "+b+" no son iguales.");
		}
		
		// Ejercicio 4.2
		System.out.println("\nIntroduzca un número:");
		a = in.nextInt();
		if (a>=0) {
			System.out.println(a+" es mayor o igual que 0.");
		} else {
				System.out.println(a+" es menor que 0.");
		}
		
		// Ejercicio 4.3
		System.out.println("\nIntroduzca un número:");
		a = in.nextInt();
		if (a==0) {
			System.out.println(a+" es igual que 0.");
		} else if (a>0){
				System.out.println(a+" es mayor que 0.");
			}
			else {
				System.out.println(a+" es menor que 0.");
		}
		
		// Ejercicio 4.4
		System.out.println("\nIntroduzca dos números");
		a = in.nextInt();
		b = in.nextInt();
		if (a>=0 && b>=0) {
			System.out.println(a+ " y "+b+" son positivos.");
		} else if (a>=0 || b>=0) {
				if (a>=0) {
					System.out.println(a+ " es el único número positivo.");
				} else {
					System.out.println(b+ " es el único número positivo.");
				}
			} else {
				System.out.println(a+ " y "+b+" no son positivos.");
		}
		
		// Ejercicio 4.5
		System.out.println("\nIntroduzca dos números");
		a = in.nextInt();
		b = in.nextInt();
		if (b!=0) {
			System.out.println("El resultado de la división es "+a/b+", y su resto es "+a%b);
		} else {
			System.out.println("No se puede dividir entre 0.");
		}
		
		// Ejercicio 4.6
		int c;
		System.out.println("\nIntroduzca tres números");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if (a>b && a>c) {
			System.out.println(a+ " es el número mayor.");
		} else if (b>c) {
			System.out.println(b+ " es el número mayor.");
			} else {
				System.out.println(c+ " es el número mayor.");
		}
		
		// Ejercicio 4.7 (voluntario)
		float peso, estatura;
		double imc;
		System.out.println("\nIntroduzca su estatura (metros, usa coma para el decimal):");
		estatura = in.nextFloat();
		System.out.println("Introduzca su peso (kilogramos):");
		peso = in.nextFloat();
		imc=peso/(Math.pow(estatura, 2));
		System.out.println("Su IMC es "+imc);
		if (imc<18.5) {
			System.out.println("Su peso es inferior al normal.");
		} else if (imc>=18.5 && imc<25) {
			System.out.println("Su peso es normal.");
		} else if (a>=0) {
					System.out.println("Su peso es superior al normal.");
		} else {
				System.out.println("Su peso es obeso.");
		}
	}
}