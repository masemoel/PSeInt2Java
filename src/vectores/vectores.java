package vectores;

import java.util.Scanner;

public class vectores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Ejercicio 9.1
		int mes;
		int [] dia = new int[13];
		dia[1] = 31;
		dia[2] = 28;
		dia[3] = 31;
		dia[4] = 30;
		dia[5] = 31;
		dia[6] = 30;
		dia[7] = 31;
		dia[8] = 31;
		dia[9] = 30;
		dia[10] = 31;
		dia[11] = 30;
		dia[12] = 31;
		System.out.print("Introduce el mes: ");
		mes = in.nextInt();
		System.out.println(mes+" tiene "+dia[mes]+" días.\n");
		
		// Ejercicio 9.2
		int [] nums = new int[5];
		for(int cont=0; cont<=4; cont++) {
			System.out.print("Introduce el "+(cont+1)+"º número: ");
			nums[cont] = in.nextInt();
		}
		System.out.println ("La media de tus 5 números es "+(nums[0]+nums[1]+nums[2]+nums[3]+nums[4])/5);
		
		// Ejercicio 9.3
		int vmax;
		vmax=0;
		for(int cont=0; cont<=4; cont++) {
			System.out.print("Introduce el "+(cont+1)+"º número: ");
			nums[cont] = in.nextInt();
			if (cont==0) {
				vmax=nums[0];
			}
			if (vmax<nums[cont]) {
				vmax=nums[cont];
			}
		}
		System.out.println ("La media de tus 5 números es "+(nums[0]+nums[1]+nums[2]+nums[3]+nums[4])/5);
		System.out.println("El valor máximo es "+vmax);
		
		// Ejercicio 9.4
		int suma;
		suma=0;
		int [] vector1 = new int[3];
		int [] vector2 = new int[3];
		for(int cont=0; cont<=2; cont++) {
			System.out.println("Introduce 3 números para el vector 1:");
			vector1[cont] = in.nextInt();
			suma=suma+vector1[cont];
		}
		for(int cont=0; cont<=2; cont++) {
			System.out.println("Introduce 3 números para el vector 1:");
			vector2[cont] = in.nextInt();
			suma=suma+vector2[cont];
		}
		System.out.println("La suma de todos los números es "+suma);
		
		// Ejercicio 9.5
		int pescalar, pescalarfinal;
		pescalar=0;
		pescalarfinal=0;
		for(int cont=0; cont<=2; cont++) {
			System.out.print("Introduce el "+(cont+1)+"º número para el vector 1: ");
			vector1[cont] = in.nextInt();
			System.out.print("Introduce el "+(cont+1)+"º número para el vector 2: ");
			vector2[cont] = in.nextInt();
			pescalar=vector1[cont]*vector2[cont];
			pescalarfinal=pescalarfinal+pescalar;
		}
		System.out.println("El producto escalar de los dos vectores es "+pescalarfinal);
		
		// Ejercicio 9.6
		int [] nums2 = new int[7];
		for(int cont=0; cont<=6; cont++) {
			System.out.print("nIntroduce el "+(cont+1)+"º número: ");
			nums2[cont] = in.nextInt();
			if (cont==0) {
				vmax=nums2[0];
			}
			if (vmax<nums2[cont]) {
				vmax=nums2[cont];
			}
		}
		System.out.println("El valor máximo es "+vmax);
		
		// Ejercicio 9.7
		int user, veces;
		veces=0;
		int [] dato = new int[10];
		dato[0]=52;
		dato[1]=67;
		dato[2]=3;
		dato[3]=52;
		dato[4]=128;
		dato[5]=3;
		dato[6]=98;
		dato[7]=47;
		dato[8]=128;
		dato[9]=256;
		System.out.print("\nIntroduce el número del dato que deseas buscar: ");
		user = in.nextInt();
		if (user >= 0 && user < 10) {
			for(int cont=0; cont<=9; cont++) {
				if (dato[cont] == dato[user]) {
					veces=veces+1;
				}
			}
			System.out.println("Dicho dato se ha encontrado "+veces+" veces.\n");
		}
		
		// Ejercicio 9.8
		int [][] nums3 = new int[10][7];
		int vmax1, vmax2;
		vmax1=0;
		vmax2=0;
		for(int cont1=0; cont1<=9; cont1++) {
			for(int cont2=0; cont2<=1; cont2++) {
				System.out.print("Introduce el "+(cont1+1)+"º número para el vector "+(cont2+1)+": ");
				nums3[cont1][cont2] = in.nextInt();
				if (cont1==0 && cont2==0) {
					vmax1=nums3[cont1][cont2];
				}
				if (cont1==0 && cont2==1) {
					vmax2=nums3[cont1][cont2];
				}
				if (vmax1 < nums3[cont1][cont2] && cont2==0) {
					vmax1=nums3[cont1][cont2];
				}
				if (vmax2 < nums3[cont1][cont2] && cont2==1) {
					vmax2=nums3[cont1][cont2];
				}
			}
		}
		System.out.println("El valor máximo del vector 1 es "+vmax1+", y el del vector 2 es "+vmax2);
	}
}