package ar.edu.unlu.poo;

import java.util.Scanner;

public class QuintaClase {
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Dame 3 numeros enteros A, B y C: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if ((a >= b) && (a >= c)) {
			System.out.println("A es el numero mayor: " + a);
		} else if (b >= c) {
			System.out.println("B es el numero mayor: " + b);
		} else {
			System.out.println("C es el numero mayor: " + c);
		}
		sc.nextLine();
		String opcion;
		System.out.println("Quiere probar de nuevo ? (S/N)");
		opcion = sc.nextLine();
		if ( (opcion.equals("s")) || (opcion.equals("S")) ) {	
			System.out.println("Quiere volver a intentar");
		} else {
			System.out.println("Quiere salir");
		}	
		
	}			
}
