package variables;
import java.util.Scanner;
public class variables {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Ejercicio 3.1
		int a, b, c;
		System.out.println("Introduce dos n�meros");
		a = in.nextInt();
		b = in.nextInt();
		c = a * b;
		System.out.println("El producto de "+a+" y "+b+" es "+c);
		
		// Ejercicio 3.2
		int d, e, f;
		System.out.println("\n\nIntroduce la base del rect�ngulo: ");
		d = in.nextInt();
		System.out.println("Introduce la altura del rect�ngulo: ");
		e = in.nextInt();
		f = d * e;
		System.out.println("El �rea del rect�ngulo es "+f);
		
		// Ejercicio 3.3
		double g, h, i;
		System.out.println("\n\nIntroduce el radio del c�rculo: ");
		g = in.nextInt();
		h = 3.1416;
		i = h*(Math.pow(g, 2));
		System.out.println("La superficie del c�rculo es "+i);
	}
}