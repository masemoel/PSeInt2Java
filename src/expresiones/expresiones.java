package expresiones;
public class expresiones {
	public static void main(String[] args) {
		// Ejercicio 1a
		int a,b,c;
		c=4;
		System.out.println((3*(Math.pow(2, 2))-4/2*1) > (3*(Math.pow(2, 2))*1) && (5>11 % c));
		
		// Ejercicio 1b
		a=5;
		System.out.println((3>=3 || 5!=a ) && (!(15/a+2 != 5)));
		
		// Ejercicio 1c
		System.out.println(!(!((3*(-3))*2 > (3-(-3)*2) || (Math.pow(1, 3))*2 > 6)));
		
		// Ejercicio 1d
		a=5;
		b=7;
		c=4;
		System.out.println((3 >= c && a > 3 && 3 > c-1) || (!(c <= 4 || a > 4 || 6 >= b)));
		
		// Ejercicio 2a
		int x,y,z;
		x=10;
		y=20;
		z=30;
		System.out.println(x<10 || x>10);
		
		// Ejercicio 2b
		System.out.println(x>y && y>x);
		
		// Ejercicio 2c
		System.out.println((x < y+z) && (x+10 <= 20));
		
		// Ejercicio 2d
		System.out.println(!(!(x < y+z) && (x+10 != y)));
		
		// Ejercicio 2e
		System.out.println(z-y == x && z%y == 2);
		
		// Ejercicio 2f
		System.out.println(x<10 && x>10);
		
		// Ejercicio 2g
		System.out.println(x>y || y>x);
		
		// Ejercicio 2h
		System.out.println(!(x<y+z) || (!(x+10<=20)));
		
		// Ejercicio 2i
		System.out.println(!(x==y) && (x!=y) && (x<y || y<z) || ((y % 10) == 0) && ((z & x)*4 == 30));
		
		// Ejercicio 2j
		System.out.println(!((x==y) && (x!=y) && ((x<y || y<z) || ((y % 10) == 0))) && ((z % x)*4 == 30));
		
		// Ejercicio 3a
		int d;
		a=5;
		b=2;
		c=4;
		d=5;
		System.out.println(a==5);
		
		// Ejercicio 3b
		System.out.println((b*d) == (c*c));
		
		// Ejercicio 3c
		System.out.println((d%b * c>5) || (c%b * d<7));
		
		// Ejercicio 3d
		System.out.println((d%b * c>5) && (c%b * d<7));
		
		// Ejercicio 4a
		int e;
		a=5;
		b=2;
		c=4;
		d=6;
		e=3;
		System.out.println(a>5);
		
		// Ejercicio 4b
		System.out.println(a!=5);
		
		// Ejercicio 4c
		System.out.println((d%b) == (c%b));
		
		// Ejercicio 4d
		System.out.println((a*c) != (d*b));
		
		// Ejercicio 4e
		System.out.println((d*b) == (c*e));
		
		// Ejercicio 4f
		System.out.println((a*b) < ((a%b) * c));
		
		// Ejercicio 4g
		System.out.println(((c%b)*a) == ((b%c)*a));
		
		// Ejercicio 4h
		System.out.println(((b%c)*a) != (a*b));
		
		// Ejercicio 4i
		System.out.println(((d%b)*c > 5) || ((c%b)*d < 7));
	}
}